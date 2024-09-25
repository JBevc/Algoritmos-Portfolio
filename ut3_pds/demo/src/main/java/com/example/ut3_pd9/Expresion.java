package com.example.ut3_pd9;

import java.util.Stack;

public class Expresion {
  public static boolean controlCorchetes(char[] listaDeEntrada) {
    Stack<Character> pila = new Stack<>();
    if (listaDeEntrada.length == 0) {
      return false;
    }
    for (char caracter : listaDeEntrada) {
      if (caracter == '{') {
        pila.push(caracter);
      } else if (caracter =='}'){
        if (pila.isEmpty()) {
          return false;
        }
        pila.pop();
      }
    }
    if (pila.isEmpty()) {
      return true;
    }
    return false;
  }
}
