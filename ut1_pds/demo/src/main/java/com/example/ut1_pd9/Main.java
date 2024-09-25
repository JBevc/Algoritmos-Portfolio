package com.example.ut1_pd9;

public class Main {

    // Ejercicio 1

    public static int factorial(int n) {
        int factorial = 1;
        // Si n es 0
        if (n == 0){
            return factorial;
        }
        // Si n es menor a 0
        if (n<0){
            // Los numeros tienen que ser enteros positivos
            System.out.println("No se puede");
            return -1;
        }
        // Si n>0
        for (int i= 1;i<= n;i++){
            factorial *= i;
            }
        return factorial;
        
    }

    // Ejercicio 2

    // Para calcular si es primo
    public static boolean isPrime(long n){
        boolean prime = true;
        for (long i = 3; i<= Math.sqrt(n); i+=2){
            if (n%i==0) {
                return false;
            }
        }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
            } else {
            return false;}
        }

    // Suma
    public static int suma(int n){
        int i = 0;
        int j = 1;
        int total = 0;
        // Si es primo
        if (isPrime(n)){
            while (i<n) {
                total += i;
                i+=2;
            }
        }
        // Si no es primo
        if (isPrime(n) != true){
            while (j<n) {
                total+= j;
                j+=2;
            }
        }
        return total;
        }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(suma(8));
        
    }
}