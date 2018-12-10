package com.example.ale.m

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_traerparametros.*

class Traerparametros : AppCompatActivity() {
        var nombre:String = ""
    var apellido: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traerparametros)
        datos()

        button2.setOnClickListener {
            email()
        }


    }
    fun datos(){

        nombre = intent.getStringExtra("nombre")
        apellido = intent.getStringExtra("apellido")
        textView2.text = "${nombre} ${apellido}"
    }
    fun email(){
        val usuario = editText.text
        val sub = editText2.text
        val texto = editText3.text

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "texto/html"
        intent.putExtra(Intent.EXTRA_EMAIL,usuario)
        intent.putExtra(Intent.EXTRA_SUBJECT,sub)
        intent.putExtra(Intent.EXTRA_TEXT, texto)
        startActivity(intent)

    }
}
