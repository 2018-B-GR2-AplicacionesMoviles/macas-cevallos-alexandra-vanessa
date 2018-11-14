package com.example.ale.palet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ingresar_login_Btn.setOnClickListener{

            var nom =nombre_editxt.getText().toString()
        var pass=pass_editxt.getText().toString()
            if (nom.equals("Ale")&&pass.equals("123") ) {
                irApantallados()
            }
            else
            {
                Toast.makeText(this, "Usuario Incorrecto",Toast.LENGTH_SHORT)
            }
        }


    }
    fun irApantallados(){
   var intentIrPantalla = Intent(this,pantallados::class.java)
        startActivity(intentIrPantalla)
    }

}
