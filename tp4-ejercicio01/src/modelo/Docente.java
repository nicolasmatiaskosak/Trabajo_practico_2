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
    @Override
    public String toString(){
        return this.getClass() + " " + this.getNombre();
    }
}
