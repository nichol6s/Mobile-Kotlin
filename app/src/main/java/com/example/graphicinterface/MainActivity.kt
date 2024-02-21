package com.example.graphicinterface

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.txtNome)
        val buttonText = findViewById<Button>(R.id.buttonTxt)

        buttonText.setOnClickListener{
            val msg = "Olá, ${name.text}"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}