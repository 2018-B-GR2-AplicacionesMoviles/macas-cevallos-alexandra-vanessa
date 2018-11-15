import javax.swing.JOptionPane

fun main(args: Array<String>) {
activarAplicacion()
}
fun activarAplicacion(){
    var num: Int
    var estado:Int = 0
    val seleccion = JOptionPane.showInputDialog("Bienvenido al inventario!!!" +"\n" +"Seleccione:" +"\n" +" 1. Ingresar al menu de iventario" +"\n" +" 0. Salir")
    if (seleccion.toString().equals("Cancel")){
        estado=1
    }


num = seleccion.toInt()

    when (num) {
        1 -> {
            var opcion: Int
        //    println("Inventario")
            val agregar = JOptionPane.showInputDialog("Seleccione una opción:"+"\n"+"1. Agregar Inventario" + "\n" + "2. Eliminar Inventario" + "\n" + "3. Mostrar Medicamento" + "\n" + "4. Construir Receta"+"\n"+"5. mostrarReceta" + "\n" + "6. Fin del inventario")

            opcion = agregar.toInt()
            when (opcion) {
                1 -> {
                    var medicina = Medicina()
                    val codigo = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Codigo del medicamento")

                    medicina.codigoMedicina = codigo.toString()

                    val nombreM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Nombre del medicamento")

                    medicina.nombreMedicina = nombreM.toString()

                    val tipoM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Tipo del medicamento")
                        medicina.tipoMedicina = tipoM.toString()
                    val fechaM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Fecha de caducidad del medicamento (YYYY/MM/DD)")
                    medicina.fechaCaducidadMedicina = fechaM.toString()

                    val descripcionM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Descripcion del medicamento")
                    medicina.descripcionUsoMedicina = descripcionM.toString()

                    val costoM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Costo del medicamento (0.00)")
                    medicina.costoMedicina = costoM.toDouble()

                    val ObservacionM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Observacion del medicamento")
                    medicina.observacionMedicina = ObservacionM.toString()

                    val cantidadM = JOptionPane.showInputDialog("Ingrese los datos solicitados en el inventario"+ "\n"+ "Cantidad del medicamento")
                    medicina.cantidadMedicina = cantidadM.toInt()

                    BaseDeDatosMedicina.agregarMedicina(medicina)

                    if (estado == 0) {
                        activarAplicacion()
                    } else {


                       JOptionPane.showMessageDialog(null,"Programa Finalizado")
                    }
                }
                2 -> {
                    var nombreMedicamento: String
                    val nombreMEliminar = JOptionPane.showInputDialog("Escriba el nombre del medicamento que desea eliminar")
                    // println("Escriba el nombre del medicamento que desea eliminar")
                    nombreMedicamento = nombreMEliminar.toString()
                    BaseDeDatosMedicina.eliminarMedicina(nombreMedicamento)
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        JOptionPane.showMessageDialog(null,"Programa Finalizado")
                    }
                }
                3 -> {
                    BaseDeDatosMedicina.mostrarMedicinas()
                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        JOptionPane.showMessageDialog(null,"Programa Finalizado")
                    }
                }
                4 -> {
                    var receta = Recetas()
                    var nombreReceta: String
                    val medicamentocon = JOptionPane.showInputDialog("Ingrese Medicamento:")
               //     println("Ingrese Medicamento:")
                    nombreReceta = medicamentocon.toString()

                    BaseDeDatosMedicina.BuscarReceta(nombreReceta)

                  receta.mediamento = nombreReceta
                    val nombreCliente = JOptionPane.showInputDialog("Ingrese nombre cliente")
                    receta.nombreCliente = nombreCliente.toString()
                    //   println("Ingrese nombre cliente")
                    //   receta.nombreCliente = readLine()?.toString() as String
                    val apellidoCliente = JOptionPane.showInputDialog("Ingrese el apellido")
                    receta.apellidoCliente = apellidoCliente.toString()
                    //   println("Ingrese el apellido")
                    //   receta.apellidoCliente = readLine()?.toString() as String
                    val cedulaCliente = JOptionPane.showInputDialog("Ingrese la cedula")
                    receta.cedulaCliente = cedulaCliente.toInt()
                    //  println("Ingrese la cedula")
                    //  receta.cedulaCliente = readLine()?.toString() as String
                    val detalleR = JOptionPane.showInputDialog("Detalle de la receta")
                    receta.detalle = detalleR.toString()


                    BaseDeDatosMedicina.agregarReceta(receta)

                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        JOptionPane.showMessageDialog(null,"Programa Finalizado")
                    }
                }
                5 -> {


                   BaseDeDatosMedicina.mostrarReceta()


                    if (estado == 0) {
                        activarAplicacion()
                    } else {
                        JOptionPane.showMessageDialog(null,"Programa Finalizado")
                    }
                }
                6 -> {
                    estado = 1
                }
            }


        }
    }
}