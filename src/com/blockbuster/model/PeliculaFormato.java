package com.blockbuster.model;

public class PeliculaFormato {
    private int id;
    private int stock;
    private int precio;
    private int fk_pelicula;
    private int fk_formato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFk_pelicula() {
        return fk_pelicula;
    }

    public void setFk_pelicula(int fk_pelicula) {
        this.fk_pelicula = fk_pelicula;
    }

    public int getFk_formato() {
        return fk_formato;
    }

    public void setFk_formato(int fk_formato) {
        this.fk_formato = fk_formato;
    }
    
    
}
