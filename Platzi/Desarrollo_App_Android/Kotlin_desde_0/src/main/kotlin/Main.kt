
fun main(args: Array<String>) {
    // Run
    val moviles = mutableListOf("Google Pixel 2XL","IOS","Linux","Windows","Google Pixel 4a")
        .run{
            removeIf{
                movil -> movil.contains("Google")
            }
            this
        }
    println(moviles)
}
