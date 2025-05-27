package ar.edu.ifts18.fragment3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Es una instancia del administrador de fragmentos asociado al activity
        //Se usa para agregar, reemplazar, quitar, o manipular fragments (back stack)
        supportFragmentManager.beginTransaction()
            //Remplaza el contenido del viewgroup con ID fragment_container con una nueva instancia de InputFragment
            .replace(R.id.fragment_container, InputFragment())
            .addToBackStack("login")
            .commit()

        //beginTransaction: iniciar una transaccion de fragmentos
        //Toda modificación de fragments deben hacerse dentro de un transaction

        //Para que funcione debe haber una clase que extienda de Fragment y un contenedor del fragment
    }
}
