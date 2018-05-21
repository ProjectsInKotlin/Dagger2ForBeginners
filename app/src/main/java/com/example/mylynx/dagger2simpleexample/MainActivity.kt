package com.example.mylynx.dagger2simpleexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Manual DI
//        val starks = Starks()
//        val boltons = Boltons()
//
//        val war = War(starks, boltons)
//        war.prepare()
//        war.report()

        val component: BattleComponent = DaggerBattleComponent.create()
        val war = component.getWar()
        war.prepare()
        war.report()

        //playground
        val whiteWalkers = component.getWhiteWalkers()
        whiteWalkers.invade()
    }
}
