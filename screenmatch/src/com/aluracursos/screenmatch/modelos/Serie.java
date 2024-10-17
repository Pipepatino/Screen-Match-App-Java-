package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    //------------------------------------------------------------
    // Declaracion de variables privadas
    //------------------------------------------------------------
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //------------------------------------------------------------
    // Declaracion de Metodos
    //------------------------------------------------------------
    public int getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    //------------------------------------------------------------
    // Declaracion de Setters y Getters
    //------------------------------------------------------------

    // Variable Temporadas
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Variable Episodios por temporada

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Variable Minutos por Episodio
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


}
