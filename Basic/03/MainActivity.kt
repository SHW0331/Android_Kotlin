package com.example.test

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val a = 10
            val b = 20
            var max: Int

            if(a>b) {
                max = a
            } else {
                max = b
            }

            max = if(a > b ) a else b

            max = if(a > b) {
                textView.setText("a를 선택합니다.")
                a
            } else {
                textView.setText("b를 선택합니다.")
                b
            }

        }
    }
}