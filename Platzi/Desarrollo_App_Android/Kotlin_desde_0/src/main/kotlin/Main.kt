
fun main(args: Array<String>) {
    // Como obtener listas con las funciones que tiene kotlin

    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    // Ordenar las listas
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDesc = numerosDeLoteria.sortedDescending()
    println(numerosDesc)

    // Permite ordenar dependiendo de una condición
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    // Ordenar una lista de una forma aleatoria
    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    //Dos funciones de programación funcional
    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de lotería es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter{numero -> numero > 50}
    println(numerosFiltrados)
}