package com.example.ut2_pd2;

public class Potencia {
  public static int calcularPotencia(int x, int n) {
    if (n == 0) {
      return 1;
    } else {
      return x * calcularPotencia(x, n-1);
    }
  }
}
