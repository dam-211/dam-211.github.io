package ar.edu.ifts18.fragment3

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_input, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val btnEnviar = view.findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {


            val nombre = etNombre.text.toString()

            if (nombre.isNotBlank()) {

                val intent = Intent(requireContext(), SecondActivity::class.java)
                intent.putExtra("nombre_usuario", nombre)
                startActivity(intent)

            } else {

                Toast.makeText(requireContext(), "Ingresá un nombre", Toast.LENGTH_SHORT).show()
            }

        }

    }

}
