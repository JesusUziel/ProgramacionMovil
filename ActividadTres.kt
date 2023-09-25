
fun main(){
    val P1 = arrayOf(4.0, 3.0)
    val P2 = arrayOf(-3.0, -2.0)
    
    fun calcularPendiente(P1: Array<Double>, P2: Array<Double>): Double {
        val pendiente = (P2[1]-P1[1])/(P2[0]-P1[0])
        return pendiente
    }
    
    val pendiente = calcularPendiente(P1, P2)
    
    print("La pendiente es: $pendiente")
}