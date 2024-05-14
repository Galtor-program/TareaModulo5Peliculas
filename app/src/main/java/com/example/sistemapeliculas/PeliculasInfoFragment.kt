package com.example.sistemapeliculas
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.sistemapeliculas.adapters.PeliculaAdapter
import com.example.sistemapeliculas.databinding.PeliculaInfoFragmentBinding
import com.example.sistemapeliculas.entities.Pelicula
import com.google.android.material.bottomsheet.BottomSheetDialog

import com.google.android.material.bottomsheet.BottomSheetDialogFragment



class PeliculasInfoFragment: BottomSheetDialogFragment() {
    private lateinit var binding: PeliculaInfoFragmentBinding
    lateinit var currentPelicula: Pelicula

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pelicula_info_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PeliculaInfoFragmentBinding.bind(view)
        binding.titluloTxt.text = currentPelicula.nombre
        binding.imagenPelicula.setImageResource(currentPelicula.imageResId)
        binding.directorTxt.text = currentPelicula.Director
        binding.anoPeliculatxt.text = currentPelicula.añoCreacion.toString()
        binding.shareTxt.setOnClickListener {
            enviarCorreoPelicula(currentPelicula)
        }

    }

    private fun enviarCorreoPelicula(pelicula: Pelicula) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("felipetorog@gmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Envío de Pelicula")
        intent.putExtra(
            Intent.EXTRA_TEXT, "Envio de datos de pelicula"
                    + pelicula.nombre + ",Director: " + pelicula.Director + ", Fecha: " + pelicula.añoCreacion
        )
        startActivity(Intent.createChooser(intent,"Enviar Correo"))

    }
}



