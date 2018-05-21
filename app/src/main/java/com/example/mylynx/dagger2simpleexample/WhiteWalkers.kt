package com.example.mylynx.dagger2simpleexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by mylynx on 21.05.18.
 */
class WhiteWalkers @Inject constructor() {

    fun invade() {
        Log.d("message", this.javaClass.simpleName + " invaded Westeros")
    }

}