package com.example.ut2_pd2;

public class Main {
    public static void main(String[] args) {
        // EJERCICIO 1
        // Si n es negativo
        // Devuelve mensaje "at com.example.Factorial.calcularFactorial(Factorial.java:9)"

        int f2 = Factorial.calcularFactorial(5);
        System.out.println(f2);
       //Devuelve 120

        int f3 = Factorial.calcularFactorial(4);
        System.out.println(f3);
        // Devuelve 24

        int f4 = Factorial.calcularFactorial(0);
        System.out.println(f4);
        // Devuelve 1


        // EJERCICIO 2
         int[] A = {1,2,3,4,5,6,7,8,9};
         int[] B = {};

        int suma2 = SumaLineal.calcularSumaLineal(A, 5);
        System.out.println(suma2);

        // A vacio
        //int suma3 = SumaLineal.calcularSumaLineal(B, 0);
        //System.err.println(suma3);
        // Devuelve Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 (si n>0)
        // at com.example.SumaLineal.calcularSumaLineal(SumaLineal.java:8)


        // Ejercicio 3
        int pot1 = Potencia.calcularPotencia(5, 2);
        System.out.println(pot1);
        

        // Ejercicio 4
        String[] v = {"papas", "boniatos", "zanahorias"};
        Vector.invertirArray(v,0,2);
        for (String palabras : v) {
            System.out.println(palabras);
        }

    }
}