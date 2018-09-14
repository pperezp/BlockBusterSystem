package com.blockbuster.model;

import java.sql.Timestamp;

public class Cliente extends Persona{
    private String direccion;
    private int edad;
    private Timestamp fechaNacimiento;

    public Timestamp getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Timestamp fehcaNacimiento) {
        this.fechaNacimiento = fehcaNacimiento;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
