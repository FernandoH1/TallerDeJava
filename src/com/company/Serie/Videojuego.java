package com.company.Serie;

public class Videojuego implements Entregable {
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;

    public Videojuego() {
        this.titulo = "Devil May Cry 5";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "Accion y aventura";
        this.company = "Capcom";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "Accion y aventura";
        this.company = "Capcom";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return company;
    }

    public void setCompañia(String compañia) {
        this.company = compañia;
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
        if (this.horasEstimadas < ((Videojuego)o).horasEstimadas) {
            return true;
        }
        return false;
    }


}
