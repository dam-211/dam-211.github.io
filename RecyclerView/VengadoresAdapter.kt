package ar.edu.ifts18.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// Adapter personalizado que conecta la lista de Vengadores con el RecyclerView.
// Extiende RecyclerView.Adapter e indica que usará VengadoresViewHolder como tipo de ViewHolder.
class VengadoresAdapter(
    private val vengadores: List<String>, // Lista de nombres de Vengadores.
    private val contexto: Context          // Contexto de la aplicación (necesario para inflar vistas y mostrar toasts).
) : RecyclerView.Adapter<VengadoresAdapter.VengadoresViewHolder>() {

    // ViewHolder que contiene las referencias a los elementos visuales de cada ítem.
    // Utiliza item_vengador.xml como layout base.
    class VengadoresViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombreDelVengador: TextView = itemView.findViewById(R.id.tvNombreVengador)
        val tvSuperpoder: TextView = itemView.findViewById(R.id.tvSuperpoder)
    }

    // Infla el layout de cada ítem (item_vengador.xml) y crea un nuevo ViewHolder.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VengadoresViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_vengador, parent, false)
        return VengadoresViewHolder(vista)
    }

    // Asocia los datos del ítem en la posición indicada con el ViewHolder.
    // También configura el evento de clic para mostrar un mensaje.
    override fun onBindViewHolder(holder: VengadoresViewHolder, position: Int) {
        val nombreVengador = vengadores[position]
        holder.tvNombreDelVengador.text = nombreVengador
        holder.tvSuperpoder.text = "#${position + 1}"

        holder.itemView.setOnClickListener {
            Toast.makeText(contexto, "Seleccionado el vengador: $nombreVengador", Toast.LENGTH_SHORT).show()
        }
    }

    // Devuelve la cantidad total de ítems a mostrar.
    override fun getItemCount(): Int = vengadores.size
}
