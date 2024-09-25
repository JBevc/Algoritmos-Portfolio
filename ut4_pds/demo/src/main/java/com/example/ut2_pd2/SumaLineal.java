package com.example.ut2_pd2;

public class SumaLineal{
  public static int calcularSumaLineal(int[] A, int n){
    if (n == 1) {
      return A[0];
    } else {
      return calcularSumaLineal(A, n-1) + A[n-1];
    }
  }
}
