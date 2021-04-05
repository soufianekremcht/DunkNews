package com.soufianekre.dunknews.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import es.dmoral.toasty.Toasty

abstract class BaseFragment : Fragment(),BaseMvp.View {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }




    override fun showError(msg :String){
        Toasty.error(requireActivity(),msg, Toasty.LENGTH_SHORT).show()
    }
    override fun showInfo(msg:String){
        Toasty.error(requireActivity(),msg, Toasty.LENGTH_SHORT).show()


    }
    override fun showSuccess(msg:String){
        Toasty.error(requireActivity(),msg, Toasty.LENGTH_SHORT).show()


    }

}
