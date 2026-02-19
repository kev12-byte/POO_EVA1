/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_productos;

/**
 *
 * @author Admin
 */
public class productos {
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;
    private String unidad;
    
    public productos(){
        this.nombre = "---";
        this.marca = "---";
        this.precio = -1;
        this.cantidad = -1;
        this.unidad = "--";
    }
    public productos(String nombre, String marca, double precio, int cantidad, String unidad){
    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setCantidad(int valor) {
        cantidad = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setUnidad(String valor) {
        unidad = valor;
    }

    public String getUnidad() {
        return unidad;
    }
    public void imprimirDatos(){
    System.out.println("---PRODUCTOS--- ");
    System.out.println("Nombre: " + nombre);
    System.out.println("Marca: " + marca);
    System.out.println("Precio: " + precio);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Unidad: " + unidad);
    }
    public double calcularMonto(){
    return precio * cantidad;
    }
    public void imprimirMonto(){
    imprimirDatos();
    System.out.println("Monto: " + calcularMonto() );
    }
}
