/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author Admin
 */
public class PERSONA {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    public String getnombre(){
    return nombre;
    }
    //CONSTRUCTORES
    public PERSONA(){//CONSTRUCTOR DEFAULLT
        //INICIALIZAR
        nombre = "---";
        apellidos = "---";
        edad = -1;
    System.out.println("LLAMADA AL CONSTRUCTOR");
    
    } 
           //FIRMA
    public PERSONA(String nombre, String apellidos, int edad){
           //INICIALIZAR
           //this --> OPERADOR PARA ACCEDER AL CONTENIDO DEL OBJECTO ACTUAL
           //PERMITE VISUALIZAR TODO LO QUE ESTE DEFINIDO EN LA CLASE
           //SN IMPORTAR LO QUE TENGA 
           this.nombre = nombre;
           this.apellidos = apellidos;
           this.edad = edad;
           
    
    }
    //METODOS O COMPORTAMIENTO
    
    public void setNombre(String valor){
    nombre= valor;
    }
    public String getApellidos(){
    return apellidos; 
    }
    public void setApellidos(String valor){
    apellidos= valor; 
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public void imprimirDatos(){
    System.out.println("---DATOS DE LA PERSONA--- ");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellidos);
    System.out.println("Edad: " + edad);
    }
    
}
