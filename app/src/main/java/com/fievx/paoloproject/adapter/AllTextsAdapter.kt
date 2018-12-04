package com.fievx.paoloproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fievx.paoloproject.R

class AllTextsAdapter : RecyclerView.Adapter<AllTextViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllTextViewHolder {
        return AllTextViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_simple_text, parent, false))
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: AllTextViewHolder, position: Int) {
        holder.bind()
    }
}

class AllTextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(){
        itemView.findViewById<TextView>(R.id.tv).text = "Item ${adapterPosition}"
    }
}