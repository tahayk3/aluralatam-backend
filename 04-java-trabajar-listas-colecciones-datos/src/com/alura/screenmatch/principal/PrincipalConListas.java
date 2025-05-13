package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        //creando series y peliculas
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 180);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        //creando lista de tipo Pelicula
        ArrayList<Titulo> lista = new ArrayList<>();
        //agregando peliculas a lista
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        //recorriendo lista
        for ( Titulo item: lista){
            System.out.println(item.getNombre());
            //peliculaConvertida crea una variable de refencia de tipo Pelicula( hace el casting)
            //se puede aplicar condiciones a esa variable: && peliculaConvertida.getClasificacion() >2
            if (item instanceof Pelicula peliculaConvertida && peliculaConvertida.getClasificacion() >2){
                System.out.println(peliculaConvertida.getClasificacion());
            }
        }


    }
}
