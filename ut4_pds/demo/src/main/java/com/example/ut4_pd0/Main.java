package com.example.ut4_pd0;

import com.example.tdas.TArbolEA;

public class Main {
  public static void main(String[] args) {
    TArbolEA arbol = new TArbolEA();
    String construir = arbol.construir("-*+232*-42+56");
    int resultado = arbol.procesar();

    System.out.println(construir + " " + resultado);
  }
}
