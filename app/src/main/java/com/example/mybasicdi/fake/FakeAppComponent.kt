package com.example.mybasicdi.fake

import com.example.mybasicdi.ActivitiesBindingModule
import com.example.mybasicdi.DemoApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ActivitiesBindingModule::class])
interface FakeAppComponent : AndroidInjector<DemoApplication>