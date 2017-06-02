/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import modelo.Pila;
/**
 *
 * @author Diego Raul Fernandez
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila();
        
        System.out.print("Hola, " + miPila.vacia()+"\n");
        miPila.apilar("hola");
        System.out.print("Hola, " + miPila.vacia() + "\n");
        
        System.out.print(miPila.toString()+"\n");
    }
    
}
