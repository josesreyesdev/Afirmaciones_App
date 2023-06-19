package com.example.affirmationsrecyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsrecyclerview.R

//clase anidada, los viewHolder representan cada vista de mi lista
class ItemViewHolder2(view: View): RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.item_title)
    val imageView: ImageView = view.findViewById(R.id.item_image)
}