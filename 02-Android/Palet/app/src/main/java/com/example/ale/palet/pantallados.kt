package com.example.ale.palet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_pantallados.*
import java.nio.file.Files.size
import android.view.View;




class pantallados : AppCompatActivity() {

//    var datos: ArrayList<String>  = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallados)
        var datos = ArrayList<String>()
        val lista = lista_dynamic

        datos.add("Datos Registrados");


        val adapterUser = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos)
        lista.adapter = adapterUser



        guardar_button.setOnClickListener {
            var nombre = nombreeditText.getText().toString()
            var email = email_editText2.getText().toString()
            var phone = phone_editText3.getText().toString()
            var postal = postal_editText4.getText().toString()
            var date = date_editText5.getText().toString()

            var seleccion = checkBox
            var seleccion2 = m_checkBox2
            var seleccion3 = a_checkBox2
            var femenino = radioButton
            var masculino = radioButton2
            var masculin = ""
            var empleado = ""
            var estudiante = ""
            var admin = ""
            var fem = ""

            if (seleccion.isChecked == true ) {
                estudiante = "Estudiante"
                datos.add("Tipo"+estudiante)

            }
            if (seleccion2.isChecked == true){
                empleado= "Profesor"
                datos.add("Tipo" +empleado)
            }
            if (seleccion3.isChecked == true){
                admin= "Administrativo"
                datos.add("Tipo" +admin)
            }
            if (femenino.isChecked == true){
                fem = "Femenino"
                datos.add(fem)

            }

            if (masculino.isChecked == true){
                masculin = "Masculino"
                datos.add(masculin)

            }


//eliminar, se busca, se leimna y se responde como 6 pasos
//si dividimos cada uno nada mas que pensar y procesar
//no usar en estar un menu (promesa)


           datos.add("\n nombre: "+nombre + "\n email:" +email + "\n Celular:"+ phone + "\n postal:" + postal +"\n fecha de registro:"+ date)
            val adapterUser = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos)
            lista.adapter = adapterUser
            lista.deferNotifyDataSetChanged()
            nombre.equals("")


        }




    }


}
