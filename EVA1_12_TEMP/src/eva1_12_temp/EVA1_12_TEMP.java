/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temp;

/**
 *
 * @author Admin
 */
public class EVA1_12_TEMP {

    /**
     * @param args the command line arguments
     */
   public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //Temperatura temp= new Temperatura();
        System.out.println("50c= " + Temperatura.centAFahr(50) + "F");
        System.out.println("50f= " + Temperatura.FahrACel(50) + "c");
    }
    
}

class Temperatura {

    public static double centAFahr(double cent) {
        double resu;
        resu = (cent * (9.0/5.0)) + 32;
        return resu;
    }

    public static double FahrACel(double cel) {
        double resu;
        resu = (cel - 32) * (5.0/9.0);
        return resu; 
    }
  }
}
