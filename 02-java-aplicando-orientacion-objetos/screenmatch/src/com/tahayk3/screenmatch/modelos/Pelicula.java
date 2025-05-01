package com.tahayk3.screenmatch.modelos;

public class Pelicula {

    //propiedades
    private String nombre;
    private int fechaDeLanzamiento;
    private int  duracionEnMinutos;
    private boolean incluirEnPlan;
    private double sumaDeLasCalificaciones;
    private int totaEvaluaciones;

    //metodos accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluirEnPlan() {
        return incluirEnPlan;
    }

    public void setIncluirEnPlan(boolean incluirEnPlan) {
        this.incluirEnPlan = incluirEnPlan;
    }

    public int getTotaEvaluaciones(){
        return totaEvaluaciones;
    }


    //Metodos
    public void mostrarFichaTecnnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre );
        System.out.println("La fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("La duracion de lanzamiento es: "+ duracionEnMinutos);
        System.out.println("Incluido en plan: "+ incluirEnPlan);
    }

    public void evalua(double calificacion){
        sumaDeLasCalificaciones = sumaDeLasCalificaciones + calificacion;
        totaEvaluaciones++;
    }

    public double calcularMedia(){
        return sumaDeLasCalificaciones / totaEvaluaciones;
    }
}
