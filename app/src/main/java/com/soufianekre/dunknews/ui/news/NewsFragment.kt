package com.soufianekre.dunknews.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.soufianekre.dunknews.databinding.FragmentNewsBinding
import com.soufianekre.dunknews.ui.base.BaseFragment

public class NewsFragment(val newType :String) : BaseFragment(),NewsMvp.View{

    lateinit var mPresenter : NewsPresenter<NewsMvp.View>
    private lateinit var viewBinding : FragmentNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentNewsBinding.inflate(inflater,container,false)
        mPresenter = NewsPresenter()
        mPresenter.onAttach(this)
        return viewBinding.newsRecyclerView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onStart() {
        super.onStart()

    }
    override fun onResume() {
        super.onResume()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    fun showNews(){

    }


}