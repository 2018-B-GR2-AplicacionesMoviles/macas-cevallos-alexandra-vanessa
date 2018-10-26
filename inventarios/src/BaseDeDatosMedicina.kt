import javax.swing.*;
class BaseDeDatosMedicina {
    companion object {

        val lstMedicina: ArrayList<Medicina> = ArrayList()
        var lstRecetas:ArrayList<Recetas> = ArrayList()

        fun agregarMedicina(medicina: Medicina) {
            lstMedicina.add(medicina)
        }

        fun mostrarMedicinas() {
            for (item: Medicina in lstMedicina) {
                JOptionPane.showMessageDialog(null,"Codigo de medicina: "+item.codigoMedicina + "\n" + "Nombre de la medicina: "+item.nombreMedicina + "\n" + "Tipo de mediciana: "+ item.tipoMedicina + "\n" + "Fecha de Caducidad: "+item.fechaCaducidadMedicina + "\n" + "Cantidad"+item.cantidadMedicina)
               // println(item.codigoMedicina + "\t" + item.nombreMedicina + "\t" + item.tipoMedicina + "\t" + item.fechaCaducidadMedicina + "\t" + item.cantidadMedicina)
            }
        }

        fun mostrarReceta() {
            for (item: Recetas in lstRecetas) {
                JOptionPane.showMessageDialog(null, "Medicina: "+item.mediamento +"\n" +"Nombre del Cliente: "+item.nombreCliente + "\n" + "Apellido del cliente: "+ item.apellidoCliente + "\n" + "Cedula del cliente: "+item.cedulaCliente + "\n" + "Detalle de la receta: "+item.detalle)
                // println(item.codigoMedicina + "\t" + item.nombreMedicina + "\t" + item.tipoMedicina + "\t" + item.fechaCaducidadMedicina + "\t" + item.cantidadMedicina)
            }
        }

        fun eliminarMedicina(nombre: String) {
            for (i in lstMedicina.indices) {
                if (lstMedicina[i].nombreMedicina.equals(nombre)) {
                    lstMedicina.removeAt(i)
                    JOptionPane.showMessageDialog(null, "Eliminado")
                    //println("Eliminado")
                }
            }
        }


        fun agregarReceta(receta: Recetas) {

            lstRecetas.add(receta)

                    }

        fun BuscarReceta(nombre: String): Medicina {
            var opcion: Int = 0
            var receta = Medicina()
            var recetass = Recetas()
            for (item: Medicina in lstMedicina) {
                if (item.nombreMedicina.equals(nombre)) {
                    recetass.mediamento = item.nombreMedicina
                    JOptionPane.showMessageDialog(null, "Medicamento seleccionado" + "\n"+ item.nombreMedicina )

             //       println("Medicamento seleccionado")
             //       println(item.nombreMedicina)

                    receta = item
                }
            }


            return receta
        }
    }
}