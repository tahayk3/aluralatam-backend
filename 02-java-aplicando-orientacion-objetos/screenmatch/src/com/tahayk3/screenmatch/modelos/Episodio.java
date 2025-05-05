package com.tahayk3.screenmatch.modelos;

import com.tahayk3.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    //aqui se forma la relacion entre serie y episodio
    private Serie serie;

    public int getTotalVisualizaciones() {
        return TotalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        TotalVisualizaciones = totalVisualizaciones;
    }

    private int TotalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion(){
       if(TotalVisualizaciones >100){
           return 4;
       }
       else{
           return 2;
       }
    }


}
