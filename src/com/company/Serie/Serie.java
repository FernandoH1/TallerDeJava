package com.company.Serie;

public class Serie implements Entregable {
    private String titulo;
    private int numero_de_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "Van Helsing";
        this.numero_de_temporadas = 3;
        this.entregado = false;
        this.genero = "Ciencia Ficcion";
        this.creador = "Kelly Overton";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numero_de_temporadas = 3;
        this.entregado = false;
        this.genero = "Ciencia Ficcion";
        this.creador = creador;
    }

    public Serie(String titulo, int numero_de_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numero_de_temporadas = numero_de_temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero_de_temporadas() {
        return numero_de_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumero_de_temporadas(int numero_de_temporadas) {
        this.numero_de_temporadas = numero_de_temporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object o) {
        if (this.numero_de_temporadas < ((Serie) o).numero_de_temporadas) {
            return true;
        }
        return false;
    }

}
