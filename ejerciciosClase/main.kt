package ar.edu.ifts18.kotlinconsola

fun main(argumentos: Array<String>){

    println("Hola Mundo!")

    var numeroLoco = 1 //Infiere el tipo de dato

    var numeroLoco2: Int = 2 //ASignamos variable de tipo Int

    var nombre: String
    nombre = "IFTS 18"

    var edad: Int = 10

    var porcentajeDeDescuent: Double = 21.5

    var genero: Char = 'X'

    var numeroGrande: Long = 523645896547125 //-9,223,372,036,854,775,807 a 9,223,372,036,854,775,807.

    var boleano: Boolean = false



    val a: Int = 11
    val b: Int = 5

    println(a+b)
    println(a*b)
    println(a%b)


    var soyUnFloat: Float = 55.5f
    var voyADejarDeSerEntero: Int = 50

    var result: Int = soyUnFloat.toInt() + voyADejarDeSerEntero

    println(result)

    val saludos: String = "Hola"
    val nombre3: String = "IFTS"

    println("Esto es un saludo " + saludos + " " + nombre3)
    println("$saludos $nombre3")

    val frase: String = "Esto es una operacion de "
    val suma: String = "mas"
    val numA: Int = 2
    val numB: Int = 7

    println("$frase suma entre ${numA.toString()} $suma $numB es: ${numA + numB}")


    fun mostrarMiNombre(){

        println("Mi nombre es IFTS 18")

    }

    fun mostrarApellido() = println("Mansilla")

    mostrarApellido()
    mostrarMiNombre()


    fun mostrarInformacionCompleta(nombre: String, apellido: String, edad: Int){

        println("###### El nombre es $nombre, su apellido es $apellido, con una edad de $edad")
    }


    mostrarInformacionCompleta("Carlos", "Gomez", 56)


   fun sumar(numeroA: Int, numeroB: Int): Int {

       return numeroA + numeroB

   }

    fun sumarMejor(numeroA: Int, numeroB: Int): Int = numeroA + numeroB

    println(sumarMejor(5,9))


    if(sumarMejor(5,9) > 5) {

        println("Sumar mejor ${sumarMejor(5,9)}")

    }

    val animal:String = "perro"

    if(animal == "perro") {

            println("Es perro")
    }else if (animal == "gato"){

    }else if (animal == "pajaro"){

    }

    fun obtenerMes(mes: Int) {

        when (mes) {
            1,2,3,4 -> print("Enero")
            5 -> print("Feb")
            6 -> print("Mar")
            7 -> print("Otros meses")
            else -> { print("ERROR NO ES VALIDO")}
        }


    }

    fun obtenerSemestre(mes: Int) {

        when (mes) {
            in 1..6 -> print("Primer semestre")
            in 7..12 -> print("Segundo Semestre")

            else -> { print("ERROR NO ES VALIDO")}
        }
    }

    fun obtenerSemestreMejorado(mes: Int) {

        when (mes) {
            in 1..6 -> print("Primer semestre")
            in 7..12 -> print("Segundo Semestre")
            !in 1..12 -> print("No es un mes valido")
            else -> { print("ERROR NO ES VALIDO")}
        }
    }

    fun validarVar(value: Any){

        when(value) {

            is Int -> print(value + 5)
            is Boolean -> if(value) println("Es verdadero") else println("No es verdadero")
            is String -> println("Es un string $value")
        }

    }


    validarVar(false)
    obtenerMes(2)
    obtenerSemestre(5)
}
