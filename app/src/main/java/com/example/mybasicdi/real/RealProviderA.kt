package com.example.mybasicdi.real

import com.example.mybasicdi.real.A
import dagger.Module
import dagger.Provides

@Module
class RealProviderA {

    @Provides
    fun provide() : A {
        return A()
    }

}