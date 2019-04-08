package com.rampgroup.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class BraavosModule @Inject constructor(var cash: Cash, var soldiers: Soldiers)
{
    @Provides
    fun provideCash(): Cash
    {
        return cash
    }

    @Provides
    fun provideSoldiers(): Soldiers
    {
        return soldiers
    }
}