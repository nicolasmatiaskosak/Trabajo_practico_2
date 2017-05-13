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
//import java.util.ArrayList;
public class ListaReproduccion {
    
    private Cancion[] listaReproduccion;
    private int contadorCanciones;
    
    public ListaReproduccion(){
        this.listaReproduccion = new Cancion[1];
        this.contadorCanciones = 0;
    }
    
    public void insertar(Cancion nuevaCancion){
        /**Escriba un método insertar en la clase ListaReproduccion
         * que inserta la canción especificada como parámetro al final
         * de la lista de reproducción.
         * 
         * public void insertar (Cancion nuevaCancion)
         */
        listaReproduccion[listaReproduccion.length] = nuevaCancion;
        
    }
    
    public Cancion getCancion (int indice){
        
        /**Escriba un método getCancion en la clase ListaReproduccion que
         * devuelve una referencia a una canción en el índice especificado
         * como parámetro. Si el índice no es válido (fuera de los límites
         * de las canciones de la lista de reproducción), el método
         * debería devolver null.
         * public Cancion getCancion (int indice)
         */
               
        if (indice > listaReproduccion.length){
            return null;
        }
        return listaReproduccion[indice];
    }
    
    public void reemplazarCancion (Cancion nuevaCancion, int indice){
        if (indice > this.listaReproduccion.length){
            
        }else{
            this.listaReproduccion[indice] = nuevaCancion;
        }
    }
    
    public int getCantidadCanciones (){
        
    }
    
    public void removerEn (int indice){
        
    }
    
    public void insertarEn (Cancion nuevaCancion, int indice){
        
    }
    
    public int encontrarIndice (Cancion cancionRequerida){
        
    }
    
    public boolean contiene (Cancion cancionRequerida){
        
    }
}
