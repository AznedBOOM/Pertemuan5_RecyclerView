package com.example.pertemuan5_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuan5_recyclerview.databinding.ListviewLayoutBinding

class ListViewAdapter (private val context : Context, private val listSiswa : ArrayList<Contact>)
    : RecyclerView.Adapter<ListViewAdapter.ViewHolder>() {

    class ViewHolder(val binding: ListviewLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ListviewLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSiswa.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tempatNim.text = listSiswa[position].nim
        holder.binding.tempatNama.text = listSiswa[position].nama
        holder.binding.tempatNohp.text = listSiswa[position].noHP
        holder.binding.itemView.setOnClickListener {
            val inten = Intent(context, DetailActivity::class.java)
            inten.putExtra("nim", listSiswa[position].nim)
            inten.putExtra("nama", listSiswa[position].nama)
            inten.putExtra("nomorTel", listSiswa[position].noHP)
            inten.putExtra("foto", listSiswa[position].foto)
            context.startActivity(inten)
        }
    }
}