/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1_clases;

/**
 *
 * @author Admin
 */
public class EVA1_1_CLASES {

    public static void main(String[] args) {
        //CREAR OJETOS: --> INSTANCIAR
        //DECLARACION = INSTANCIACION
        //CLASE identificador = new CLASE (argumentos);
        ///new --> crea el objeto en la memoria RAM
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellidos = "perez jolote";
        perso1.edad = 30;
        perso1.imprimir();
        
    }
}
//PERSONA --> plantilla de codigo: NO EXISTE
class Persona{
    //DATOS (ESTADO), VARIABLES --> ATRIBUTOS
    String nombre;
    String apellidos; 
    int edad; 
    //COMPORTAMIENTO --> METODOS 
    void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}
