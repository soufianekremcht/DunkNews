package com.soufianekre.dunknews.ui.base

import androidx.appcompat.app.AppCompatActivity
import es.dmoral.toasty.Toasty

abstract class BaseActivity :AppCompatActivity(),BaseMvp.View{


    override fun showError(msg :String){
        Toasty.error(this,msg,Toasty.LENGTH_SHORT).show()
    }
    override fun showInfo(msg:String){
        Toasty.error(this,msg,Toasty.LENGTH_SHORT).show()


    }
    override fun showSuccess(msg:String){
        Toasty.error(this,msg,Toasty.LENGTH_SHORT).show()


    }

}