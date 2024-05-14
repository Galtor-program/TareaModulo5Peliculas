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
            Pelicula("Acción","El Caballero Oscuro", 2008,"Christopher Nolan", R.drawable.caballerooscuro),
            Pelicula("Drama","Schlinder List",1993,"Steven Spielberg", R.drawable.listasch),
            Pelicula("Acción","Pulp Fiction", 1994,"Quentin Tarantino", R.drawable.pulp),
            Pelicula("Drama","El Club de la Pelea",1999,"David Fincher" , R.drawable.pelea),
            Pelicula("Thriller","Seven", 1995,"David Fincher", R.drawable.seven),
            Pelicula("Drama","Los 7 samurais", 1954,"Akira Kurosawa", R.drawable.samurai),
            Pelicula("Aventura","Regreso al futuro", 1985,"Robert Zemequis", R.drawable.futuro),
            Pelicula("Thriller","La Naranja Mecánica", 1971,"Stanley Kubrick", R.drawable.naranja),
            Pelicula("Drama","Gladiador",2000,"Riddley Scott", R.drawable.gladiador),
            Pelicula("Drama","El Profesional", 1994,"Luc Besson", R.drawable.leon),
            Pelicula("Drama","Amadeus", 1984,"Milos Forman", R.drawable.amadeus),
            Pelicula("Accion","American History X",1998,"Tony Kaye", R.drawable.american),
            Pelicula("Sci-fi","StarWars", 1977,"George Lucas", R.drawable.starwars),
            Pelicula("Drama","Alien",1979,"Riddley Scott", R.drawable.alien),
            Pelicula("Thriller","Memento", 2000,"Christopher Nolan", R.drawable.memento),
            Pelicula("Terror","El resplandor", 1975,"Stanley Kubrick", R.drawable.shine),
            Pelicula("Thriller","Joker", 2019,"Todd Phillips", R.drawable.joker),
            Pelicula("Drama","El hombre elefante", 1980,"David Lynch", R.drawable.elefante),

        )
    }

}