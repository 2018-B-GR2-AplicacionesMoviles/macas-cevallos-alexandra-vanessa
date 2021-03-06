/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import java.util.Date

fun main(args: Array<String>){

    println("Hola mundo")

    // Int edad = 29;

    // Mutable -> Cambiarse / Reasignar

    var edad: Int = 29

    edad = 10

    // Inmutable -> No puede cambiarse / No se puede reasignar

    val edadInmutable:Int = 29


    // Duck Typing

    var curso = 101 // Inferi que es un Int

    curso = 102

    var nombre = "Adrian"

    var apellido = 'H'

    var casado = false

    var sueldo = 10.1

    var fechaNacimiento = Date()

    println(fechaNacimiento.toString())


    when(casado){
        false -> println("Feliz $nombre") // template strings
        true -> println("Triste ${nombre}") // template strings
        else -> {
            println("No me voy a ejecutar")
            println("Ni yo tampoco")
        }
    }

    var bono = if (casado) 1000.00 else 0.00

    val sueldoTotal = calcularSueldo(bono)
    println(sueldoTotal)

    val adrian = Usuario("Adrian")
    println(adrian)

    println (BaseDeDatos.Usuarios)//[]
  BaseDeDatos.agregarUsuario(nombre = "ale")
    println(BaseDeDatos.Usuarios) //["Adrian"]

    val medicina1= Medicina()
    val medicina2= Medicina()
    val medicina3= Medicina()
    medicina1.nombreMedicina= "Ejemplo1"
    medicina2.nombreMedicina= "Ejemplo2"
    medicina3.nombreMedicina= "Ejemplo3"
    BaseDeDatosMedicina.agregarMedicina(medicina1)
    BaseDeDatosMedicina.agregarMedicina(medicina2)
    BaseDeDatosMedicina.agregarMedicina(medicina3)
    println(BaseDeDatosMedicina.lstMedicina)
    BaseDeDatosMedicina.buscarMedicina("Ejemplo1")


}

fun calcularSueldo(bono: Double): Double{
    var sueldo = 800.00
    return sueldo + bono
}

fun saludar(): Unit{
    println("Hola mundo")
}

class Usuario(public var nombre:String){ // 1ero

    public var apellido:String? = null;
    public var apellidoMaterno:String? = null

    constructor(vNombre:String,vApellido:String):this(vNombre){ // 2do
       this.apellido = vApellido
    }
    constructor(vNombre:String,vApellido:String, vApellidoMaterno:String):this(vNombre){ // 2do
        this.apellidoMaterno = vApellidoMaterno
    }


   /*
   public var nombre:String
   constructor(vNombre: String){
        this.nombre = vNombre
        nombre = vNombre
    }*/

    override fun toString(): String{
    //    return "Hola ${this.nombre}"
        val apellidoMayuscula = if (!apellido.isNullOrBlank()) this.apellido?.toUpperCase() else ""
        val apellidoMaternoMayuscula = if (!apellidoMaterno.isNullOrBlank()) this.apellidoMaterno?.toUpperCase() else ""
        return "hola $nombre $apellidoMayuscula"
    }
}

//si esta opaco se sobre entiende que es un propiedad publica
//open es de una clase que se puede heredar
//abstract no poder instaciar una calse de tipo animal

open class Animal (var nombre: String) {


}
class Tortuga(nombre:String,
              var pesoCaparazon:Double):Animal(nombre){
init {
    println("$nombre $pesoCaparazon")
}

}

var animal = Animal( nombre = "caballo")
var goere = Tortuga("George", 12.5)

class Ejemplo{
    var nombre:String
    constructor(nNombre: String){
        println("Estoy en el constructor   ")
    nombre = nNombre
    }
init {
    println("Estoy en el init")
}

}

val ejemplo = Ejemplo(nNombre = "Adrian")

// <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />

class BaseDeDatos{
    companion object {
        val Usuarios:ArrayList<String> = ArrayList()
        fun agregarUsuario(nombre:String){
            Usuarios.add(nombre)
        }

    }
}

fun datosIniciales(){
    BaseDeDatos.agregarUsuario(nombre = "Ale")
}





