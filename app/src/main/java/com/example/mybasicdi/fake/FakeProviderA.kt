package com.example.mybasicdi.fake

import com.example.mybasicdi.real.A
import dagger.Module
import dagger.Provides

@Module
class FakeProviderA {

    @Provides
    fun providesFakeA() : A {
        return FakeA()
    }

}