package com.blockbuster.model;

public class GeneroPelicula {
    private int id;
    private int fkGenero;
    private int fkPelicula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkGenero() {
        return fkGenero;
    }

    public void setFkGenero(int fkGenero) {
        this.fkGenero = fkGenero;
    }

    public int getFkPelicula() {
        return fkPelicula;
    }

    public void setFkPelicula(int fkPelicula) {
        this.fkPelicula = fkPelicula;
    }
    
    
}
