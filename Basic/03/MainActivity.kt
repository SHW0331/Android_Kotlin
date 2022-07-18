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
            val addFunc = {a:Int, b:Int -> a + b}
            val result = addFunc(10, 10)

            textView.setText("더하기 결과 : ${result}")
        }

        button3.setOnClickListener {
            val addFunc = {a:Int, b:Int -> a + b}
            val result = calc(30, 10, addFunc)

            textView.setText("더하기 결과 : ${result}")
        }

        button5.setOnClickListener {
            val oper = getOperator("subtract")
            if(oper != null) {
                val result = calc(30, 10, oper)
                textView.setText("빼기 결과 : ${result}")
            }
        }

        button6.setOnClickListener {
            val multiply1 = {a:Int, b:Int -> a * b}
            val multiply2:(Int, Int) -> Int = {a:Int, b:Int -> a * b}
            val multiply3:(Int, Int) -> Int = {a, b -> a * b}

            val output1 = calc(30, 10, multiply3)
            textView.setText("곱하기 결과 : ${output1}")
            
            val show1 = {println("한 줄 출력")}
            val show2:()->Unit = {println("한 줄 출력")}
        }
    }

    fun calc(first:Int, second:Int, oper:(Int, Int) -> Int):Int {
        return oper(first, second)
    }

    fun getOperator(name: String): ((Int,Int) -> Int)? {
        var oper:((Int, Int)->Int)? = null
        if (name == "add") {
            oper = {a, b -> a +b}
        } else if (name == "subtract") {
            oper = {a, b -> a - b}
        }

        return oper
    }
}