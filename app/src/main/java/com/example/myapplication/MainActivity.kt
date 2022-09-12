package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var mainbutton: Button
    private lateinit var numebr1: EditText
    private lateinit var checkBoxTriangle: CheckBox
    private lateinit var checkBoxSquare: CheckBox
    private lateinit var checkBoxCircle: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainbutton = findViewById(R.id.mainbutton)
        numebr1 = findViewById(R.id.number1ID)
        //инициализаиция кнопки
        mainbutton = findViewById(R.id.mainbutton)
        checkBoxTriangle = findViewById(R.id.checkBoxTriangle)
        //инициализаиция чек бокса 2
        checkBoxSquare = findViewById(R.id.checkBoxSquare)
        //инициализаиция чек бокса 1
        checkBoxCircle = findViewById(R.id.checkBoxCircle)
        //обработчик нажатия кнопки
        mainbutton.setOnClickListener {
            if(checkBoxSquare.isChecked||checkBoxTriangle.isChecked||checkBoxCircle.isChecked) {
                //принятие данных эдит текста 1
                val num1: String = numebr1.text.toString()
                //  скорее всего создание обьекта класса интент
                val intent = Intent(this, SecondActivity::class.java)
                //отправка данных
                try {
                    val numConvert1: Int = num1!!.toInt()
                    if (num1 != "" || numConvert1 > 0) {
                        //круг 0
                        if (checkBoxCircle.isChecked) {
                            intent.putExtra("key_num1", num1);
                            intent.putExtra("key_num2", "0");
                            //открытие  второго активити
                            startActivity(intent)
                        }
                        //квадрат 1
                        if (checkBoxSquare.isChecked) {
                            intent.putExtra("key_num1", num1);
                            intent.putExtra("key_num2", "1");
                            //открытие  второго активити
                            startActivity(intent)
                        }
                        // треугольник 2
                        if (checkBoxTriangle.isChecked) {
                            intent.putExtra("key_num1", num1);
                            intent.putExtra("key_num2", "2");
                            //открытие  второго активити
                            startActivity(intent)
                        }


                    } else {
                        Toast.makeText(this, "repeat the input ", Toast.LENGTH_LONG).show();

                    }
                } catch (e: Exception) {
                    Toast.makeText(this, "repeat the input ", Toast.LENGTH_LONG).show();

                }

            }
            else{
                Toast.makeText(this, "repeat the input ", Toast.LENGTH_LONG).show();

            }
        }
    }



}