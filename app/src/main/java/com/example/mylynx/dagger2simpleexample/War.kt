package com.example.mylynx.dagger2simpleexample

import javax.inject.Inject

/**
 * Created by mylynx on 21.05.18.
 */
class War {
    var starks: Starks
    var boltons: Boltons

    @Inject
    constructor(starks: Starks, boltons: Boltons) {
        this.starks = starks
        this.boltons = boltons
    }

    fun prepare() {
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report() {
        starks.reportForWar()
        boltons.reportForWar()
    }
}