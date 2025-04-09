package ar.edu.ifts18.comoperrosgatos

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var textoMascotas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        textoMascotas = findViewById(R.id.tvMastcotas)

        val listaDeMascotas: List<Mascotas> = listOf(
            Perro("Firulais", 4),
            Gato("Trizzia", 2),
            Gato("Mishi", 4),
            Perro("Rambo", 5)
        )

        //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
        //A PARTIR DE ESTE MOMENTO PASAMOS DEL PARADIGMA DE OBJETOS Y PROCEDURAL A FUNCIONAL!!
        //-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

        //Funciones Lambda!

        val resultado = listaDeMascotas.joinToString ("\n") {it.hacerSonido()}
        textoMascotas.text = resultado
    }
}
