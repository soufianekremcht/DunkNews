package com.soufianekre.dunknews.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.soufianekre.dunknews.data.models.FragmentPagerAdapterModel

public class NewsViewPagerAdapter(activity: AppCompatActivity,fragmentList : List<FragmentPagerAdapterModel>) :
    FragmentStatePagerAdapter(activity.supportFragmentManager
    ,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    private var fragmentModels : ArrayList<FragmentPagerAdapterModel> = ArrayList()

    init {
        fragmentModels.addAll(fragmentList)
    }


    override fun getItem(position: Int): Fragment {
        return fragmentModels[0].getFragment()
    }

    override fun getCount(): Int {
        return fragmentModels.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentModels[position].title
    }

    override fun getPageWidth(position: Int): Float {
        return super.getPageWidth(position)
    }

    fun remove(model: FragmentPagerAdapterModel?) {
        fragmentModels.remove(model)
        notifyDataSetChanged()
    }

    fun remove(position: Int) {
        fragmentModels.removeAt(position)
        notifyDataSetChanged()
    }
}