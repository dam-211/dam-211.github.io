//CLASE ABSTRACT!!!

package ar.edu.ifts18.kotlinconsola

abstract class Figura {

    abstract fun calcularArea(): Double

    fun mostrarTipoDeFigura(){
        println("Soy una figura")
    }

}


//SUbclase implementada

class Circulo(private val radio: Double) : Figura() {


    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }


}

class Rectangulo(private val base: Double, private val altura: Double) : Figura() {

    override fun calcularArea(): Double {

        return base * altura
    }

}

fun main () {

    //listOf: Son listas inmutables, es decir, que no permiten añadir ni quitar elementos
    //Es esquivalente a un arrayList de solo lectura

    //En lugar de tipo de dato List<""> --- > MutableList<""> y es para diferenciar el tipo de lista.

    //funcion  --- listOf() ---> List<T>  --- inmutable
    //funcion mutableList() ----> MutableList<T> ---- mutable
    //funcion arrayListOf() ---> ArrayList<T> ---- MutableList

    val figuras: List<Figura> = listOf(
        Circulo(3.2),
        Rectangulo(4.5, 8.9)
    )

    for (figura  in figuras) {

        figura.mostrarTipoDeFigura()
        println("Area: ${figura.calcularArea()}")
        println("*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*")
    }
}
