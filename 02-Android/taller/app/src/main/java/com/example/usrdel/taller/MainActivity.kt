package com.example.usrdel.taller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_horizontal.setOnClickListener {
            llamaractividadhorizontal()



        }



    }

    fun llamaractividadhorizontal(){
        val intentAdaptadorhorizontal = Intent(
            this,
            horizontalActivity::class.java
        )
        startActivity(intentAdaptadorhorizontal)


    }

}
