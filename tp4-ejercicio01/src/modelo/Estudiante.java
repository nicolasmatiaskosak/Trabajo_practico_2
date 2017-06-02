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
public class Estudiante extends Persona{
    private String algo;
    
    public Estudiante(String nom, String dir, String tel, String maile, String algo){
        super.Persona(nom, dir, tel, maile);
        this.algo = algo;
    }
    
}
