package com.example.myapplication

import android.annotation.SuppressLint
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView  =findViewById(R.id.textView)
        imageView =findViewById(R.id.imageView)

        //получение данных по ключу
        val num1=intent.getStringExtra("key_num1")
        val num2=intent.getStringExtra("key_num2")
       val numConvert1:Int= num1!!.toInt()
        if(num2=="0"){
            imageView.setBackgroundResource(R.drawable._614529163_66_p_krasnii_krug_na_belom_fone_69);
            textView.text="круг"
            Toast.makeText(this, "П"+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }
        if(num2=="1"){
            imageView.setBackgroundResource(R.drawable.milano_odnotonnoe_mlg_026);
            textView.text="квадрат"
            Toast.makeText(this, ""+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }
        if(num2=="2"){
            imageView.setBackgroundResource(R.drawable._20013_c4_xy);
            textView.text="треугольник"
            Toast.makeText(this, ""+numConvert1*numConvert1, Toast.LENGTH_LONG).show();
        }



    }
}