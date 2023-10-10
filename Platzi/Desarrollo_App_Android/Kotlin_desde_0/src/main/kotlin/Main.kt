
fun main(args: Array<String>) {
    // Try Catch
    var nombre : String?= null
    // Intentamos entrar a la variable nombre cuando es nulo
    try {
        nombre!!.length
    }catch (excepcion: NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error.. Cerrando aplicación")
    }

    //Podemos capturar este error
    //Asignamos un valor 0
    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {
        primerValor/segundoValor
    }catch (exception : Exception){0}
    println(resultado)

}