package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.usrdel.examen.bd.Companion.lstMedicina
import kotlinx.android.synthetic.main.activity_pantallacrear.*
import kotlinx.android.synthetic.main.activity_pantallalistar.*
import java.util.ArrayList

class pantallacrear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallacrear)

        buttonguardar.setOnClickListener {
            agregar()
        }





    }
   fun agregar(){
       var med = medicina
       var codigo1 = editTextcodigo.text.toString()
       var nombre = editTextnombre.text.toString()
       var precio = editTextprecio.text.toString()


       val medic= medicina(codigo= codigo1,
           nombremed = nombre,
           precio = precio)


       bd.agregar(medic)


    }
}

