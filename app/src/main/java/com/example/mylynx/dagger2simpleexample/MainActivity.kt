package com.example.mylynx.dagger2simpleexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Cash
import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Soldiers

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

        val cash = Cash()
        val soldiers = Soldiers()

        val component: BattleComponent = DaggerBattleComponent.builder().braavosModule(BraavosModule(cash, soldiers)).build()
        val war = component.getWar()
        war.prepare()
        war.report()

        component.getCash()
        component.getSoldiers()


        //playground
        val whiteWalkers = component.getWhiteWalkers()
        whiteWalkers.invade()
    }
}
