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
        miPila.apilar(1);
        miPila.apilar(2);
        miPila.apilar(3);
        miPila.apilar(4);
        miPila.apilar(5);
        //miPila.apilar(0); 
        System.out.print("Hola, " + miPila.vacia() + "\n");
        
        System.out.println("Cima: "+miPila.cima());
        
        System.out.println(miPila.toString());
        
        System.out.println("Desapilar: "+miPila.desapilar());
        
        System.out.print(miPila.toString()+"\n");
    }
    
}
