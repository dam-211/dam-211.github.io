package ar.edu.ifts18.radiospinner

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerPaises: Spinner
    private lateinit var btnMostrarSeleccion: Button
    private lateinit var tvResultado: TextView
    private lateinit var etFechaMedicion: EditText
    private lateinit var cbNotificaciones: CheckBox
    private lateinit var cbRecordar: CheckBox
    // private lateinit var rgRadioGroup: RadioGroup // comentado si no se usa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Inicializar vistas
        spinnerPaises = findViewById(R.id.spPaises)
        btnMostrarSeleccion = findViewById(R.id.btnMostrarSelecciones)
        tvResultado = findViewById(R.id.textResultados)
        etFechaMedicion = findViewById(R.id.etFechaMedicion)
        cbRecordar = findViewById(R.id.cbRecordar)
        cbNotificaciones = findViewById(R.id.cbNotificaciones)

        // Configurar Spinner
        val paises = listOf("Argentina", "Chile", "Paraguay", "Colombia")
        val adaptadorSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, paises)
        adaptadorSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPaises.adapter = adaptadorSpinner

        // Mostrar selección y abrir calendario
        btnMostrarSeleccion.setOnClickListener {
            val seleccion = spinnerPaises.selectedItem.toString()

            val calendario = Calendar.getInstance()
            val anio = calendario.get(Calendar.YEAR)
            val mes = calendario.get(Calendar.MONTH)
            val dia = calendario.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this, { _, y, m, d ->
                val fechaSeleccionada = "%02d/%02d/%04d".format(d, m + 1, y)
                tvResultado.text = "País: $seleccion\nFecha: $fechaSeleccionada"
            }, anio, mes, dia)

            datePicker.show()
        }
    }
}
