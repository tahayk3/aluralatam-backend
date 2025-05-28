package com.tahayk3.screenmatch.service;

public interface IConvierteDatos {
    // Indica tipos de datos genericos
    <T> T obtenerDatos(String json, Class<T> clase);
}
