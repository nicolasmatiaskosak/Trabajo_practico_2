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
public abstract class Empleado extends Persona{
    
    private double salario;
    private java.util.Date fechaContrato;
    
    protected Empleado(){
        
    }
    
    
    @Override
    public abstract String toString();
}
