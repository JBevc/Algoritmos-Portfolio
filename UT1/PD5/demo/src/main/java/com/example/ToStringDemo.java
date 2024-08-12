package com.example;

// Ejercicio 5
public class ToStringDemo {
  public static void main(String[] args) {
  double d = 888.51;
  String s = Double.toString(d);
  int dot = s.indexOf('.');

  // Se toma el indice donde esta el caracter de la coma y por eso se imprime 3
  System.out.println(dot + " digits " +
  "before decimal point.");
  // Restando el indice anterior y uno podemos obtener cuantos numeros quedan despues de la coma,
  // es lo mismo que restarle al total todos los caracteres antes de la coma y la coma inclusive (que son 3 + 1)
  System.out.println( (s.length() - dot - 1) +
  " digits after decimal point.");
  }
}
// La salida obtenida es:
// 3 digits before decimal point.
// 2 digits after decimal point.