package com.example.ut1_pd4;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 2 parte 2
        Rectangle myRect = new Rectangle(); 
        myRect.width = 40;
        myRect.height = 50; 
        System.out.println("myRect's area is " + myRect.area());

        // Ejercicio 3 Parte 3
        NumberHolder nh = new NumberHolder();
        
        // Inicializo las variables
        nh.aFloat = 0.5F;
        nh.anInt = 5;

        // Imprimo las variables
        System.out.println(nh.aFloat);
        System.out.println(nh.anInt);



    }
}