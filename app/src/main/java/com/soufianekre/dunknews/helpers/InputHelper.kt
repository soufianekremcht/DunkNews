package com.soufianekre.dunknews.helpers

import android.text.TextUtils
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.google.android.material.textfield.TextInputLayout


object InputHelper {
    const val SPACE = "\u202F\u202F"
    private fun isWhiteSpaces(@Nullable s: String?): Boolean {
        return s != null && s.matches(Regex("\\s+"))
    }

    fun isEmpty(@Nullable text: String?): Boolean {
        return text == null || TextUtils.isEmpty(text) || isWhiteSpaces(text) || text.equals(
            "null",
            ignoreCase = true
        )
    }

    fun isEmpty(@Nullable text: Any?): Boolean {
        return text == null || isEmpty(text.toString())
    }

    fun isEmpty(@Nullable text: EditText?): Boolean {
        return text == null || isEmpty(text.text.toString())
    }

    fun isEmpty(@Nullable text: TextView?): Boolean {
        return text == null || isEmpty(text.text.toString())
    }

    fun isEmpty(@Nullable txt: TextInputLayout?): Boolean {
        return txt == null || isEmpty(txt.editText)
    }

    fun toString(@NonNull editText: EditText?): String {
        return editText!!.text.toString()
    }

    fun toString(@NonNull editText: TextView): String {
        return editText.text.toString()
    }

    fun toString(@NonNull textInputLayout: TextInputLayout): String {
        return if (textInputLayout.editText != null)
            textInputLayout.editText.toString() else ""
    }

    @NonNull
    fun toNA(@Nullable value: String?): String {
        return if (isEmpty(value)) "N/A" else value!!
    }

    @NonNull
    fun toString(@Nullable `object`: Any): String {
        return if (!isEmpty(`object`)) `object`.toString() else ""
    }

    fun toLong(@NonNull textView: TextView): Long {
        return toLong(toString(textView))
    }

    fun toLong(@NonNull text: String): Long {
        if (!isEmpty(text)) {
            try {
                return text.replace("[^0-9]".toRegex(), "").toLong()
            } catch (ignored: NumberFormatException) {
            }
        }
        return 0
    }

    fun getSafeIntId(id: Long): Int {
        return if (id > Int.MAX_VALUE) (id - Int.MAX_VALUE).toInt() else id.toInt()
    }

    fun capitalizeFirstLetter(s: String): String {
        if (isEmpty(s)) {
            return ""
        }
        val first = s[0]
        return if (Character.isUpperCase(first)) {
            s
        } else {
            Character.toUpperCase(first).toString() + s.substring(1)
        }
    }
}


