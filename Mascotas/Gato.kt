package ar.edu.ifts18.comoperrosgatos

class Gato(nombre: String, edad: Int, ) : Mascotas (nombre, edad){

    override fun hacerSonido(): String {
       return "$nombre hace Miau!!! y tiene $edad de edad"
    }

    override fun comer(): String {
        return "Estoy comiendo"
    }

    override fun estaDurmiendo(): Boolean {
        return false
    }

    override fun estaJugando(): Boolean {
        return true
    }


}
