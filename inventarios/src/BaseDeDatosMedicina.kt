class BaseDeDatosMedicina {
    companion object {
        val lstMedicina: ArrayList<Medicina> = ArrayList()

        fun agregarMedicina(medicina: Medicina) {
            lstMedicina.add(medicina)
        }

        fun mostrarMedicinas() {
            for (item: Medicina in lstMedicina) {
                println(item.codigoMedicina + "\t" + item.nombreMedicina + "\t" + item.tipoMedicina + "\t" + item.fechaCaducidadMedicina + "\t" + item.cantidadMedicina)
            }
        }

        fun eliminarMedicina(nombre: String) {
            for (i in lstMedicina.indices) {
                if (lstMedicina[i].nombreMedicina.equals(nombre)) {
                    lstMedicina.removeAt(i)
                    println("Eliminado")
                }
            }
        }

        fun formarRecetas(nombre: String) {
            var recetas = Recetas()
            var opcion: Int = 0
            for (item: Medicina in lstMedicina) {
                if (item.nombreMedicina.equals(nombre)) {
                    recetas.lstRecetas.add(item)
                }
            }
        }

        fun agregarReceta() {
            var nombreMedicamiento:String
            var receta = Recetas()

            println("Ingrese nombre cliente")
            receta.nombreCliente = readLine()?.toString() as String
            println("Ingrese el apellido")
            receta.apellidoCliente = readLine()?.toString() as String
            println("Ingrese la cedula")
            receta.cedulaCliente = readLine()?.toString() as String
            println("Detalle de la receta")
            receta.detalle = readLine()?.toString() as String
            println("Nombre completo |" +"\t" +"|Cedula|")
            println(  receta.nombreCliente + receta.apellidoCliente +"\t"+  receta.cedulaCliente)
            println("Detalle de la receta")
            println("\t"+ receta.detalle)
                    }

        fun BuscarReceta(nombre: String): Medicina {
            var opcion: Int = 0
            var receta = Medicina()
            for (item: Medicina in lstMedicina) {
                if (item.nombreMedicina.equals(nombre)) {
                    println("Medicamento seleccionado")
                    println(item.nombreMedicina)
                    agregarReceta()

                    receta = item
                }
            }


                    println("\n"+"Gracias por la compra")
            return receta
        }
    }
}