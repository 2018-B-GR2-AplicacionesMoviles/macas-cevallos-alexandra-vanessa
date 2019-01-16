package com.example.ale.deber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista.*

class lista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val layoutManager = LinearLayoutManager(this)
        val rv = lista_datos

        lista_datos.layoutManager = layoutManager
        lista_datos.itemAnimator = DefaultItemAnimator()





    }
}
