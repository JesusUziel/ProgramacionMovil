fun main() {
    print("Por favor, ingresa tú edad: ")
    val age = readLine()?.toInt()

    val gradoEscolar = when (age) {
        0 -> "Apenas eres un recién nacido"
        in 3..5 -> "Preescolar"
        in 6..11 -> "Primaria"
        in 12..15 -> "Secundaria"
        in 16..18 -> "Preparatoria"
        in 19..27 -> "Universidad "
        else -> "No existe grado escolar"
    }

    println("El grado escolar correspondiente es: $gradoEscolar")
}
