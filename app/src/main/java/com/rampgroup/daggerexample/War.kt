package com.rampgroup.daggerexample

import javax.inject.Inject

class War @Inject constructor(var starks: Starks, var boltons: Boltons) {

    fun prepare()
    {
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report()
    {
        starks.reportForWar()
        boltons.reportForWar()
    }
}