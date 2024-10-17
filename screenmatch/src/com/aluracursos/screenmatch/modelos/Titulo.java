package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluirEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalEvaluaciones;

    // ------------------------------------------------------
    // Asignar los "Getters":
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    // ------------------------------------------------------
    // Asignar los "Setters":
    public boolean isIncluirEnElPlan() {
        return incluirEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluirEnElPlan(boolean incluirEnElPlan) {
        this.incluirEnElPlan = incluirEnElPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    private double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}