
fun AreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun VolumenPrismaRectangular(base: Double, altura: Double, profundidad: Double): Double {
    val areaBase = AreaRectangulo(base, altura)
    return areaBase * profundidad
}

fun main() {
    val baseRectangulo = 5.0
    val alturaRectangulo = 3.0
    val profundidadPrisma = 10.0

    val areaRectangulo = AreaRectangulo(baseRectangulo, alturaRectangulo)
    val volumenPrisma = VolumenPrismaRectangular(baseRectangulo, alturaRectangulo, profundidadPrisma)

    println("Área del rectángulo: $areaRectangulo unidades cuadradas")
    println("Volumen del prisma rectangular: $volumenPrisma unidades cúbicas")
}