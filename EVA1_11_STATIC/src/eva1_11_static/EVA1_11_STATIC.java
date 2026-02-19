/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_static;

/**
 *
 * @author Admin
 */
public class EVA1_11_STATIC {

    public int x = 7;
    public static void main(String[] args) {
        System.out.println("*****MATH*****");
        //Math math = new Math();
        System.out.println("PI= " + Math.PI);
        System.out.println("Random= " + Math.random());
        System.out.println("Cuadado de 5 " + Math.pow(5,2));
        System.out.println("*****MATEMATICAS*****");
        System.out.println("PI = " + Matematicas.PI);
        //Matematicas mate = new Matematicas();//INSTANCIACION
        //System.out.println("PI = " + mate.PI);
        Matematicas mate = new Matematicas();
        System.out.println("Cuadrado de 5= " + mate.cuadrado(5));
        EVA1_11_STATIC obj = new EVA1_11_STATIC();
        System.out.println("X= " + obj.x);
    }
    
}
//satic --> nos sirve para crear utilerias, sin nesecidad de crear objetos 
class Matematicas{
    public static final double PI= 3.1416;
    public double cuadrado (double valor){
    return valor * valor; 
    }
}
