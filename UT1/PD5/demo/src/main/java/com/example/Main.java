package com.example;

public class Main {

    public static void main(String[] args) {
        // PD5 ejercicio 1
        // Imprimo todos los valores del Enum type
        Day[] dias = Day.values();
        for (Day day : dias) {
            System.out.println(day);
        }

        // EJERCICIO 4
        String[] myFloatArray = {"13.4", "66.1"};
        ValueOfDemo v = new ValueOfDemo();
        v.metodo(myFloatArray);

        // La salida es 
        // a + b = 79.5
        // a - b = -52.699997
        // a * b = 885.7399
        // a / b = 0.20272315
        // a % b = 13.4


    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY 
    }
}