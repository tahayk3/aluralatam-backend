package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        var busqueda = lectura.nextLine();

        String clave = "c056cac2";
        String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey="+clave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        //Utilizando Gson para convertir respuesta de api en un objeto
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb miTituloOmbd = gson.fromJson(json, TituloOmdb.class);
        System.out.println("Titulo desde api: "+ miTituloOmbd.toString());

        //creando titulo a partir de record
        Titulo miTitulo = new Titulo(miTituloOmbd);
        System.out.println("Objeto que se creo a partir de un record"+miTitulo);

        
    }
}
