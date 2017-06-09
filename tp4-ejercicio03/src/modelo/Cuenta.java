/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * http://plantuml.com/
 * @author Acer
 */
import java.util.Date;
public class Cuenta {
    private String nombre;
    private int id;
    private double saldo;
    private double tasaInteresAnual;
    private Date fechaCreacion;
    private ArrayList<Transaccion> transacciones;
   
    
    public Cuenta(int id, String nombre, double saldo){
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.fechaCreacion = new Date();
        this.transacciones = new ArrayList<>();
        
    }
    
    public Cuenta(){
        this.id = 0;
        this.saldo = 0.0;
        this.fechaCreacion = new Date();
        this.tasaInteresAnual = 0.0;
        this.transacciones = new ArrayList<>();
    }
    
    public Cuenta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
        this.fechaCreacion = new Date();
        this.transacciones = new ArrayList<>();
    }
    
    public void setid(int nuevoID){
        this.id = nuevoID;
    }
	
    public int getid(){
        return this.id;
    }
    
    public void setsaldo(double nuevoSaldo){
	this.saldo = nuevoSaldo;
    }
    
    public double getsaldo(){
	return this.saldo;
    }
	
	public void settasaInteresAnual(double nuevaTasaAnual){
		/**algo*/
		this.tasaInteresAnual = nuevaTasaAnual/100.0;
	}
	
	public double gettasaInteresAnual(){
		return this.tasaInteresAnual*100;
	}
	
	public Date getfechaCreacion(){
		return this.fechaCreacion;
	}
	
    public double getTasaInteresMensual(){
        double tasaInteresMensual;
        tasaInteresMensual = this.tasaInteresAnual/12;
        return tasaInteresMensual;
    }
    
    public double getInteresMensual(){
        double interesMensual;
        interesMensual = this.saldo * this.getTasaInteresMensual();
        
        return interesMensual;
    }
    
    public void retirar (double aRetirar) {
        Date fecha = new Date();
        Transaccion transa;
        transa = new Transaccion(fecha, 'R', aRetirar);
        this.saldo = this.saldo - aRetirar;
        this.transacciones.add(transa);
       
    }
    
    public void depositar (double aDepositar) {
        Date fecha = new Date();
        Transaccion transa;
        transa = new Transaccion(fecha, 'D', aDepositar);
        this.saldo = this.saldo + aDepositar;
        
        this.transacciones.add(transa);
    }
    
    @Override
    public String toString(){
        /*Un método denominado toString que devuelve
        una cadena de caracteres que contiene: el
        id, saldo, interés mensual y fecha en que se creó la cuenta.*/
        String mensaje;
        mensaje = this.id + ", " + this.saldo +
                ", " + this.getInteresMensual() + ", " +
                this.fechaCreacion;
        return mensaje;
    }
}
   

