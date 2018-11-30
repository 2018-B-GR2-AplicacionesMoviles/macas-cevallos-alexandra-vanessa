package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncrear.setOnClickListener {
            crearmedicina()
        }

        buttonbuscar.setOnClickListener {
 buscarmedicina()
        }


    }

    fun crearmedicina() {
        val crear = Intent(this, pantallacrear::class.java)
        startActivity(crear)

    }

    fun buscarmedicina() {

        val listar = Intent(this, pantallalistar::class.java)
        startActivity(listar)
    }


}
