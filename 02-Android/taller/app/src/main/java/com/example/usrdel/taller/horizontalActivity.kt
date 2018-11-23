package com.example.usrdel.taller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_horizontal.*
import java.util.*
import android.widget.*

class horizontalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizontal)

        val arregloUsuarios = ArrayList<Usuario>();

        val usuarioUno = Usuario(
            "Adrian",
            29,

            12.00)
        val usuarioDos = Usuario(
            "Vicente",
            32,

            15.00)

        val usuarioTres = Usuario(
            "Alexandra",
            32,

            15.00)


        arregloUsuarios.add(usuarioUno)
        arregloUsuarios.add(usuarioDos)

        val arregloUsuarios2 = ArrayList<Usuario>();

        val usuariotres = Usuario(
            "Alexa",
            29,

            12.00)
        val usuariocuatro = Usuario(
            "Vane",
            32,

            15.00)







        arregloUsuarios2.add(usuariotres)
        arregloUsuarios2.add(usuariocuatro)


        val arregloUsuarios3 = ArrayList<Usuario>();

        val usuariocinco = Usuario(
            "angel",
            29,

            12.00)
        val usuarioseis = Usuario(
            "david",
            32,

            15.00)







        arregloUsuarios3.add(usuariocinco)
        arregloUsuarios3.add(usuarioseis)






        val arregloUsuarios4 = ArrayList<Usuario>();

        val usuariosiete= Usuario(
            "daniel",
            29,

            12.00)
        val usuarioochi = Usuario(
            "jose",
            32,

            15.00)







        arregloUsuarios4.add(usuariosiete)
        arregloUsuarios4.add(usuarioochi)


        // ADAPTADOR

        val adaptadorUsuarios = ArrayAdapter<Usuario>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios
        )

        val adaptadorUsuarios2= ArrayAdapter<Usuario>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios2
        )

        // Seteo el adaptado
        val lista =lista1
            lista.adapter = adaptadorUsuarios
        val lista2 = lista2
        lista2.adapter = adaptadorUsuarios2


        val adaptadorUsuarios3 = ArrayAdapter<Usuario>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios3
        )

        val adaptadorUsuarios4= ArrayAdapter<Usuario>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios4
        )

        // Seteo el adaptado
        val lista3 =lista3
        lista3.adapter = adaptadorUsuarios3
        val lista4 = lista4
        lista4.adapter = adaptadorUsuarios4








    }


}
