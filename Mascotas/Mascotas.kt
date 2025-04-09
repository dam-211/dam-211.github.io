package ar.edu.ifts18.comoperrosgatos

abstract class Mascotas(val nombre: String, val edad: Int) {

    abstract fun hacerSonido(): String

    abstract fun comer(): String

    abstract fun estaDurmiendo(): Boolean

    abstract fun estaJugando(): Boolean

}
