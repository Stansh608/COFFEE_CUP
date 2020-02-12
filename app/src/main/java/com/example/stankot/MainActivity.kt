package com.example.stankot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var btnMinus:Button
    lateinit var textViewTotalCups:TextView
    lateinit var textViewTotalCost:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnTotal = findViewById<Button>(R.id.btn_total)

         textViewTotalCups = findViewById<TextView>(R.id.textView_total_cups)
         textViewTotalCost = findViewById<TextView>(R.id.textView_total_cost)

        val cupCost = 5

        btnAdd.setOnClickListener {
            //converte= string into integer
            val cups = textViewTotalCups.text.toString().toInt()
           //adding the value by one
            val totalCups = cups + 1
             //convert again into integer
            val cost = textViewTotalCost.text.toString().toInt()
            //compute by add 5
            val totalCost = cost + 5
            //
            textViewTotalCost.text = totalCost.toString()
            textViewTotalCups.text = totalCups.toString()

        }

        btnMinus.setOnClickListener {
            val cups = textViewTotalCups.text.toString().toInt()
            val totalCups = cups - 1


            val cost = textViewTotalCost.text.toString().toInt()
            val totalCost = cost - 5

            textViewTotalCost.text = totalCost.toString()
            textViewTotalCups.text = totalCups.toString()
            checkTotalCups(cups)
        }

        btnTotal.setOnClickListener {
            val cost = textViewTotalCost.text.toString().toInt()



        }

    }

    private fun checkTotalCups(cups: Int) {
        if(cups==0)
        {
         btnMinus.visibility=View.GONE
            return
        }else{
            btnMinus.visibility=View.VISIBLE
            val totalCups=cups-1
            val cost=textViewTotalCost.text.toString().toInt()
            val totalCost=cost-5
        }

    }
}