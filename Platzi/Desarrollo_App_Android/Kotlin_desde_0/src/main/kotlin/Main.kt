
fun main(args: Array<String>) {
    // Also -> Nos permite obtener una variable,ejecutar un codigo con esa variable y luego devolverla como parametro para que pueda ser utilizada por una función más adelante.
    val moviles = mutableListOf("IOS","Linux","Windows").also {
        lista -> println("El valor original de la lista es $lista")
    }.asReversed()
    println(moviles)

}
