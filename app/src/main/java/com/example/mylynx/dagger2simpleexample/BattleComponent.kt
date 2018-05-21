package com.example.mylynx.dagger2simpleexample

import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Cash
import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Soldiers
import dagger.Component

/**
 * Created by mylynx on 21.05.18.
 */
@Component(modules = arrayOf(BraavosModule::class))
interface BattleComponent {
    fun getWar(): War
    fun getStarks(): Starks
    fun getBoltons(): Boltons
    fun getWhiteWalkers(): WhiteWalkers
    fun getCash(): Cash
    fun getSoldiers(): Soldiers
}