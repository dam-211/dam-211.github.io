package ar.edu.ifts18.popupdialog

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

    val preferencias = getSharedPreferences("prefs", MODE_PRIVATE)
    val nombre = preferencias.getString("nombre_usuario", "Usuario")

        mostrarPopUp(nombre ?: "UsuarioGen")

        findViewById<Button>(R.id.btnBorrar).setOnClickListener {

            preferencias.edit().clear().apply()
            finish() //Volver al mainActivity

        }
    }
