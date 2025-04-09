package ar.edu.ifts18.kotlinconsola

//Crear una clase Mascota que tenga como propiedades: nombre, edad, tipo
//Métodos: hacerSonido(), comer(), dormir();
//Subclase Perro: sobreescribe los métodos de la clase padre, correrPelota();
//Subclase Gato: idem anterior, araniar();
//Implementamos dentro de la funcion main e invocamos los métodos.


 open class Mascotas (val nombre: String, val edad: Int, val tipoMascota: String) {

     open fun hacerSonido() {

        println("$nombre esta haciendo un sonido de acuerdo a que es un $tipoMascota")
    }

    open fun comer() {

        println("$nombre esta comiendo")
    }

   open fun dormir() {

        println("$nombre esta durmiendo")
    }



}

class Perro(nombre: String, edad: Int, val raza: String) : Mascotas(nombre, edad, "Perro") {

    override fun hacerSonido()
    {
        println("$nombre dice: guau!!")

    }
    override fun comer() {
        println("$nombre esta comiendo comida para la raza $raza, porque es un $tipoMascota")
    }
    override fun dormir() {
        println("El perro esta durmiendo")
    }
}

class Gato(nombre: String, edad: Int, val raza: String) : Mascotas(nombre, edad, "Gato") {

    override fun hacerSonido()
    {
        println("$nombre dice: miau!!")

    }

    override fun comer() {
        println("$nombre esta comiendo comida, porque es un $tipoMascota")
    }

    override fun dormir() {
        println("El gato esta durmiendo")
    }

}

//función principal
//Open class ---> Permite que otras clsaes hereden de ella (HERNECIA)
//override --> Permite sobreescribir el comportaminto de los métodos de la clase padre (PÖLIMORFISMO)
fun main(){

    val misMascotas = listOf<Mascotas>(
        Perro("firulais", 3, "Caniche"),
        Gato("Michi",2,"Siamés"),
        Perro("Rocco", 5, "Adoptado"),
        Gato("Michifus!", 7, "Panterita"))

    for(mascota in misMascotas){

        mascota.hacerSonido()
        mascota.comer()
        mascota.dormir()

    }

}
