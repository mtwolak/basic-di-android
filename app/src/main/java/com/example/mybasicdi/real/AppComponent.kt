package com.example.mybasicdi.real

import com.example.mybasicdi.ActivitiesBindingModule
import com.example.mybasicdi.DemoApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ActivitiesBindingModule::class])
interface AppComponent : AndroidInjector<DemoApplication>