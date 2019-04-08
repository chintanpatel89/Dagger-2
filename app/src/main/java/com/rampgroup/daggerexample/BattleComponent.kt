package com.rampgroup.daggerexample

import dagger.Component

@Component(modules = [BraavosModule::class])
interface BattleComponent
{
    fun getWar():War

    fun getCash(): Cash

    fun getSoldiers(): Soldiers
}