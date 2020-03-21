package jp.techacademy.katsuyoshi.matsubara.kotlinlog

import android.util.Log

open class Dog: Animal {
    constructor(name: String, age: Int): super(name, age){
    }

    override open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}