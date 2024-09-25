package com.example.ut1_pd6;

public class Arrays {
  public static void multiplicacionArray(int[] v1, int[] v2){

    String mult = "";

    if (v2.length != v1.length){
      System.out.println("Los arrays no son del mismo tamaño");
    } else {
      for (int i = 0; i<v1.length; i++){
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