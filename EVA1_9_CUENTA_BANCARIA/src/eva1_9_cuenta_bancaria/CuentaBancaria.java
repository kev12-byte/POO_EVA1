/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author Admin
 */
public class CuentaBancaria {
    private String titular;
    private double monto;

    // Constructor corregido
    public CuentaBancaria(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    public void retirar(double monto) {
        if (this.monto >= monto) {
            this.monto -= monto;
        } else {
            System.out.println("Monto insuficiente");
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.monto += monto;
        } else {
            System.out.println("El monto debe ser mayor a 0");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Tu saldo es: " + monto);
    }
}
