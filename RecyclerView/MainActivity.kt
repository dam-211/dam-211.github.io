package ar.edu.ifts18.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val listaVengadores = listOf("Iron Man", "Thor", "Bruja Escarlata", "Capitán Marvel", "Stark", "Hércules", "Falcon", "Wolverine")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val vistaReciclada = findViewById<RecyclerView>(R.id.rvTarjetasVengadores)


        //Esto le indica al RecyclerView como debe organizar los elementos
        //En este caso, elementos en forma verticual (o depende la config que le di en el XML)
        //El cntext es el activity en donde esta parado
        vistaReciclada.layoutManager = LinearLayoutManager(this)

        //Asignar un adapter para mostrar los datos
        //La lista de los vengadores y el contexto para el toast
        //Conectar (por eso se llama adapter) entre los datos y la vista
        vistaReciclada.adapter = VengadoresAdapter(listaVengadores, this)


        //Se asigna un LayoutManager que organiza los items de manera vertical
        //Y el adapter: Crear las vistas(onCreateViewHolder), Rellena los datos (on onBindViewHolder)
        //Y al hacer click muestro el toast.

    }
}
