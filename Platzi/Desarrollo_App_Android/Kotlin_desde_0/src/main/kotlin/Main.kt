
fun main(args: Array<String>) {
    // With nos permite acceder directamente a las propiedades de una variable que le pasamos por parámetro
    // De esta forma evitamos llamar la variable en varias lineas
    val colores = listOf("Azul", "Amarillo","Rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size") // Si queremos acceder a las propiedad de colores,lo podemos hacer directamente con size
    }
}
