package com.tahayk3.screenmatch.calculos;

import com.tahayk3.screenmatch.modelos.Pelicula;
import com.tahayk3.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
     private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
         this.tiempoTotal = this.tiempoTotal +  titulo.getDuracionEnMinutos();
     }
}
