package com.example.UT2_PD1;

public class Ejercicio2 {

    public static int contadorSi(int[] arreglo, int N) {

        int contadorSi = 0;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = N; j >= i +1; j--) {
                contadorSi++; // contamos cada vez que va a invocar la sentencia  if
                if (arreglo[j] < arreglo[j - 1]) {
                    intercambia(arreglo[j], arreglo[j - 1]);
                }
            }
        }
        return contadorSi;
    }

    private static void intercambia(int element1, int element2) {
        int temporal = element1;
        element1 = element2;
        element2 = temporal;
    }
}

