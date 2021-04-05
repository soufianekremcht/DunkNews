package com.soufianekre.dunknews.data.prefs

import androidx.annotation.NonNull
import androidx.annotation.Nullable


interface PreferencesHelper {
    fun <T> set(@NonNull key: String?, @Nullable value: T)
    fun getString(@NonNull key: String?, def: String?): String?
    fun getInt(@NonNull key: String?, def: Int): Int
    fun getLong(@NonNull key: String?): Long
    fun getBoolean(@NonNull key: String?, def: Boolean): Boolean
    fun getFloat(@NonNull key: String?): Float
    fun isExist(@NonNull key: String?): Boolean
    fun clearKey(@NonNull key: String?)
    val all: Map<String?, *>?
}
