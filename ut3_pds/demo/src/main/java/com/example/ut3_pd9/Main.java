package com.example.ut3_pd9;

public class Main {

  public static void main(String[] args) {
    char[] lista = {'{', '{','}', '{', '}', '}'};
    boolean resultado = Expresion.controlCorchetes(lista);
    System.out.println(resultado);

    char[] lista2 = {'{', '}', '{', '}', '}'};
    boolean resultado2 = Expresion.controlCorchetes(lista2);
    System.out.println(resultado2);
  }
}

