package com.example.usrdel.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttoncrear.setOnClickListener {
            crearmedicina()
        }

        buttonbuscar.setOnClickListener {
            buscarmedicina()
        }


    }

    fun crearmedicina() {
        val crear = Intent(this, pantallacrear::class.java)
        this.startActivityForResult(crear, reqCodeCrear)

    }

    fun buscarmedicina() {

        val listar = Intent(this, pantallalistar::class.java)
        startActivity(listar)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode){
            reqCodeCrear -> {
                when (resultCode) {
                    RESULT_OK -> {
                        Log.i("medicina", "ok ${data!!.getStringExtra("nombre")}")
                        Log.i("medicina", "ok ${data!!.getStringExtra("tipo")}")

                        Log.i("medicina", "ok ${data!!.getStringExtra("precio")}")

                        CrearMedicina(data!!.getStringExtra("nombre"), data!!.getStringExtra("tipo"), data!!.getStringExtra("precio"))
                    }
                    RESULT_CANCELED -> {
                        Log.i("Error", "Error no ingreso medicina")
                    }
                }

            }
            else -> {
                Log.e("--", "--")
            }
        }
    }
    fun CrearMedicina (nombrem: String, tipom:String, preciom:String):Unit{

        val _medicina: medicina = medicina(nombrem,tipom, preciom)

        bd.Medicina.add(_medicina)


    }

    companion object {
        val reqCodeCrear = 101
    }

}
