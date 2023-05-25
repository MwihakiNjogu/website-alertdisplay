package com.example.excercise1wanyama

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnCalc: Button
    lateinit var btnWeb: Button
    lateinit var btnPopUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalc= findViewById(R.id.calcbtn)
        btnWeb=findViewById(R.id.btnweb)
        btnPopUp=findViewById(R.id.alertbtn)

        btnCalc.setOnClickListener {
            var tembea = Intent(this, CalculatorActivity::class.java)
            startActivity(tembea)
        }

        btnWeb.setOnClickListener {
            var tovuti = Intent(this,WebsiteActivity::class.java)
            startActivity(tovuti)
        }

        btnPopUp.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Exiting App")
            alertDialog.setMessage("Are you sure you want to exit?")
            alertDialog.setNegativeButton("No", null)
            alertDialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> finish() })
            alertDialog.create().show()

        }





    }
}