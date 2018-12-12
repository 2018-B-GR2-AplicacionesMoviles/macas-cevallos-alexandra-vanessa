package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_pantallacrear.*
import kotlinx.android.synthetic.main.activity_pantalladatos.*
import kotlinx.android.synthetic.main.activity_pantallalistar.*

class pantalladatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalladatos)



        //darme los del item selecionado del la pantallalistar
        //buscarenlabbd
        //devolvermelosdatos en cada uno de los plaintext



        val casa = intent.getParcelableExtra<medicina?>("medicina")
        val pos = intent.getIntExtra("pos", 0)

        button2.setOnClickListener {
            this.ActualizarCasa(editText2nombreed.toString(), editTextcodigoed.toString(), editText3precioed.toString(), pos)
            this.irAListar()
        }
    }

    fun ActualizarCasa (indiceCasa: String, descipcionIng:String,  precioIng:String, pos:Int):Unit{

        val nuevaCasa: medicina = medicina(indiceCasa,descipcionIng, precioIng)

        bd.Medicina[pos] = nuevaCasa


    }
    fun irAListar(){
        val intentListar = Intent(this, pantallalistar::class.java);
        this.startActivity(intentListar)
    }

}

