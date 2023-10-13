
fun main(args: Array<String>) {
    // Llamamos High Order Functions
    val largoDeValorInicial = superFuncion(valorInicial = "Hola!", block = {valor -> valor.length})
    println(largoDeValorInicial)

    val lambda: () -> String = funcionInception("Andres")
    // tenemos que invocar el valor de la lambda para poder tener el valor
    val valorLambda: String = lambda()
    println(valorLambda)

}


// Block es para renombrar las Lambdas
// La superFuncion se va a encargar de abrir el lambda para que nos devuelva el valor
fun superFuncion(valorInicial: String, block:(String) -> Int) : Int{
    return block(valorInicial)
}

// Como hacer si queremos obtener una función de otra función
fun funcionInception(nombre: String) :()-> String{
    return {
        "Hola desde la lambda $nombre"
    }
}