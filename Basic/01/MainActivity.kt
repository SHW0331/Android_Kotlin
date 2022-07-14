package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button4.setOnClickListener{
            val input = editTextTextPersonName3.text.toString()
            textView6.setText("입력한 값: ${input}")
        }

        button5.setOnClickListener {
            val input = editTextTextPersonName5.text.toString()
            textView6.setText("입력한 값: ${input}")
        }
    }
}