package com.example.ut2_pd1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        String archivo = "demo/src/main/java/com/example/UT2_PD1/numeros.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea = bufferedReader.readLine();
            int N = Integer.valueOf(linea);
            int[] arreglo = new int[N];

            for (int i = 0; i < arreglo.length - 1; i++) {
                linea = bufferedReader.readLine();
                arreglo[i] = Integer.valueOf(linea);
            }

            int contadorSi = Ejercicio2.contadorSi(arreglo, N);


            System.out.println("Largo N: " + N);
            System.out.println("Contador de sentencia 'si': " + contadorSi);
            System.out.println("Número en la primera posición: " + arreglo[0]);
            System.out.println("Número en la última posición: " + arreglo[N - 1]);

    }
}
