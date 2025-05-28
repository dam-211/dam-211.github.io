package ar.edu.ifts18.mvvm

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tvContador: TextView
    private lateinit var btnSumar: Button

    private val viewModel: ContadorViewModel by viewModels()

    //La VIEW
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvContador = findViewById(R.id.tvContador)
        btnSumar = findViewById(R.id.btnSumar)

        //EL OBSERVER!!!!
        viewModel.contadorParaQueVeaElObserver.observe(this) { ricardoDarin ->

            Log.d("OBS", "ACA TOY")
            tvContador.text = ricardoDarin.toString()

        }

    btnSumar.setOnClickListener {

        viewModel.incrementar()

    }

    }
}
