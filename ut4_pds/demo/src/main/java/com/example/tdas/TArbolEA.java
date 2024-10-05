package com.example.tdas;

public class TArbolEA extends TArbolBB<Integer>{

  public TArbolEA() {
    super();
    raiz;
  }

  public String construir(String expresion) {
    char etiqueta =  expresion.charAt(0);
    TElementoEA nodo = new TElementoEA(etiqueta, Character.getNumericValue(etiqueta));

    nodo.insertarAE(expresion);
    this.raiz = nodo;
    return inOrdenStringEtiqueta();
  }

  public int procesar() {
    if (esVacio()) {
      return -1;
    }
    return ((TElementoEA)raiz).procesar();
  } 
}
