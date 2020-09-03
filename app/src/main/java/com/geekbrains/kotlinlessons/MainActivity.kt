package com.geekbrains.kotlinlessons

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //текст всплывающего сообщения
    val msgText = "Hello world!"
    val duration = Toast.LENGTH_LONG
 //   val toast = Toast.makeText(applicationContext, msgText, duration)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ClickListener для кнопки
        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, msgText, duration)
            toast.show()
        }

        }
    }


