package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var onNum:Int = 0
    var twNum:Int = 0
    var thNum:Int = 0
    var foNum:Int = 0
    var fiNum:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            val on:String = editTextTextPersonName2.text.toString()
            val tw:String = editTextTextPersonName7.text.toString()
            val th:String = editTextTextPersonName8.text.toString()
            val fo:String = editTextTextPersonName9.text.toString()
            val fi:String = editTextTextPersonName10.text.toString()

            onNum = on.toInt()
            twNum = tw.toInt()
            thNum = th.toInt()
            foNum = fo.toInt()
            fiNum = fi.toInt()

            var result = onNum + twNum + thNum + foNum + fiNum
            TextView.setText("결과 : ${result}")
        }
    }
}