package com.example.usrdel.examen

class bd {


    companion object {
        val lstMedicina: ArrayList<medicina> = ArrayList()



fun agregar (medicina: medicina){
    lstMedicina.add(medicina)
}



        fun mostrarMedicinas() {
            for (item: medicina in lstMedicina) {

            }
        }

        fun mostrarReceta() {
            for (item: medicina in lstMedicina) {

            }
        }

        fun eliminarMedicina(nombre: String) {
            for (i in lstMedicina.indices) {
                if (lstMedicina[i].codigo.equals(codigo)) {
                    lstMedicina.removeAt(i)

                }
            }
        }

    }


}