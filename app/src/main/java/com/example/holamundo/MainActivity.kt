package com.example.holamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val continuar:Button=findViewById(R.id.conti)
        val nombre:EditText=findViewById(R.id.nombre)

        continuar.setOnClickListener {
            var nombre=nombre.text.toString()
            var v1:Intent=Intent(this,Ventana2::class.java)
            v1.putExtra("Nombre",nombre)
            startActivity(v1)
        }

    }
}