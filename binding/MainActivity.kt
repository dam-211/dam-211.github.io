package ar.edu.ifts18.binding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ar.edu.ifts18.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Declaramos nuestro viewBinding
    //ActivityMainBinding = Es la clase generada automaticamente por Android la cual es una representacion de activity_main.xml
    private lateinit var binding: ActivityMainBinding
    //Lo guardamos dentro de una var para poder acceder facilmente a todos los elementos del layout.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //Inicializamos el binding y usarmo root como vista principal
    //inflate(layoutInflater), crear un objeto de tipo ActivityMainBinding y lo muesra en pantalla (render)
    binding = ActivityMainBinding.inflate(layoutInflater)

    //binding.root = Es la vista principal (root) del layout XML (<LinerarLayout>, ect)
    //setContentView = Le indica a Android que pantalla quiero mostrar, en lugar de utilizar R.layout.activity:main, usamos biniding.root.
    setContentView(binding.root) //Espera una view, es lo mismo que: setContentView(R.id...)

    //Manejamos el evento del click usando binding

    binding.btnSaludar.setOnClickListener {

        //ViewBinding reconoce los IDs como propiedades, isn necesidad de findViewVyID, sin casting, sin errores, ect.
        binding.tvTexto.text = "Hola te saludo desde un binding"
        Toast.makeText(this, "Solo conozco el éxito!", Toast.LENGTH_SHORT).show()
        }
    }
}
