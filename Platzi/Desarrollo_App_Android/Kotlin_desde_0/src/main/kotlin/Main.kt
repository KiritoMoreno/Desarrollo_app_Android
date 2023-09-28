const val PI = 3.1416
fun main(args: Array<String>) {
    val nombreColor = "Amarillo"

    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color del sol")
        "Rojo","Carmesi" -> println("El rojo es el color del fuego") // Puedo poner dos opciones y  utilizamos el mismo mensaje
        else -> println("Error, no tengo información del color")
    }

    val code = 200
    // (in) quiere decir que se encuentra en
    // (..) quiere decir desde y hasta segun yo xD
    when(code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 45
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44 y 45"
    }
    println(mensaje)
}