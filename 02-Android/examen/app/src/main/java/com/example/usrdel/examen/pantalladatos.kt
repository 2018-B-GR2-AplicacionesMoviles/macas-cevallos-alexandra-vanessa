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
        val medicinaRecibida = intent.getParcelableExtra<medicina?>("Medicina")

        editText2nombreed.setText(medicinaRecibida!!.nombre.toString())
        editTextcodigoed.setText(medicinaRecibida!!.tipo.toString())
        editText3precioed.setText(medicinaRecibida!!.precio.toString())
        button2.setOnClickListener {
            act(editText2nombreed.text.toString(), editTextcodigoed.text.toString(), editText3precioed.text.toString())
            irAListar()
        }
        button3.setOnClickListener() {
            borrar()
            irAListar()
        }
    }

    fun act(nombreMed: String, codigoMed: String, precioMed: String) {

        val medicina = medicina(nombre = nombreMed, tipo = codigoMed, precio = precioMed)
        bd.actualizarMedicina(medicina)
        val intentMenu = Intent(this, MainActivity::class.java)
        startActivity(intentMenu)
    }

    fun borrar() {
        bd.eliminarMedicina(editText2nombreed.text.toString())
    }

    fun irAListar() {
        val intentListar = Intent(this, pantallalistar::class.java);
        startActivity(intentListar)
    }


}

