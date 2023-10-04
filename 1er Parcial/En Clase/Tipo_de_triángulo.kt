fun main() {
    val lado1 = 5.0
    val lado2 = 5.0
    val lado3 = 5.0

    if (lado1 == lado2 && lado2 == lado3) {
        println("Es un triángulo equilátero.")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        println("Es un triángulo isósceles.")
    } else {
        println("Es un triángulo escaleno.")
    }
}
