package com.tahayk3.audioproyecto.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDuracionReproducciones;
    private int meGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDuracionReproducciones() {
        return totalDuracionReproducciones;
    }

    public void setTotalDuracionReproducciones(int totalDuracionReproducciones) {
        this.totalDuracionReproducciones = totalDuracionReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta(){
        this.meGusta++;
    }

    public void reproducir() {
        totalDuracionReproducciones++;
    }
}
