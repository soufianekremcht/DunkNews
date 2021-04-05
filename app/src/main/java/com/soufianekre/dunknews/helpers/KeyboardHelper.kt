package com.soufianekre.dunknews.helpers

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


object KeyboardHelper {
    fun hideSoftInput(activity: Activity) {
        var view: View? = activity.currentFocus
        if (view == null) view = View(activity)
        val imm: InputMethodManager = activity
            .getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun showSoftInput(context: Context, edit: View) {
        if (edit.requestFocus()) {
            edit.isFocusable = true
            edit.isFocusableInTouchMode = true
            edit.requestFocus()
            val imm: InputMethodManager = context
                .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(edit, 0)
        }
    }

    fun toggleSoftInput(context: Context) {
        val imm: InputMethodManager = context
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
    }
}
