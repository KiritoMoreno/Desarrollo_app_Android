
fun main(args: Array<String>) {
    // Let nos permite combinado con el operador safecall, ejecutar un codigo solo cuando nuestra variable nulable no sea nula


    var nombre : String? = null // Aqui no imprime nada
    nombre?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }
    //Asignamos valor a nuestra variable
    nombre = "Andres"
    nombre?.let {
            valor -> println("El nombre no es nulo, es $valor")
    }
}
