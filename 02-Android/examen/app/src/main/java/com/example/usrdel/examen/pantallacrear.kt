package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantallacrear.*

class pantallacrear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallacrear)

        buttonguardar.setOnClickListener {
            agregar()
        }





    }
   fun agregar(){
       val nombremed = editTextnombre.text.toString()
       val tipomed = editTextcodigo.text.toString()
      // val m2 = m2_txt.text.toString()
       val preciomed = editTextprecio.text.toString()

       val intentRespuesta = Intent()

       intentRespuesta.putExtra("nombre", nombremed)
       intentRespuesta.putExtra("tipo", tipomed)
    //   intentRespuesta.putExtra("m2", m2)
       intentRespuesta.putExtra("precio", preciomed)

       this.setResult(
           RESULT_OK,
           intentRespuesta
       )

       this.finish()


   }

}

