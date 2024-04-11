package org.example.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {

    private List<Pelicula> peliculas;

    private List<Pelicula> reproducidas;

    private Sugerencia sugerencia;

    public Decodificador(){
        this.peliculas = new ArrayList<Pelicula>();
        this.reproducidas = new ArrayList<Pelicula>();
        this.sugerencia = new SugerenciaNull();
    }

    public void agregarAGrilla(Pelicula peli){
        this.peliculas.add(peli);
    }

    public void agregarReproducida(Pelicula peli){
        this.reproducidas.add(peli);
    }

    public List<Pelicula> getPeliculas(){
        return this.peliculas;
    }

    public List<Pelicula> getReproducidas(){
        return this.reproducidas;
    }

    public List<Pelicula> obtenerPelisSinReproducir(){
        for (Pelicula peli: this.peliculas.stream().filter(p -> !this.reproducidas.contains(p)).collect(Collectors.toList())) {
            System.out.println(peli);
        }
        return this.peliculas.stream().filter(p -> !this.reproducidas.contains(p)).collect(Collectors.toList());
    }

    public void setSugerencia(Sugerencia estrategia){
        this.sugerencia = sugerencia;
    }

    public List<Pelicula> getRecomendaciones(){
        return this.sugerencia.getRecomendaciones(this);
    }




}
