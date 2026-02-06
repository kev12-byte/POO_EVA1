/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_encapsulamiento;

/**
 *
 * @author Admin
 */
public class EVA1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setnombre("Kevin");
        persona.setapellidos("Conde");
        persona.setedad(19);
        persona.setgenero('H');
        
        System.out.println("Nombre: " + persona.getnombre);
        System.out.println("Apellidos: " + persona.getapellidos);
        System.out.println("Edad: " + persona.getedad);
        System.out.println("Genero: " + persona.getgenero); 
        persona.imprimirDatos();
        System.out.println("Nombre completo: " + persona.generarNombreCompleto);
    }
}
