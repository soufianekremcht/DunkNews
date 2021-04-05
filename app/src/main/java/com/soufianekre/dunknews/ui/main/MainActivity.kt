
package com.soufianekre.dunknews.ui.main

import android.R.id.tabs
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.tabs.TabLayout
import com.soufianekre.dunknews.R
import com.soufianekre.dunknews.data.models.FragmentPagerAdapterModel
import com.soufianekre.dunknews.databinding.ActivityMainBinding
import com.soufianekre.dunknews.ui.base.BaseActivity


class MainActivity : BaseActivity(),MainMvp.View{

    lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setupUI();
    }


    override fun onResume() {
        super.onResume()
    }


    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return false
    }

    private fun setupUI(){

        setSupportActionBar(viewBinding.newsToolbar)

        val actionBarDrawerToggle = ActionBarDrawerToggle(this,viewBinding.newsDrawerLayout,
            viewBinding.newsToolbar,
            R.string.open,
            R.string.close)

        actionBarDrawerToggle.syncState()

        viewBinding.newsNavView.setNavigationItemSelectedListener(this)

        viewBinding.newsViewPager.adapter = NewsViewPagerAdapter(
            this,
            FragmentPagerAdapterModel.buildForNews(this)
        )

        viewBinding.newsTabs.setupWithViewPager(viewBinding.newsViewPager)
        viewBinding.newsTabs.addOnTabSelectedListener(object :
            TabLayout.ViewPagerOnTabSelectedListener(viewBinding.newsViewPager){
            override fun onTabSelected(tab: TabLayout.Tab) {
                super.onTabSelected(tab)
            }
        })
    }

}