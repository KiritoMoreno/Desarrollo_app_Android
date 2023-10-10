
fun main(args: Array<String>) {
    // Diferentes tipos de Listas
    val listaDeNombre= listOf<String>("Juan", "Enrique", "Camila")
    println(listaDeNombre)

    // Lista mutable
    val listaVacia= mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    // Obtener un valor de la lista
    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor= listaDeNombre.firstOrNull()
    println(primerValor)

    // Eliminar elemento de una lista
    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf{caracteres -> caracteres.length > 3}
    println(listaVacia)

    //Concepto de arrays en kotlin-> solamente si estamos usando codigo con miles de datos
    val myArray = arrayOf(1,2,3,4)
    println("Array como lista ${myArray.toList()}")
}