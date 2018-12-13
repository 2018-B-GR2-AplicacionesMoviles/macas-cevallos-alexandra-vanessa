package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_pantallalistar.*

class pantallalistar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallalistar)

        // val arreglo = bd.lstMedicina
        // val medi1 = medicina (1,"tempra",2.2)
        // arreglo.add(arreglo)

        val adaptador1 = ArrayAdapter<medicina>(this, android.R.layout.simple_list_item_1, bd.Medicina)
        listamedicina.adapter = adaptador1


        listamedicina.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val medicinaSeleccionada = parent.getItemAtPosition(position) as medicina
            val intentMedicinaSeleccionada = Intent(this, pantalladatos::class.java)
            intentMedicinaSeleccionada.putExtra("Medicina", medicinaSeleccionada)
            startActivity(intentMedicinaSeleccionada)
        }


    }


}




