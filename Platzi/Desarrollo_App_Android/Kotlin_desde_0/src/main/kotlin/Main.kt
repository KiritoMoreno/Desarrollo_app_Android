
fun main(args: Array<String>) {
    // Elvis operator nos ayudara a devolver un valor
    var nombre : String?= null

    // Esto nos va dar un error porque estamos intentando asignar un nulable a un tipo entero que no es nulable
    // Para poder convertirlo vamos a utilizar el operador elvis ( ?: ) y en el lado derecho el valor
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)
}