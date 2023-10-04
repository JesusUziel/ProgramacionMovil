
fun main() {
    print("Por favor, ingresa el valor de PI: ")
    val pi: Double = readLine()?.toDoubleOrNull() ?: 0.0

    println("El valor de PI ingresado es: $pi")
}