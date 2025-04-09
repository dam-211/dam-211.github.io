package ar.edu.ifts18.kotlinconsola

fun main(){

    val mesesDelPrimerSemestre = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio")

    println(mesesDelPrimerSemestre.get(3))

    if(mesesDelPrimerSemestre.size >= 6) println("NO es un SEMESTRE")

    mesesDelPrimerSemestre.set(0, "Es dificil arrancar enero")
    mesesDelPrimerSemestre.set(5, "SE viene JULIO!!!")

    println(mesesDelPrimerSemestre.get(5))


    for (puntero in mesesDelPrimerSemestre.indices){

        println(mesesDelPrimerSemestre.get(puntero))

    }

    for (puntero in mesesDelPrimerSemestre){

        println(puntero)
    }

    for ((posicion, valor) in mesesDelPrimerSemestre.withIndex()){

        println("La posicion es $posicion y el valor $valor")
    }


    /*
    Listas: mutables e inmutables
     */

    val listaInmutable: List<String> = listOf("Java", "C++", "Kotlin")

    listaInmutable.size
    listaInmutable.get(1)
    listaInmutable.first()

    listaInmutable.last()
    println(listaInmutable)

    val filtrado = listaInmutable.filter { it == "Java" || it == "C++" }

    println(filtrado.size)

    val listaMutable: MutableList<String> = mutableListOf("Samsung", "Motorola", "Apple", "Xiaomi", "Huawei")

    listaMutable.add("Nokia")

    println(listaMutable.last())

    println(listaMutable.get(2))

    listaMutable.add(2, "Google Pixel")

    println(listaMutable.get(2))

    listaMutable.none() //True si la lista esta vacia
    listaMutable.firstOrNull() // Te devuelve si o si el primero, si no null
    listaMutable.elementAtOrNull(2) //Traeme el 2, si no hay nada, te devuelvo nulo

    for (item in listaMutable) {
        print(item)

    }

    val nuevaListaVacia: MutableList<String> = mutableListOf()

    listaMutable.forEach {
        nuevaListaVacia.add(it + ";")
    }

    print(nuevaListaVacia)
}
