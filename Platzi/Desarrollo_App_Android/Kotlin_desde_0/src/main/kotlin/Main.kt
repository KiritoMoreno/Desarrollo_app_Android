
fun main(args: Array<String>) {
    // Maps -> Son elementos de clave valor.
    // Nos permite ordenar los elementos de una forma que tenemos una clave que tiene asignado un valor

    // Mapa Inmutables
    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    ) // se accede mediante las keys
    println(edadSuperHeroes)

    //Mapa Mutable -> Permite que se modifiquen elementos
    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutable)
    //Agregamos
    edadSuperHeroesMutable.put("Wolverine",45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronman = edadSuperHeroesMutable["Ironman"]
    println(edadIronman)

    // Eliminar elementos de nuestro mapa
    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    // Conocer todas las claves y valores
    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)
}