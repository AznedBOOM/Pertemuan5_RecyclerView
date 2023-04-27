package com.example.pertemuan5_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.pertemuan5_recyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val noHP = intent.getStringExtra("nomorTel")
        val foto = intent.getStringExtra("foto")

        binding.textNim.text = nim
        binding.textNama.text = nama
        binding.textTelp.text = noHP
        Glide.with(this).load(foto).into(binding.circleImage)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }else -> super.onOptionsItemSelected(item)
        }
    }
}