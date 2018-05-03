package com.shiveenpandita.nextdrinin.nextdrinkin

import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayCountDownTimer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_count_down_timer)
        val textView = findViewById<TextView>(R.id.timerText)
        object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textView.text = "seconds remaining: " + millisUntilFinished / 1000
            }

            override fun onFinish() {
                textView.text = "done!"
            }
        }.start()
    }
}
