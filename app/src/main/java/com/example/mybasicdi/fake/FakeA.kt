package com.example.mybasicdi.fake

import com.example.mybasicdi.real.A

class FakeA : A() {

    override fun sayHello(): String {
        return "fake hello"
    }

}