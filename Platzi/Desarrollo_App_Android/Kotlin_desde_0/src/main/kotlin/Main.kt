
fun main(args: Array<String>) {
    //Tipos de parámetros en las funciones
    imprimirNombre(nombre= "Andres", apellido = "Moreno")


}
// Parámetros nombrados
fun imprimirNombre(nombre:String,apellido: String){
    println("Mi nombre es $nombre y mi apellido es $apellido")
}
// Parámetros por defecto
fun imprimirNombre2(nombre:String, segundoNombre: String="", apellido:String){
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}