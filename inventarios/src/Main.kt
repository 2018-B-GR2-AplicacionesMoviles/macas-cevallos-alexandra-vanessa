fun main(args: Array<String>) {
activarAplicacion()
}
fun activarAplicacion(){
    var num: Int
    var estado:Int = 0
    println("Bienvenido selecione (1) para ingresar al iventario o (0) para salir:")
    num = readLine()?.toInt() as Int
    when (num) {
        1 -> {
            var opcion: Int
            println("Inventario")
            println("1. Agregar Inventario" + "\n" + "2. Eliminar Inventario" + "\n" + "3. Mostrar Medicamento" + "\n" + "4. Construir Receta" + "\n" + "5. Fin del inventario")
            println("Seleccione una opción:")
            opcion = readLine()?.toInt() as Int
            when (opcion) {
                1 -> {
                    println("Ingrese los datos solicitados en el inventario")
                    var medicina = Medicina()
                    println("Codigo del medicamento")
                    medicina.codigoMedicina = readLine()?.toString() as String
                    println("Nombre del medicamento")
                    medicina.nombreMedicina = readLine()?.toString() as String
                    println("Tipo del medicamento")
                    medicina.tipoMedicina = readLine()?.toString() as String
                    println("Fecha de caducidad del medicamento (YYYY/MM/DD)")
                    medicina.fechaCaducidadMedicina = readLine()?.toString() as String
                    println("Descripcion del medicamento")
                    medicina.descripcionUsoMedicina = readLine()?.toString() as String
                    println("Costo del medicamento (0.00)")
                    medicina.costoMedicina = readLine()?.toDouble() as Double
                    println("Observacion del medicamento")
                    medicina.observacionMedicina = readLine()?.toString() as String
                    println("Cantidad del medicamento")
                    medicina.cantidadMedicina = readLine()?.toInt() as Int
                    BaseDeDatosMedicina.agregarMedicina(medicina)
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        println("Programa Finalizado")
                    }
                }
                2 -> {
                    var nombreMedicamento: String
                    println("Escriba el nombre del medicamento que desea eliminar")
                    nombreMedicamento = readLine()?.toString() as String
                    BaseDeDatosMedicina.eliminarMedicina(nombreMedicamento)
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        println("Programa Finalizado")
                    }
                }
                3 -> {
                    BaseDeDatosMedicina.mostrarMedicinas()
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        println("Programa Finalizado")
                    }
                }
                4 -> {
                    var nombreReceta: String
                    println("Ingrese Medicamento:")
                    nombreReceta = readLine()?.toString() as String
                    BaseDeDatosMedicina.BuscarReceta(nombreReceta)
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        println("Programa Finalizado")
                    }
                }
                5 -> {
                    estado = 1
                }
            }


        }
    }
}