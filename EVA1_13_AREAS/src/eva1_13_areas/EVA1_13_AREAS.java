/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_areas;

/**
 *
 * @author bisonte
 */
public class EVA1_13_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El area del cuadrado cuyo uno de sus lados mide 50 es: " + Geometria.areaCuadrado(50) + " unidades cuadradas");
        System.out.println("El area del rectangulo cuyos lados miden 7 y su base 10 es:" + Geometria.areaRectangulo(7, 10) + " unidades cuadradas");
        System.out.println("El area de triangulo cuya base mide 5 y su altura 10 es: " + Geometria.areaTriangulo(5, 10));
    }
    
}
class Geometria {
   public static double areaCuadrado(double lado){
   double resu;
   resu = (lado * lado);
   return resu;
   }
   public static double areaRectangulo(double base, double altura){
   double resu;
   resu = (base * altura);
   return resu;
   }
   public static double areaTriangulo(double base, double altura){
    double resu;
    resu = (base * altura) / (2);
    return resu;
   
   }
   public static double areaCirculo(double radio){
   double resu;
   resu = (3.1416) * (radio * radio);
   return resu;
   }
   public static double areaRombo(double mayor, double menor){
   double resu;
   resu = (mayor * menor);
   return resu;
   }
}
