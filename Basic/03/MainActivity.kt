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
            getFirst();
            getSecond();
            val result = add(getFirst(), getSecond())
            show(result)
        }

        button4.setOnClickListener {
            getFirst();
            getSecond();
            val result = sub(getFirst(), getSecond())
            show(result)
        }

        button5.setOnClickListener {
            getFirst();
            getSecond();
            val result = mul(getFirst(), getSecond())
            show(result)
        }

        button6.setOnClickListener {
            getFirst();
            getSecond();
            val result = div(getFirst(), getSecond())
            show(result)
        }
    }

    fun getFirst():Int {
        val firstStr = editTextTextPersonName3.text.toString().trim()
        val first = firstStr.toInt()

        return first
    }

    fun getSecond():Int {
        val secondStr = editTextTextPersonName2.text.toString().trim()
        val second = secondStr.toInt()

        return second
    }

    fun show(result:Int) {
        textView.setText("결과 : ${result}")
    }

    fun add(a:Int, b:Int):Int {
        return a + b
    }

    fun sub(a:Int, b:Int):Int {
        return a - b
    }

    fun mul(a:Int, b:Int):Int {
        return a * b
    }

    fun div(a:Int, b:Int):Int {
        return a / b
    }
}