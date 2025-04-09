package ar.edu.ifts18.kotlinconsola

abstract class Vehiculo(val marca: String, val modelo: String, val anio: Int){

    //Es una palabra reservada para que una clase o metodo pueda ser heredado o sobreescrito
    open fun encender() {
        println("El vehículo $marca, $modelo esta encendido")
    }

    open fun apagar(){
        println("Esta apagado - Clase padre")
    }

    //Método abstract, es decir que la clase hija lo debe implementar
    //Me obliga a tener que implementarlo

    abstract fun obtenerTipo(): String

}

class Auto(marca: String, modelo: String, anio: Int, puertas: Int) : Vehiculo(marca, modelo, anio){


    override fun obtenerTipo(): String {
       return "Auto"
    }

    override fun encender() {
        println("El auto, $marca $modelo se enciende!")
    }


}

class Moto(marca: String, modelo: String, anio: Int, cilindrada: Int) : Vehiculo(marca, modelo, anio){


    override fun obtenerTipo(): String {
        return "Moto"
    }

    override fun encender() {
        println("La moto $marca, $modelo, se encinde electricamente")
    }

    override fun apagar() {
        println("La moto la apago facil y la estaciono")
    }


}


fun main() {

    val miAuto = Auto("Ford", "Taunus", 2022, 4)
    val miMoto = Moto("Honda", "CBR 250", 2021, 600)

    miMoto.obtenerTipo()
    miAuto.encender()
    miMoto.encender()

    println( miAuto.obtenerTipo())
    miAuto.apagar()
    miMoto.apagar()




//La clase auto hereda de vehiculo
    /*
    Tiene la propiedad puertas, sobreescribe encender para mostrar un mensaje diferente a la de su clase padre
    La clase moto hereda de vehiuclo y tiene la propiedad cilindrada
    y sobreescribe el método enenceder.

    en nuestra función main, hacemos uso del polimorfismo, es decir, su propia clase tendrá su propia impmple de encender y apagar.
     */
}
