package com.example.mybasicdi

import com.example.mybasicdi.fake.DaggerFakeAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

open class TestAppComponent : DemoApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerFakeAppComponent.builder().build()
    }
}