package jp.techacademy.katsuyoshi.matsubara.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)
        dog.say()
        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()
    }
        private fun total(last: Int) {
            var sum = 0
            for (i in 1..last) {
                sum += i
            }

            Log.d("kotlintest", sum.toString())
        }


}
