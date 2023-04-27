package com.example.pertemuan5_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pertemuan5_recyclerview.databinding.CardviewLayoutBinding

class CardViewAdapter (private val context : Context, private val listSiswa : ArrayList<Contact>)
    : RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    class ViewHolder(val binding: CardviewLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CardviewLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSiswa.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textNama.text = listSiswa[position].nama
        Glide.with(holder.itemView.context)
            .load(listSiswa[position].foto)
            .into(holder.binding.circleImage)
        holder.binding.cardview.setOnClickListener {
            val inten = Intent(context, DetailActivity::class.java)
            inten.putExtra("nim", listSiswa[position].nim)
            inten.putExtra("nama", listSiswa[position].nama)
            inten.putExtra("nomorTel", listSiswa[position].noHP)
            inten.putExtra("foto", listSiswa[position].foto)
            context.startActivity(inten)
        }
    }
}