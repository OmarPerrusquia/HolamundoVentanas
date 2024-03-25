package com.example.holamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)


        val mostrar:TextView=findViewById(R.id.mostrar)
        val nombre = intent.getStringExtra("Nombre")
        val volver:Button=findViewById(R.id.volver1)
        mostrar.text = "Hola, $nombre, ¿cómo estás?"

        volver.setOnClickListener {
            var v2: Intent = Intent(this,MainActivity::class.java)
            startActivity(v2)

        }


    }
}