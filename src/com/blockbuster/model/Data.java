package com.blockbuster.model;

import com.blockbuster.model.bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("bd_blockbuster");
    }
    
    public Empleado existeEmpleado(String run) throws SQLException{
        String query = "SELECT * FROM empleado WHERE run = '"+run+"'";
        
        Empleado emp = null;
        
        ResultSet rs = con.ejecutar(query);
        
        if(rs.next()){
            // existe el empleado
            emp = new Empleado();
            
            emp.setId(rs.getInt("id"));
            emp.setRun(rs.getString("run"));
            emp.setNombre(rs.getString("nombre"));
        }
        
        con.close();
        
        return emp;
    }
    
    public Cliente getCliente(String run) throws SQLException{
        String query = "SELECT * FROM cliente WHERE run = '"+run+"'";
        
        Cliente cli = null;
        
        ResultSet rs = con.ejecutar(query);
        
        if(rs.next()){
            // existe el empleado
            cli = new Cliente();
            
            cli.setId(rs.getInt("id"));
            cli.setRun(rs.getString("run"));
            cli.setNombre(rs.getString("nombre"));
            cli.setDireccion(rs.getString("direccion"));
            cli.setFechaNacimiento(rs.getTimestamp("fechaNacimiento"));
        }
        
        con.close();
        
        return cli;
    }
}
