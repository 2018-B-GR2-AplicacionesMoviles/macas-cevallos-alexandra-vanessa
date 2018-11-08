package com.example.usrdel.a2018_movilesgr2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        boton_navegar.setOnClickLiostener{
            log.i("navegacion", msg:"hola")
        }


    }
}


