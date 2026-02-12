package com.mycompany.eva1_6_formato_apa;

public class LibrosReferencia {
    private String autor;
    private String titulo;
    private int year;
    private String mes;
    private int dia;
    private String editorial;

    // COMPORTAMIENTO
    public String getAutor() {
        return autor;
    }

    public void setAutor(String valor) {
        autor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String valor) {
        titulo = valor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int valor) {
        year = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String valor) {
        mes = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int valor) {
        dia = valor;
    }

    public void setEditorial(String valor) {
        editorial = valor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void imprimirDatos() {
        System.out.println("----CITA BIBLIOGRAFICA DEL LIBRO----");
        System.out.print("");
        System.out.print("" + titulo);
        System.out.print("" + autor);
        System.out.print("" + year);
        System.out.print("" + mes);
        System.out.print("" + dia);
        System.out.print("" + editorial);
    }
}
