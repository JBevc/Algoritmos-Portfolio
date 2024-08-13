package com.example;

/*
  Ejercicio 4
  Para realizar el programa deberia crear un array con enteros
  La multiplicacion se realizaria si los arrays tienen el mismo tamaño.
  
  Para realizar la multiplicacion iria recorriendo un vector y multiplicando el
  entero correspondiente en el mismo indice del  elemento actual.
  La multiplicacion la guardaria en una variable final, la cual mostraria el resultado

 */

public class Arrays {
  public static void multiplicacionArray(int[] v1, int[] v2){

    String mult = "";

    // La condición es que los dos arrays tienen que ser del mismo largo
    if (v2.length != v1.length){
      System.out.println("Los arrays no son del mismo tamaño");
    } else {
      for (int i = 0; i<v1.length; i++){
        // Se realiza la multiplicación de los vectores
        mult += (v1[i]*v2[i]);
        mult += ",";
      }
      String [] arrFinal = mult.split(",");

      // Muestro resultado
      for (String num : arrFinal){
        System.out.println(num);
      }

    }
  }
  
  public static void main(String[] args) {
    int[] vector1 = {1,2,3,4,5};
    int[] vector2 = {6,7,8,9,10};

    multiplicacionArray(vector1,vector2);
  }
  
}