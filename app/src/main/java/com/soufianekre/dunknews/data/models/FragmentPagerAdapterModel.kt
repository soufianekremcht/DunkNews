package com.soufianekre.dunknews.data.models

import android.content.Context
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import com.soufianekre.dunknews.R
import com.soufianekre.dunknews.ui.news.NewsFragment
import java.util.*
import java.util.stream.Collectors
import java.util.stream.Stream


class FragmentPagerAdapterModel(
    var title: String,
    fragment: Fragment,
    key: String?) {

    private var fragment: Fragment
    var key: String?

    private constructor(title: String, fragment: Fragment) : this(title, fragment, null) {}


    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as FragmentPagerAdapterModel
        return Objects.equals(key, that.key)
    }

    override fun hashCode(): Int {
        return if (key != null) key.hashCode() else 0
    }

    fun getFragment(): Fragment {
        return fragment
    }

    fun setFragment(fragment: Fragment) {
        this.fragment = fragment
    }

    companion object {
        @NonNull
        fun buildForNews(@NonNull context: Context): List<FragmentPagerAdapterModel> {
            return arrayListOf(
                FragmentPagerAdapterModel(
                    context.getString(R.string.politics),
                    NewsFragment("politics")
                ),
                FragmentPagerAdapterModel(
                    context.getString(R.string.economy),
                    NewsFragment("economy")
                ),
                FragmentPagerAdapterModel(
                    context.getString(R.string.sport),
                    NewsFragment("sport")
                ),
                FragmentPagerAdapterModel(
                    context.getString(R.string.society),
                    NewsFragment("society")
                ),
                FragmentPagerAdapterModel(
                    context.getString(R.string.culture),
                    NewsFragment("culture")
                )

            )
        }

    }

    init {
        this.fragment = fragment
        this.key = key
    }
}
