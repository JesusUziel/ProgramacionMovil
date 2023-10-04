fun main() {
    val calificacion1 = 7.5
    val calificacion2 = 8.2
    val calificacion3 = 6.8

    val promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0

    println("El promedio es: $promedio")

    if (promedio >= 6.0) {
        val redondeado = if (promedio - promedio.toInt() > 0.5) {
            Math.ceil(promedio)
        } else {
            Math.floor(promedio)
        }
        println("El promedio redondeado es: $redondeado")
    } else {
        println("El promedio es menor a 6.0, no se redondea.")
    }
}
