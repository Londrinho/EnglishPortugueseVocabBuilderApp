package com.jimmy.englishportuguesevocabbuilderapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.jimmy.englishportuguesevocabbuilderapp.AlFragment
import com.jimmy.englishportuguesevocabbuilderapp.R
import com.jimmy.englishportuguesevocabbuilderapp.model.AlWords

class ItemAdapterAl(private val context: AlFragment,  val dataset: List<AlWords>) : RecyclerView.Adapter<ItemAdapterAl.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}