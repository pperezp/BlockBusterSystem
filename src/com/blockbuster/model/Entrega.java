package com.blockbuster.model;

import java.sql.Timestamp;

public class Entrega {
    private int id;
    private Timestamp fecha; // DateTime
    private int fkPrestamo;
    private String estadoProducto;
    private int precioExtra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public int getFkPrestamo() {
        return fkPrestamo;
    }

    public void setFkPrestamo(int fkPrestamo) {
        this.fkPrestamo = fkPrestamo;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public int getPrecioExtra() {
        return precioExtra;
    }

    public void setPrecioExtra(int precioExtra) {
        this.precioExtra = precioExtra;
    }
    
    
}
