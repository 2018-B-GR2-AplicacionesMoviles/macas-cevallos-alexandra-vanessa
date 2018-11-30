package com.example.usrdel.examen

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


        listamedicina.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long) {

                   //     val medi = arreglo[position]


                    }

                    override fun onNothingSelected(
                        parent: AdapterView<*>?) {

                    }
                }


        buttoncancelar.setOnClickListener {

        }
        button2.setOnClickListener {
            
        }


    }
}
