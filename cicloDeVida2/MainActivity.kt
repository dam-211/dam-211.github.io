package ar.edu.ifts18.ciclodevida

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Lo vamos a usar para inicializar componentes
        //cartgar layoutl, configurar botones, inicializar variables, cargar datos del disco, ect.

        setContentView(R.layout.activity_main)

        mostrarMensaje("estoy en el OnCreate")

        mediaPlayer = MediaPlayer.create(this, R.raw.vidrio_roto)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()
    }

    override fun onStart() {
        super.onStart()
        mostrarMensaje("estoy en el OnStart")
        //Lo llamo cada vez que la actividad vuelve a ser visible para el usuario
        //Prepara la UI para el usuario. Puede chequear permisos, refresh de la interfaz, preparar sensores, ect
    }

    override fun onPause() {
        super.onPause()
        mostrarMensaje("etoy en el onPause")
        mediaPlayer?.pause()
        //Se llama cuando queda parcialmente visible
        //O cuando transciono hacia otra app.
        //Puedo pausar tareas que consumen recursos, como pausar musica, 
        //Guardar un documento o el estado actual, pausar animaciones, detener sensores, detener audio/video
    }

    override fun onStop() {
        super.onStop()
        mostrarMensaje("estoy en el onStop")
        
        //Cuando la actividad no es visible.
        //Libero RR si no van a ser usados en el momento
        //Detengo servicios, guardo .commit(), en SQLIte,
        //No se si efectivamente el usuario va a voler.
    }

    override fun onDestroy() {
        super.onDestroy()
        mostrarMensaje("OnDestroyyyyy")

        mediaPlayer?.release()
        mediaPlayer = null

        Log.d("CICLO_DE_VIdA", "Memoria liberada y free!")
        //SE llama justo antes de que la actividad se destruya.
        //Liberamos recursos por completo.
        //Cerramos bbdd, guardamos el ultimo etado de un archivo,
        //Evita los memory leaks
    }

    override fun onRestart() {
        super.onRestart()
        mostrarMensaje("estoy en restart")
        //Se llama cuando estaba en onStop.
        //Se prepara para reiniciar las conexiones, reunudar animaciones, 
        //refresacar datos en tiempo real.
    }

    override fun onResume() {
        super.onResume()
        mostrarMensaje("estoy en resume")
        mediaPlayer?.start()
        //el usuario vuelve a interactuar con la app
        //Reinicializo sensores, abro archivos que antes cerré, ect.
    }


    private fun mostrarMensaje(metodo: String) {

        Toast.makeText(this, metodo, Toast.LENGTH_SHORT).show()
        Log.d("CICLO_DE_VIdA", metodo)
