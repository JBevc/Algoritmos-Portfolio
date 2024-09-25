package com.example.ut2_pd2;

public class Factorial {
  
  public static int calcularFactorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * calcularFactorial(n - 1);
    }
  }
}
