package com.rampgroup.daggerexample

import android.util.Log
import javax.inject.Inject

class Boltons @Inject constructor() : House
{
    override fun prepareForWar() {
        Log.d("Boltons",this.javaClass.name+" Prepared for war.")
    }

    override fun reportForWar() {
        Log.d("Boltons",this.javaClass.name+" Reporting...")
    }
}