package com.rampgroup.daggerexample

import android.util.Log
import javax.inject.Inject

class Starks @Inject constructor() : House
{
    override fun prepareForWar() {
        Log.d("Starks",this.javaClass.name+" Prepared for war.")
    }

    override fun reportForWar() {
        Log.d("Starks",this.javaClass.name+" Reporting...")
    }
}