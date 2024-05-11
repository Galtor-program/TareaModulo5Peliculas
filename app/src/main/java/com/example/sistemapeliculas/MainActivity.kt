package com.example.sistemapeliculas

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sistemapeliculas.adapters.PeliculaAdapter

import com.example.sistemapeliculas.databinding.ActivityMainBinding
import com.example.sistemapeliculas.entities.Pelicula

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerPeliculas.layoutManager = LinearLayoutManager(this)
        initAdapter()
    }

    private fun initAdapter() {
        val peliculaAdapter = PeliculaAdapter()
        binding.recyclerPeliculas.adapter = peliculaAdapter
        peliculaAdapter.pelicula = Pelicula.dataPelicula
        peliculaAdapter.onItemClickListener = { pelicula ->
            Toast.makeText(
                this, pelicula.Director,
                Toast.LENGTH_LONG
            ).show()
        }


    }

}

