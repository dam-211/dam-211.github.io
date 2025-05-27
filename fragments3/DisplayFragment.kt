package ar.edu.ifts18.fragment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_display, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        //Obtener el argunmento del otro activity!!

        val nombre = activity?.intent?.getStringExtra("nombre_usuario")

        tvResultado.text = "Hola! $nombre"

    }

}
