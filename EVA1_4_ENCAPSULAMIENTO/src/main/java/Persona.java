/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //CONSTRUCCIONES
    //COMPORTAMIENTO (METODOS) INTERMEDIARIO --> INTERFAZ 
    //get y set (quitar y poner)
    public String getnombre(){
    return nombre;
    }
    public void setnombre(String valor){
    nombre= valor;
    }
    public String getapellidos(){
    return apellidos; 
    }
    public void setapellidos(String valor){
    apellidos= valor; 
    }
    public int getedad(){
    return edad;
    }
    public void setedad(int valor){
        edad = valor;
    }
    public int setgenero(){
    return genero;
    }
    public void setgenero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellidos);
    System.out.println("Edad: " + edad);
    System.out.println("Genero: " + genero);
    }
    public String generarNombreCompleto(){
    return nombre + " " + apellidos;
    }
}
