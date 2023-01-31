package com.example.exercicio2.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicio2.databinding.ItemRvBinding

class MainAdapter(val list: List<String>): RecyclerView.Adapter<MainAdapter.MainViewHolder>(){

    inner class MainViewHolder (val itemBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(number: String){
            itemBinding.tvNumber.text = number
            itemBinding.cvItem.setBackgroundColor(if(number.toInt()%2 == 0) Color.GRAY else Color.WHITE )
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val number = list[position]
        holder.bindItem(number)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}