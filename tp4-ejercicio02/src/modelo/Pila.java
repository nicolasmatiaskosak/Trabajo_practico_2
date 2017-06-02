/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author Diego Raul Fernandez
 */
public class Pila {
    
     /**vacia(): boolean Retorna verdadero si la pila esta vacía.
• largo(): int Retorna la cantidad de elementos que se encuentran en la pila.
• cima(): Object Retorna el elemento superior de la pila sin removerlo.
• desapilar(): Object Retorna y remueve el elemento superior de la pila.
• apilar(o: Object): void Agrega un nuevo elemento en la parte superior de la
pila.
• toString() : String devuelve la siguiente cadena: “Pila: <elementos de la
pila>”*/
    
    private ArrayList<Object> lista;
   
    
    public Pila(){
        lista = new ArrayList<>();
    }
    public boolean vacia(){
        if (lista.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public int largo(){
        return lista.size();
    }
    
    public Object cima(){
        return lista.get(lista.size()-1);
    }
    public Object desapilar(){
        return lista.remove(lista.size()-1);
    }
    
    public void apilar(Object o){
        lista.add(lista.size(), o);
    }
    
    /**
     * @Override
     */
    public String toString(){
        String listin = "Pila: ";
        for (Object o : lista){
           listin = listin + (String) o;
        }
        return listin;
    }
    
}
