package com.example.sistemapeliculas.entities

import com.example.sistemapeliculas.R

data class Pelicula(
    val categoria :String,
    val nombre: String,
    val añoCreacion: Int,
    val Director: String,
    val imageResId: Int = 1
) {

    companion object{
        val dataPelicula = mutableListOf(
            Pelicula("Accion","El Padrino",1972,"Francis Ford Coppola", R.drawable.elpadrino),
            Pelicula("Drama","Cadena Perpetua", 1994,"Frank Darabond", R.drawable.cadenaperpetua),
            Pelicula("Acción","El Caballero Oscuro", 2008,"Christopher Nolan"),
            Pelicula("Drama","Schlinder List",1993,"Steven Spielberg"),
            Pelicula("Acción","Pulp Fiction", 1994,"Quentin Tarantino"),
            Pelicula("Drama","El Club de la Pelea",1999,"David Fincher"),
            Pelicula("Thriller","Seven", 1995,"David Fincher"),
            Pelicula("Drama","Los 7 samurais", 1954,"Akira Kurosawa"),
            Pelicula("Aventura","Regreso al futuro", 1985,"Robert Zemequis"),
            Pelicula("Thriller","La Naranja Mecánica", 1971,"Stanley Kubrick"),
            Pelicula("Drama","Gladiador",2000,"Riddley Scott"),
            Pelicula("Drama","El Profesional", 1994,"Luc Besson"),
            Pelicula("Drama","El Cisne Negro", 1992,"Darren Aronovsky"),
            Pelicula("Accion","Pulp Fiction",2000,"Quentin Tarantino"),
            Pelicula("Sci-fi","StarWars", 1977,"George Lucas"),
            Pelicula("Drama","Alien",1979,"Riddley Scott"),
            Pelicula("Thriller","Memento", 2000,"Christopher Nolan"),
            Pelicula("Terror","El resplandor", 1975,"Stanley Kubrick"),
            Pelicula("Thriller","Ciudadano Kane", 1941,"Orson Welles"),
            Pelicula("Drama","El hombre elefante", 1980,"David Lynch"),

        )
    }

}