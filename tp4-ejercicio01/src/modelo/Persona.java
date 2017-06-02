/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Diego Raul Fernandez
 */
public abstract class Persona {
    
    private String nombre;
    private String direccion;
    private String nroTelefono;
    private String correoElectronico;
    
    protected Persona(){
        
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDireccion(String dir){
        this.direccion = dir;
    }
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setNroTelefono(String telef){
        this.nroTelefono = telef;
    }
    public String getNroTelefono(){
        return this.nroTelefono;
    }
    
    public void setCorreoElectronico(String maile){
        this.correoElectronico = maile;
    }
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
    
    @Override
    public abstract String toString();
}
