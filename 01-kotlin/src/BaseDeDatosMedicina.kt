class BaseDeDatosMedicina{
    companion object {
        val lstMedicina:ArrayList<Medicina> = ArrayList()
        fun agregarMedicina(medicina:Medicina){
            lstMedicina.add(medicina)
        }
        fun buscarMedicina(nombre:String){
            for (item: Medicina  in lstMedicina) {
                if(item.nombreMedicina.equals(nombre)){
                    println(item.nombreMedicina)
                }
            }
        }

    }
}