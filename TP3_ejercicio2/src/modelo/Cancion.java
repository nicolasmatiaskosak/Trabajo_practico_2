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
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(String titulo, String autor){
        /**Constructor de la clase que recibe
         el título y el autor de la canción*/
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Definición de los métodos de acceso
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String nuevoAutor){
        this.autor = nuevoAutor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    //Definición de los métodos toString y equals
    @Override
    public String toString(){
        String mensaje = this.titulo + ", " + this.autor + "\n";
        return mensaje;
    }
}
