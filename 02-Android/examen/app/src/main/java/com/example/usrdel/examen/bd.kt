package com.example.usrdel.examen

class bd {

    companion object {
        val Medicina: ArrayList<medicina> = ArrayList()


        fun actualizarMedicina(medicina: medicina) {

            Medicina.forEach {
                if (it.nombre.equals(medicina.nombre)) {
                    it.tipo = medicina.tipo
                    it.precio = medicina.precio

                }
            }
        }

        fun eliminarMedicina(nombre: String) {
            for (i in Medicina.indices) {
                if (Medicina[i].nombre.equals(nombre)) {
                    Medicina.removeAt(i)
                }
            }
        }

    }


}