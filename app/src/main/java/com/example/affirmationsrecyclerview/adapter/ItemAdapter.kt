package com.example.affirmationsrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsrecyclerview.R
import com.example.affirmationsrecyclerview.model.Affirmation

//El contexto es para resolver recursos de strings que se almacenan en el Context
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //clase anidada, los viewHolder representan cada vista de mi lista
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder( view ) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //Crear nuevas interfaces de vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Creacion de nueva view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //Reemplaza el contenido de una vista de elementos de lista, con una vista y su posicion
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        //update las vistas del container
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //Obtiene el tamaño del conjunto de datos
    override fun getItemCount() = dataset.size
}