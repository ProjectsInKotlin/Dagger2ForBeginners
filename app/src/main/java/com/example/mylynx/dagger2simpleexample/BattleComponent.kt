package com.example.mylynx.dagger2simpleexample

import dagger.Component

/**
 * Created by mylynx on 21.05.18.
 */
@Component
interface BattleComponent {
    fun getWar(): War
    fun getStarks(): Starks
    fun getBoltons(): Boltons
    fun getWhiteWalkers(): WhiteWalkers
}