class National(override val city:String): Travel() {
    override val country = "Mexico"

    // Map es un catalogo de los diferentes precios por día dependidendo de la ciudad
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int):Int{
        val fee = fees[city] //Obtención la tarifa según la ciudad
        return if (fee==null) 0 else fee*numDays //Regresams 0 si no hay tarifa, si si, hacemos el calculo
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price==0){ //Si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        }else{
            println("Tu viaje a $city cuesta \$$price") //Notificamos el precio al usuario
        }
    }
}