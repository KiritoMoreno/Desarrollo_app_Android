
fun main(args: Array<String>) {
    //Funciones y funciones de extensión
    
    val fraseAleatoria = "Nunca paramos de aprender".randomCase()

    imprimirFrase(fraseAleatoria)
}
fun imprimirFrase (frase : String): Unit{
    println("Tu frase es : $frase")
}
// Función de extensión
fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2)==0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}