
fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana", "Fresa", "Durazno")

    for(fruta in listaDeFrutas){
        println("Hoy me comere una $fruta")
    }
    listaDeFrutas.forEach { fruta ->  println("Hoy me comere una $fruta nueva") }

    val characterisesFruit:List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    print(characterisesFruit)

    val listaFiltrada = characterisesFruit.filter { largoFruta -> largoFruta>5 }
    print(listaFiltrada)


}