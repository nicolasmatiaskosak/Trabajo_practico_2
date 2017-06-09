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
public class Transaccion {
    private Date fecha;
    private char tipo;
    private double cantidad;

    public Transaccion(Date fecha, char tipo, double cantidad) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
