package com.example.floweria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewFlower(private val listFlower: ArrayList<Flower>): RecyclerView.Adapter<CardViewFlower.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var name: TextView = itemView.findViewById(R.id.tv_item_name)
        var desc: TextView = itemView.findViewById(R.id.tv_item_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_view_flower, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val flower = listFlower[position]

        Glide.with(holder.itemView.context)
            .load(flower.photo)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)

        holder.name.text = flower.name
        holder.desc.text = flower.desc
    }

    override fun getItemCount(): Int {
        return listFlower.size
    }
}