package com.tahayk3.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4)
        {
            System.out.println("Buena calificacion");
        } else if (clasificacion.getClasificacion() == 2) {
            System.out.println("popular en el momento");
        } else {
            System.out.println("ver mas tarde");
        }

    }
}
