package com.example.mybasicdi

import com.example.mybasicdi.real.RealProviderA
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBindingModule {

    @ContributesAndroidInjector(modules = [RealProviderA::class])
    abstract fun mainAct(): MainActivity

}