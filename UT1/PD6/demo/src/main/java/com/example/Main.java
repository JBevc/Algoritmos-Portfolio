package com.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        //imprimirTablero(7, 7);
    }

    public static void imprimirTablero(int largo, int ancho) {
        String celdas = "";

        for (int i=1; i<= ancho; i++) {
            celdas += "#";
        }
        for (int i =1; i<= largo; i++) {
            System.out.println(celdas);
        }
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        BufferedReader bf = new BufferedReader(new FileReader("/demo/src/main/java/com/example/Entrada.txt"));
        String linea = bf.readLine();
        
    }
}