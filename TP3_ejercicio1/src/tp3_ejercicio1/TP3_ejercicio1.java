/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_ejercicio1;

/**
 *
 * 1) Basándose en el punto 2 del trabajo práctico 2, se debe recibir como
 * parámetros las acciones a crear pasando el símbolo de la acción y su nombre.
 * Se pueden pasar como máximo una a diez acciones. En cualquier otro caso se
 * debe mostrar un mensaje de error y terminar, dado que el sistema solo puede
 * manejar hasta diez acciones. Cree las acciones e insértelas en un arreglo,
 * luego imprima el arreglo.
 */
import accion.Accion;

public class TP3_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j=0;
        //System.out.println("ENTRE");
        Accion[] arrayAccion;
        
        if ((args.length % 2) == 0 && ((args.length != 0) && args.length <= 20)){
            //System.out.println("PASE IF");
            arrayAccion = new Accion[args.length/2];
            for (i = 0; i < args.length; i+= 2){
                //System.out.println("ENTRE FOR " + i + " VECES");
                arrayAccion[j] = new Accion(args[i], args[i+1]);
                j++;
            }
            //System.out.println("PASE FOR");
            for (i = 0; i < arrayAccion.length; i++){
                
                System.out.println(arrayAccion[i].getsimbolo() +" "+ arrayAccion[i].getnombre());
                
                
            }
        }
    }

}
