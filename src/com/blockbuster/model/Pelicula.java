package com.blockbuster.model;

public class Pelicula {
    private int id;
    private String nombre;
    private int anio;
    private String director;
    private String descripcion;
    private int restriccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }
    
    
}
