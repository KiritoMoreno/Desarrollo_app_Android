
fun main(args: Array<String>) {
    //Lambdas
    //creación de una lambda -  variable, tipo, tipo retorno,llaves{"puede devolver un valor,recomendación usar un parámetro explicito"}
    val myLambda : (String) -> Int ={valor-> valor.length}
    // Utilizamos Lambda
    val lambdaEjecutada: Int = myLambda("Hola Mundo")
    println(lambdaEjecutada)

    // Podemos pasar las lambdas a otras funciones
    val saludos = listOf("Hello", "Hola","ciao")
    // En la función map recive un valor y va ejecutar esa lambda
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)


}
