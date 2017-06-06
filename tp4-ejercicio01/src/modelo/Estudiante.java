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
public class Estudiante extends Persona{
    private String situacionClase;

    
    
    public Estudiante(String nom, String dir, String tel,
            String maile, String sitClase){
        super.setNombre(nom);
        super.setDireccion(dir);
        super.setNroTelefono(tel);
        super.setCorreoElectronico(maile);
        this.situacionClase = sitClase;
    }
    
    public String getSituacionClase() {
        return situacionClase;
    }

    public void setSituacionClase(String situacionClase) {
        this.situacionClase = situacionClase;
    }
    
    @Override
    public String toString(){
        String mensaje = this.getClass() + " " + this.getNombre();
        return mensaje;
    }
}
