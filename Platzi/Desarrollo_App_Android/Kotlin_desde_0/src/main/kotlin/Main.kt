
fun main(args: Array<String>) {
    // Apply -> Nos permite realizar operaciones sobre una variable y luego delvolver el valor
    // Tambien si lo combinamos con la funcion safecall,crea una funcion Apply segura
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a","Iphone","Asus").apply {
        removeIf { movil -> movil.contains("Google") }
    }
    println(moviles)

    // Esto nos ayuda a evitar a estar entrando a propiedades o modificando variables en el caso de que sean nulables ->
    val colores : MutableList<String> = mutableListOf("Amarillo","Azul","Rojo")
    colores?.apply{
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }

}
