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
public class Docente extends Empleado {
    
    private String cargo;
    
    public Docente(String nombre, String direccion, String nroTelefono,
            String correoE, String cargo){
        super.setNombre(nombre);
        super.setDireccion(direccion);
        super.setNroTelefono(nroTelefono);
        super.setCorreoElectronico(correoE);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    @Override
    public String toString(){
        return this.getClass() + " " + this.getNombre();
    }
}
