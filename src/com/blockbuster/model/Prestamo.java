package com.blockbuster.model;

import java.sql.Timestamp;

public class Prestamo {
    private int id;
    private Timestamp fecha;
    private int fkEmpleado;
    private int fkCliente;
    private int fkPeliculaFormato;
    private Timestamp fechaEntrega;
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

    public int getFkEmpleado() {
        return fkEmpleado;
    }

    public void setFkEmpleado(int fkEmpleado) {
        this.fkEmpleado = fkEmpleado;
    }

    public int getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }

    public int getFkPeliculaFormato() {
        return fkPeliculaFormato;
    }

    public void setFkPeliculaFormato(int fkPeliculaFormato) {
        this.fkPeliculaFormato = fkPeliculaFormato;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrefa) {
        this.fechaEntrega = fechaEntrefa;
    }

    public int getPrecioExtra() {
        return precioExtra;
    }

    public void setPrecioExtra(int precioExtra) {
        this.precioExtra = precioExtra;
    }
    
    
}
