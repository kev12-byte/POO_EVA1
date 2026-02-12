/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_vehiculo;

/**
 *
 * @author Admin
 */
public class EVA1_5_VEHICULO {

    public static void main(String[] args) {
        /*Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Ford");
        vehiculo.setModelo("Mustang");
        vehiculo.setYear(1970);
        vehiculo.setColor("Azul");
        vehiculo.setKilometraje(10000);
        vehiculo.setPrcio(100000);
        vehiculo.imprimirDatos();*/
        Vehiculo[] agencia = new Vehiculo[10];//CREAMOS EL ARREGLO, PERO NOS LOS VEHICULOS
        for (int i = 0; i < agencia.length; i++){
        agencia[i] = new Vehiculo();
        agencia.setMarca("Ford");
        agencia.setModelo("Mustang");
        agencia.setYear(1970);
        agencia.setColor("Azul");
        agencia.setKilometraje(10000);
        agencia.setPrcio(100000);
        agencia.imprimirDatos();
        }
        
    }
}
