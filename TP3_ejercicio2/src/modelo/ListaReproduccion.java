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
    
    private void redimensionar(){
        Cancion[] otraLista;
        if (this.contadorCanciones == this.listaReproduccion.length || this.listaReproduccion.length == 1){
            otraLista = new Cancion[this.contadorCanciones + 1];
            java.lang.System.arraycopy(this.listaReproduccion, 0, 
                    otraLista, 0, this.listaReproduccion.length);
            this.listaReproduccion = otraLista;
        }
    }
    
    public void insertar(Cancion nuevaCancion){
        /**Escriba un método insertar en la clase ListaReproduccion
         * que inserta la canción especificada como parámetro al final
         * de la lista de reproducción.
         * 
         * public void insertar (Cancion nuevaCancion)
         */
        
        this.listaReproduccion[this.contadorCanciones] = nuevaCancion;
        this.contadorCanciones += 1;
        this.redimensionar();
       
        
    }
    
    public Cancion getCancion (int indice){
        
        /**Escriba un método getCancion en la clase ListaReproduccion que
         * devuelve una referencia a una canción en el índice especificado
         * como parámetro. Si el índice no es válido (fuera de los límites
         * de las canciones de la lista de reproducción), el método
         * debería devolver null.
         * public Cancion getCancion (int indice)
         */
               
        if (indice > this.listaReproduccion.length){
            return null;
        }else{
            if (indice < 0){
                if (indice == -1){
                    return this.listaReproduccion[this.contadorCanciones - 1];
                }else{
                    return this.listaReproduccion[this.listaReproduccion.length - Math.abs(indice)];
                }
            }else{
                return this.listaReproduccion[indice];
            }
        }
    }
    
    public void reemplazarCancion (Cancion nuevaCancion, int indice){
        /* Escriba un método reemplazarCancion en la clase ListaReproduccion que reemplaza la
         * canción especificada en el índice especificado como parámetro. Si no hay ninguna
         * canción en ese índice, se imprime un mensaje de error. (No olvide los valores
         * negativos.)
         */
        if (indice < 0){
            System.out.println("Indice fuera de limite");
        }else{
            if (indice > this.contadorCanciones){
                System.out.println("Indice fuera de límite");
            }
            else{
                if (this.listaReproduccion[indice] == null){
                    this.listaReproduccion[indice] = nuevaCancion;
                    this.contadorCanciones += 1;
                }else{
                    this.listaReproduccion[indice] = nuevaCancion;
                }
            }
        }
    }
    
    public int getCantidadCanciones (){
        /* Escriba un método getCantidadCanciones en la clase ListaReproduccion
         * que devuelve el número de canciones de la lista de reproducción.
         * public int getCantidadCanciones ()
         */
        return this.contadorCanciones;
    }
    
    public void removerEn (int indice){
        /**Escriba un método removerEn en la clase ListaReproduccion que elimina la canción en
         * el índice especificado como parámetro, moviendo todas las canciones siguientes en una
         * posición hacia el principio del arreglo para llenar el espacio realizado por la canción
         * eliminada. Si no hay ninguna canción en ese índice para eliminar el método
         * simplemente debe retornar. (No olvide los valores negativos.)
         * 
         * public void removerEn (int indice)
         * 
         */
        int i =0;
        if (indice >= 0 && indice <= this.contadorCanciones ){
            //movemos las canciones.
            for ( i = indice; i < this.contadorCanciones; i++){
                this.listaReproduccion[i] = this.listaReproduccion[i+1];
            }
            
            this.listaReproduccion[i] = null;
            this.contadorCanciones -= 1;
        }
        
    }
    
    public void insertarEn (Cancion nuevaCancion, int indice){
        /**Escriba un método insertarEn en la clase ListaReproduccion que inserta la canción en el
         * índice especificada como parámetro, mover la canción en el índice y todas las canciones
         * siguientes a esa posición hacia el final de la matriz para hacer espacio para la nueva
         * canción. Si el índice es negativo o provocaría un espacio entre la última canción y la
         * canción insertada, inserte la canción después de la última canción.
         * 
         * public void insertarEn (Cancion nuevaCancion, int indice)
         */
        int i;
        if (this.contadorCanciones + 1 > this.listaReproduccion.length){
            this.redimensionar();
        }
        if (indice > this.listaReproduccion.length || indice < 0){
            if (this.listaReproduccion[this.listaReproduccion.length-1] == null){
                this.listaReproduccion[this.listaReproduccion.length-1] = nuevaCancion;
                this.contadorCanciones += 1;
            }else{
                this.redimensionar();
                this.listaReproduccion[this.listaReproduccion.length-1] = nuevaCancion;
                this.contadorCanciones += 1;
            }
            
        }else{
            for (i = this.contadorCanciones; i > indice; i--){
                this.listaReproduccion[i] = this.listaReproduccion[i-1];
            }
            this.listaReproduccion[i] = nuevaCancion;
            this.contadorCanciones += 1;
            this.redimensionar();
        }
        
//        this.redimensionar();
//        if (indice > this.contadorCanciones){
//            if (this.listaReproduccion[this.listaReproduccion.length-1] == null){
                
//            }
//        } 
       
    }
    
    public int encontrarIndice (Cancion cancionRequerida){
        /**Escriba un método encontrarIndice en la clase ListaReproduccion que devuelve el
         * primer índice de la canción especificada en el parámetro en la lista de reproducción. Si
         * no está en la lista de reproducción, devuelve -1.
         * 
         * public int encontrarIndice (Cancion cancionRequerida)
         */
        //boolean encontrado = false;
        int i = 0;
        while (i < this.contadorCanciones){
            if (this.listaReproduccion[i].equals(cancionRequerida)){
                return i;
            }
            i++;
        }
        return -1;
    }
    
    public boolean contiene (Cancion cancionRequerida){
        /**Escriba un método contiene en la clase ListaReproduccion que devuelve true si la
         * canción especificada en el parámetro está en la lista de reproducción y false en caso
         * contrario. (Sugerencia: ¿Hay un método en la clases que pueda utilizar para ayudarle?)
         * 
         * public boolean contiene (Cancion cancionRequerida)
         */
        int i = 0;
        while (i < this.contadorCanciones){
            if (this.listaReproduccion[i].equals(cancionRequerida)){
                return true;
            }
            i++;
        }
        return false;
    }
}
