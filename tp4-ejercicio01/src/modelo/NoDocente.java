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
public class NoDocente extends Empleado{
    private String titulo;
    
    public NoDocente(String nombre, String direccion, String nroTelefono,
            String correoE, String titulo){
       
        //consultar al respecto.
        this.setNombre(nombre);
        super.setDireccion(direccion);
        super.setNroTelefono(nroTelefono);
        super.setCorreoElectronico(correoE);
        super.setFechaContrato();
        this.titulo = titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    @Override
    public String toString(){
        return this.getClass() + " " + this.getNombre();
    }
}
