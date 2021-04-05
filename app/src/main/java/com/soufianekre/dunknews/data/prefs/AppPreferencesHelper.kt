package com.soufianekre.dunknews.data.prefs

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.soufianekre.dunknews.helpers.InputHelper.isEmpty


public class AppPreferencesHelper(context: Context, prefFileName: String?) : PreferencesHelper {



    override fun <T> set(key: String?, value: T) {
        if (isEmpty(key)) {
            throw NullPointerException("Key must not be null! (key = $key), (value = $value)")
        }
        val edit = mPrefs!!.edit()
        if (isEmpty(value)) {
            clearKey(key)
            return
        }
        if (value is String) {
            edit.putString(key, value as String)
        } else if (value is Int) {
            edit.putInt(key, (value as Int))
        } else if (value is Long) {
            edit.putLong(key, (value as Long))
        } else if (value is Boolean) {
            edit.putBoolean(key, (value as Boolean))
        } else if (value is Float) {
            edit.putFloat(key, (value as Float))
        } else {
            edit.putString(key, value.toString())
        }
        edit.apply() //apply on UI
    }


    @Nullable
    override fun getString(@NonNull key: String?, defaults: String?): String? {
        return mPrefs!!.getString(key, defaults)
    }

    override fun getBoolean(@NonNull key: String?, def: Boolean): Boolean {
        return mPrefs!!.getBoolean(key, def)
    }

    override fun getInt(@NonNull key: String?, def: Int): Int {
        return mPrefs!!.getInt(key, def)
    }

    override fun getLong(@NonNull key: String?): Long {
        return mPrefs!!.getLong(key, 0)
    }

    override fun getFloat(@NonNull key: String?): Float {
        return mPrefs!!.getFloat(key, 0f)
    }

    override fun clearKey(@NonNull key: String?) {
        mPrefs!!.edit().remove(key).apply()
    }

    override fun isExist(@NonNull key: String?): Boolean {
        return mPrefs!!.contains(key)
    }

    fun clearPrefs() {
        mPrefs!!.edit().clear().apply()
    }

    override val all: Map<String?, *>?
        get() = mPrefs!!.all

    companion object {
        private var mPrefs: SharedPreferences? = null
    }

    init {
        mPrefs =
            context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)
    }
}
