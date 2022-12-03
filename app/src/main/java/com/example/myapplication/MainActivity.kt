package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.text.toInt as toInt1


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numberOne: EditText = findViewById(R.id.numberOne_et);
        var numberTwo: EditText = findViewById(R.id.numberTwo_et);
        var answer : TextView = findViewById(R.id.answer_tv);
        var plus : Button = findViewById(R.id.plus_bt);
        var minus : Button = findViewById(R.id.minus_bt);
        var multuplication : Button = findViewById(R.id.multiplication_bt);
        var division : Button = findViewById(R.id.division_bt);
        plus.setOnClickListener(View.OnClickListener {
           if (numberOne.text.length != 0 && numberTwo.text.length != 0) {
               answer.setText((numberOne.text.toString().toDouble() + numberTwo.text.toString().toDouble()).toString())
           }
        })
        minus.setOnClickListener(View.OnClickListener {
            if (numberOne.text.length != 0 && numberTwo.text.length != 0) {
                answer.setText((numberOne.text.toString().toDouble() - numberTwo.text.toString().toDouble()).toString())
            }
        })
        multuplication.setOnClickListener(View.OnClickListener {
            if (numberOne.text.length != 0 && numberTwo.text.length != 0) {
                answer.setText((numberOne.text.toString().toDouble() * numberTwo.text.toString().toDouble()).toString())
            }
        })
        division.setOnClickListener(View.OnClickListener {
            if (numberOne.text.length != 0 && numberTwo.text.length != 0) {
                answer.setText((numberOne.text.toString().toDouble() / numberTwo.text.toString().toDouble()).toString())
            }
        })
    }

}
