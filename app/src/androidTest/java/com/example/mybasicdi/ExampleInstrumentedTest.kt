package com.example.mybasicdi

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule var rule = ActivityTestRule(MainActivity::class.java, false, false)


    @Test
    fun useAppContext() {
        // Context of the app under test.
        rule.launchActivity(null)

        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    }
}