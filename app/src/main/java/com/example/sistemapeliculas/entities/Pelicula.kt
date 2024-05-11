package com.example.sistemapeliculas.entities

data class Pelicula(
    val categoria :String,
    val nombre: String,
    val añoCreacion: Int,
    val Director: String,

) {

    companion object{
        val dataPelicula = mutableListOf(
            Pelicula("Accion","El Padrino",1994,"El Director"),
            Pelicula("Aventura","El Arca Perdida", 1832,"Steven Spielberg"),
            Pelicula("Drama","El Cisne Negro", 1992,"Darren Aronovsky"),
            Pelicula("Accion","Pulp Fiction",2000,"Quentin Tarantino"),
            Pelicula("Sci-fi","StarWars", 1978,"George Lucas"),
            Pelicula("Drama","El Club de la Pelea",1998,"David Fincher"),
            Pelicula("Thriller","La Naranja Mecánica", 1975,"Stanley Kubrick"),
            Pelicula("Sci-fi","Avengers",2000,"Ni idea")

        )
    }

}