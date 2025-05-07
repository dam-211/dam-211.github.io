package ar.edu.ifts18.popupdialog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etTextoNombre: EditText
    private lateinit var btnGuardar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTextoNombre = findViewById(R.id.etUsuario)
        btnGuardar = findViewById(R.id.btnGuardar)

        val preferencias = getSharedPreferences("prefs", MODE_PRIVATE)

        btnGuardar.setOnClickListener {

            val nombre = etTextoNombre.text.toString()

            if(nombre.isNotEmpty()) {

                preferencias.edit().putString("nombre_usuario", nombre).apply()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)

            } else {

                AlertDialog.Builder(this)
                    .setTitle("Error grave")
                    .setMessage("Por favor introduzca el nombre de usuario")
                    .setPositiveButton("Ok", null)
                    .show()

            }
        }

    }
