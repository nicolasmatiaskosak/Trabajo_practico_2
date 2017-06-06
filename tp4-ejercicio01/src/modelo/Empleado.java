/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Diego Raul Fernandez
 */
public abstract class Empleado extends Persona{
    
    private double salario;
    private java.util.Date fechaContrato;
    
    protected Empleado(){
        //this.fechaContrato = new java.util.Date();
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContrato() {
        return new java.util.Date (fechaContrato.getTime());
    }

    public void setFechaContrato() {
        this.fechaContrato = new java.util.Date();
    }
    
    @Override
    public abstract String toString();
}
