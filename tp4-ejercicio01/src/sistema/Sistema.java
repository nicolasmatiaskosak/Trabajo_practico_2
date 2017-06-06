/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import modelo.*;
/**
 *
 * @author Diego Raul Fernandez
 */
public class Sistema {  
    
    public static void main(String[] args){
        System.out.print("Hola che\n");
        
        Docente miDocente = new Docente("Diego", "salta", "4756565",
                "correo@email.com", "Titular");
        
        Estudiante miEstudiante = new Estudiante("Catalina", "salta", "4756565",
                "correo@email.com", "Primer año");
        
        NoDocente miNoDocente = new NoDocente("Daniela", "salta", "4756565",
                "correo@email.com", "Abogado");
        
        System.out.print(miDocente.toString()+"\n");
        System.out.print(miEstudiante.toString()+"\n");
        System.out.print(miNoDocente.toString()+"\n");
        System.out.print("Fecha de contratación: "+miNoDocente.getFechaContrato()+"\n");
    }
    
}
