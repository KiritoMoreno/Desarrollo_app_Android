
fun main(args: Array<String>) {
    // Sets -> No pueden tener elementos repetidos

    // Set Inmutable
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas) // No imprime los elementos repetidos

    // Set Mutable
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    // Eliminamos pasandole el valor que queremos quitar
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    // Podemos obtener un elemento de esta forma,en base de una condición
    val valorDelSet: Int? = numerosFavoritos.firstOrNull{ numero -> numero > 2}
    println(valorDelSet)
}