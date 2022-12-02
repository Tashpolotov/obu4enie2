package com.example.obu4enie2

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chislo = findViewById<EditText>(R.id.chislo_et)
        var chislo1 = findViewById<EditText>(R.id.chislo1_et)
        var textview = findViewById<TextView>(R.id.otvet_tv)
        var plusBtn = findViewById<Button>(R.id.plus_btn)
        var minusBtn = findViewById<Button>(R.id.minus_btn)
        var delenieBtn = findViewById<Button>(R.id.delenie_btn)
        var umnojenie = findViewById<Button>(R.id.umnojenie_btn)

       plusBtn.setOnClickListener(View.OnClickListener {
            var num1 = chislo.text.toString().toInt()
            var num2 = chislo1.text.toString().toInt()
            var numb = num1 + num2
           textview.text = numb.toString()

        })

        minusBtn.setOnClickListener(View.OnClickListener {
            var num1 = chislo.text.toString().toInt()
            var num2 = chislo1.text.toString().toInt()
            var numb=  num1-num2
            textview.text = numb.toString()

        })
        umnojenie.setOnClickListener(View.OnClickListener {
            var num1 = chislo.text.toString().toInt()
            var num2 = chislo1.text.toString().toInt()
            var numb=  num1*num2
            textview.text = numb.toString()

        })

        delenieBtn.setOnClickListener(View.OnClickListener {
            var num1 = chislo.text.toString().toInt()
            var num2 = chislo1.text.toString().toInt()
            var numb=  num1/num2
            textview.text = numb.toString()

        })

        }
}

