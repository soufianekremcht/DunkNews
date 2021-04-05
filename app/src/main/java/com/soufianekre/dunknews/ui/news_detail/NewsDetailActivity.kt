package com.soufianekre.dunknews.ui.news_detail

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.soufianekre.dunknews.databinding.ActivityNewsDetailsBinding
import com.soufianekre.dunknews.ui.base.BaseActivity

class NewsDetailActivity : BaseActivity(){

    lateinit var viewBinding : ActivityNewsDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityNewsDetailsBinding.inflate(layoutInflater)
        setSupportActionBar(viewBinding.newsDetailsToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupUI()

    }

    private fun setupUI(){

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }


}