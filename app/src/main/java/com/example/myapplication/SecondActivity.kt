package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        //получение данных по ключу
        val num1=intent.getStringExtra("key_num1")
        val num2=intent.getStringExtra("key_num2")
       val numConvert1:Int= num1!!.toInt()
        if(num2=="0"){
            textView.text="круг"
            Toast.makeText(this, "П"+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }
        if(num2=="1"){
            textView.text="квадрат"
            Toast.makeText(this, ""+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }
        if(num2=="2"){
            textView.text="треугольник"
            Toast.makeText(this, ""+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }



    }
}