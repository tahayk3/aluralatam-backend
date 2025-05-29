package com.tahayk3.screenmatch.principal;

import com.tahayk3.screenmatch.model.DatosSerie;
import com.tahayk3.screenmatch.model.DatosTemporadas;
import com.tahayk3.screenmatch.service.ConsumoAPI;
import com.tahayk3.screenmatch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=c056cac2";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraMenu(){
        System.out.println("Escribe el nombre de la serie que deseas buscar");

        //busqueda de datos generales de la serie
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace(" ", "+")+API_KEY);
        var datos =  conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);

        //buscar datos de toda la temporada
        List<DatosTemporadas> temporadasLista = new ArrayList<>();
        for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
            json =  consumoApi.obtenerDatos(URL_BASE+ nombreSerie.replace(" ", "+") + "&Season="+i+API_KEY);
            var datosTemporada = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadasLista.add(datosTemporada);
        }
        temporadasLista.forEach(System.out::println);















































    }
}
