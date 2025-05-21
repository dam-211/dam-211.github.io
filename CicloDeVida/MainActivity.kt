package ar.edu.ifts18.ciclodevida

import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Log.d --> Loggin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mostrarMensaje("estoy en el OnCreate")

    }

    override fun onStart() {
        super.onStart()
        mostrarMensaje("estoy en el OnStart")
    }

    override fun onPause() {
        super.onPause()
        mostrarMensaje("etoy en el onPause")
    }

    override fun onStop() {
        super.onStop()
        mostrarMensaje("estoy en el onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        mostrarMensaje("OnDestroyyyyy")
    }

    override fun onRestart() {
        super.onRestart()
        mostrarMensaje("estoy en restart")
    }

    override fun onResume() {
        super.onResume()
        mostrarMensaje("estoy en resume")
    }


    private fun mostrarMensaje(metodo: String) {

        Toast.makeText(this, metodo, Toast.LENGTH_SHORT).show()
        Log.d("CICLO_DE_VIdA", metodo)

    }

}
