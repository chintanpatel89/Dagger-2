package com.rampgroup.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity()
{
    lateinit var component: BattleComponent
    lateinit var war: War

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cash = Cash()
        val soldiers = Soldiers()

        component = DaggerBattleComponent.builder().braavosModule(BraavosModule(cash, soldiers)).build()

        //component = DaggerBattleComponent.create()
        war = component.getWar()
        war.prepare()
        war.report()

        component.getCash()
        component.getSoldiers()
    }
}
