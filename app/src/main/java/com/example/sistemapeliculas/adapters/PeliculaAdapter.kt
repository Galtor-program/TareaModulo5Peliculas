package com.example.sistemapeliculas.adapters

import android.text.style.ClickableSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemapeliculas.databinding.PeliculasItemsBinding
import com.example.sistemapeliculas.entities.Pelicula

private val TAG = PeliculaAdapter::class.java.simpleName
    class PeliculaAdapter : RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder>() {

        lateinit var onItemClickListener: (Pelicula) -> Unit

        var pelicula = mutableListOf<Pelicula>()
            set(value) {
                field = value
                this.notifyDataSetChanged()
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                PeliculaAdapter.PeliculaViewHolder {
            val bindingItem = PeliculasItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
            return PeliculaViewHolder(bindingItem)
        }

        override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
            val pelicula: Pelicula = pelicula[position]
            holder.bind(pelicula)
        }

        override fun getItemCount(): Int {
            return pelicula.size
        }


        inner class PeliculaViewHolder(private var bindingItem: PeliculasItemsBinding) :
            RecyclerView.ViewHolder(bindingItem.root) {
            fun bind(pelicula: Pelicula) {
                with(pelicula) {
                    bindingItem.categoriaTxt.text = categoria
                    bindingItem.nombreTxt.text = nombre
                }
                bindingItem.root.setOnClickListener {
                    if (::onItemClickListener.isInitialized) {
                        onItemClickListener(pelicula)
                    } else {
                        Log.e(TAG,"Listener no inicializado")
                    }
                }

            }
        }

    }
