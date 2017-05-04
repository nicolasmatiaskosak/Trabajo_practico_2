/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accion;

/**
 *
 * @author Acer
 */
public class Accion {
    private String simbolo, nombre;
    private double precioCierrePrevio;
    private double precioActual;

    
    
    public Accion(String simbolo, String nombre){
        this.simbolo = simbolo;
        this.nombre = nombre;
        this.precioActual = 0.0;
        this.precioCierrePrevio = 0.0;
    }
    
    public void setprecioActual(double precio){
        this.precioActual = precio;
    }
    
    public double getprecioActual(){
        return this.precioActual;
    }
    
    public void setprecioCierrePrevio(double precio){
        this.precioCierrePrevio = precio;
    }
	
	public void setsimbolo(String simbolo){
		this.simbolo = simbolo;
	}
	
	public String getsimbolo(){
		return this.simbolo;
	}
	
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
    
	public String getnombre(){
		return this.nombre;
	}
	
	public double getPorcentajeCambio() {
        //RETORNE LA VARIACION PROCENTUAL DE LA ACCION
        double variacion;
        variacion = (( this.precioActual - this.precioCierrePrevio )*100)/this.precioCierrePrevio;
        return variacion;
    }
}