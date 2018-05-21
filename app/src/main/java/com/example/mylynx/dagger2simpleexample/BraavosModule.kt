package com.example.mylynx.dagger2simpleexample

import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Cash
import com.example.mylynx.dagger2simpleexample.ForBraavosModule.Soldiers
import dagger.Module
import dagger.Provides

/**
 * Created by mylynx on 21.05.18.
 */

@Module
class BraavosModule {
    var cash: Cash
    var soldiers: Soldiers

    constructor(cash: Cash, soldiers: Soldiers) {
        this.cash = cash
        this.soldiers = soldiers
    }

    @Provides //Provides cash dependency
    fun provideCash(): Cash {
        return cash
    }

    @Provides //provides soldiers dependency
    fun provideSoldiers(): Soldiers {
        return soldiers
    }
}