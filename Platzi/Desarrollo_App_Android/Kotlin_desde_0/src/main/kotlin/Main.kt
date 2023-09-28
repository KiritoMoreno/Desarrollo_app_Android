const val PI = 3.1416
fun main(args: Array<String>) {
    val nombre = "Andres"

    if(nombre.isNotEmpty()){
        println("El largo de nuestra variable nombre es: ${nombre.length}")
    }else{
        println("Error, la variable esta vacia")
    }

    val name = ""
    val mensaje: String = if (name.length <= 4) {
        "Tienes un nombre corto"
    } else if(name.isEmpty()){
        "Nombre esta vacio"
    }else{
        "Tienes un nombre corto"
    }
    println(mensaje)


}