package com.mycompany.eva1_6_formato_apa;

public class EVA1_6_FORMATO_APA {

    public static void main(String[] args) {
        LibrosReferencia[] libro = new LibrosReferencia[3]; // CREAMOS EL ARREGLO

        for (int i = 0; i < libro.length; i++) {
            libro[i] = new LibrosReferencia();

            libro[i].setAutor("Garcia Marquez (");
            libro[i].setDia(5);
            libro[i].setMes(" Junio) ");
            libro[i].setYear(1967);
            libro[i].setTitulo("Cien anios de soledad ");

            libro[i].imprimirDatos();
        }
    }
}
