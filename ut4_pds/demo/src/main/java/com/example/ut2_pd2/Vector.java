package com.example.ut2_pd2;

public class Vector {
  public static void invertirArray(String[] A, int i, int j) {
    if (i<j) {
      // Intercambio A[j] con A[i]
      String Ai = A[i];
      String Aj = A[j];
      A[i] = Aj;
      A[j] = Ai;
      invertirArray(A, i+1, j-1);
    }
  }
}
