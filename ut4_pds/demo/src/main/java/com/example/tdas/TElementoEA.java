package com.example.tdas;

import java.util.LinkedList;
import java.util.List;


public class TElementoEA extends TElementoAB<Integer> {

  public TElementoEA(Comparable etiqueta, Integer datos) {
    super(etiqueta, datos);
  }

  public String insertarAE(String expresion) {
    if (esOperando()) {
      String nuevaExpresion = expresion.substring(1);
      char etiqueta = nuevaExpresion.charAt(0);

      // insertar hijo izquierdo
      TElementoEA hijoIzq = new TElementoEA(etiqueta, Character.getNumericValue(etiqueta));
      this.setHijoIzq(hijoIzq);
      nuevaExpresion = hijoIzq.insertarAE(nuevaExpresion);

      // insertar hijo derecho
      nuevaExpresion = nuevaExpresion.substring(1);
      char etiquetaDer = nuevaExpresion.charAt(0);
      TElementoEA hijoDer = new TElementoEA(etiquetaDer, Character.getNumericValue(etiquetaDer));
      this.setHijoDer(hijoDer);
      nuevaExpresion = hijoDer.insertarAE(nuevaExpresion);

      return nuevaExpresion;
    }
    return expresion;
  }

  public boolean esOperando() {
    switch (etiqueta.toString()) {
      case "+":
        return true;
      case "-":
        return true;
      case "*":
        return true;
      case "/":
        return true;
      default:
        return false;
    }
  }

  public int procesar() {
    if (!esHoja()) {
      int exp1 = ((TElementoEA) hijoIzq).procesar();
      int exp2 = ((TElementoEA)hijoDer).procesar();
      return ProcesarOperacion(exp1, etiqueta, exp2);
    }
    return this.datos;
  }

  public int ProcesarOperacion(int a, Comparable operacion, int b) {
    switch (operacion.toString()) {
      case "+":
          return a+b;
      case "-":
        return a-b;
      case "*":
        return a*b;

      case "/":
        return a/b;
      default:
        return 0;
    }
  }

}
