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


       // var phone = phone_editText3.getText().toString()

      //  val datos: ArrayList<String>  = ArrayList()
     //   static ArrayList<Usuarios> ListaUsuarios = new ArrayList<>()
     //   var datos = arrayListOf <String>()

        datos.add("Datos Registrados");

      //  adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, telefonos)
        val adapterUser = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos)
        lista.adapter = adapterUser

      //  lista.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos)


        guardar_button.setOnClickListener {
            var nombre = nombreeditText.getText().toString()
            var email = email_editText2.getText().toString()
            var phone = phone_editText3.getText().toString()
            var postal = postal_editText4.getText().toString()
            var date = date_editText5.getText().toString()

            var seleccion = checkBox
            var seleccion2 = m_checkBox2
            var seleccion3 = a_checkBox2
            var empleado = ""
            var estudiante = ""
            var admin = ""

            if (seleccion.isChecked == true ) {
                estudiante = "Estudiante"
                datos.add("Tipo"+estudiante)
                seleccion.isChecked = false
            }
            if (seleccion2.isChecked == true){
                empleado= "Profesor"
                datos.add("Tipo" +empleado)
            }
            if (seleccion3.isChecked == true){
                admin= "Administartivo"
                datos.add("Tipo" +admin)
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
