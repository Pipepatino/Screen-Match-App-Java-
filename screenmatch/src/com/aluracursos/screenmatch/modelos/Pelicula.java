package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    //------------------------------------------------------------
    // Declaracion de variables privadas
    //------------------------------------------------------------
    private String director;

    //------------------------------------------------------------
    // Declaracion de getters
    //------------------------------------------------------------
    public String getDirector() {
        return director;
    }

    //------------------------------------------------------------
    // Declaracion de setters
    //------------------------------------------------------------
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
