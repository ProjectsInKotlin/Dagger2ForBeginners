package com.example.mylynx.dagger2simpleexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by mylynx on 21.05.18.
 */


class Starks @Inject constructor(): House {
    override fun prepareForWar() {
        Log.d("message",this.javaClass.simpleName + " prepared for war")
    }

    override fun reportForWar() {
        Log.d("message", this.javaClass.getSimpleName()+" reporting..")
    }

}