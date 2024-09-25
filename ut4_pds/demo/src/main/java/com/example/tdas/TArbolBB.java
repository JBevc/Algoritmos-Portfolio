package com.example.tdas;

import java.util.LinkedList;
import java.util.List;

public class TArbolBB<T> implements IArbolBB<T> {

  protected TElementoAB<T> raiz;

  public TArbolBB() {
    raiz = null;
  }

  @Override
  public boolean insertar(Comparable etiqueta, T unDato) {
    int[] contador = new int[] { 0 };
    boolean ret = false;
    TElementoAB nuevoElemento = new TElementoAB(etiqueta, unDato);
    if (raiz == null) {
      raiz = nuevoElemento;
      ret = true;
    } else {
      ret = raiz.insertar(nuevoElemento);
    }
    System.out.println(contador[0]);
    return ret;
  }

  @Override
  public IElementoAB buscar(Comparable unaEtiqueta) {
    if (esVacio()) {
      return null;
    } else {
      return raiz.buscar(unaEtiqueta);
    }
  }

  @Override
  public void eliminar(Comparable unaEtiqueta) {
    if (this.raiz != null) {
      this.raiz = this.raiz.eliminar(unaEtiqueta);
    }
  }

  @Override
  public String preOrdenString() {
    List<T> listaPreOrden = preOrden(); // Obtener el recorrido en preorden como una LinkedList
    String arbolPreOrden = "";

    // Recorrer la lista y construir el string
    for (T elemento : listaPreOrden) {
      arbolPreOrden += elemento + " ";
    }
    ;

    return arbolPreOrden;
  }

  @Override
  public List<T> preOrden() {
    LinkedList<T> listaPreOrden = new LinkedList<>();
    if (esVacio()) {
      return null;
    } else {
      raiz.preOrden(listaPreOrden);
    }
    return listaPreOrden;
  }

  public String inOrdenStringEtiqueta() {
    List<Comparable> listaInOrden = inOrdenEtiqueta(); // Obtener el recorrido en preorden como una LinkedList
    String arbolPreOrden = "";

    // Recorrer la lista y construir el string
    for (Comparable elemento : listaInOrden) {
      arbolPreOrden += elemento + " ";
    }

    return arbolPreOrden;
  }


  public List<Comparable> inOrdenEtiqueta() {
    LinkedList<Comparable> listaPreOrden = new LinkedList<>();
    if (esVacio()) {
      return listaPreOrden;
    } else {
      raiz.inOrdenEtiqueta(listaPreOrden);
    }
    return listaPreOrden;
  }


  public List<T> inOrden() {
    LinkedList<T> listaInOrden = new LinkedList<>();
    if (esVacio()) {
      return null;
    } else {
      raiz.inOrden(listaInOrden);
    }
    return listaInOrden;
  }

  @Override
  public String inOrdenString() {
    List<T> lista = inOrden();
    String arbolInOrden = "";

    for (T elemento : lista) {
      arbolInOrden += elemento + " ";
    }
    ;
    return arbolInOrden;
  }

  @Override
  public List<T> postOrden() {
    LinkedList<T> unaLista = new LinkedList<T>();
    if (esVacio()) {
      return null;
    } else {
      raiz.postOrden(unaLista);
    }
    return unaLista;
  }

  public String postOrdenString() {
    List<T> listaPostOrden = postOrden();
    StringBuilder postOrden = new StringBuilder();
    for (T elemento : listaPostOrden) {
      postOrden.append(elemento).append(" ");
    }
    return postOrden.toString();
  }

  @Override
  public boolean esVacio() {
    if (raiz == null) {
      return true;
    }
    return false;
  }

  @Override
  public boolean vaciar() {
    if (raiz == null) {
      return false;
    }
    raiz = null;
    return true;
  }

  public int obtenerAltura() {
    if (esVacio()) {
      return -1;
    }
    return raiz.altura();
  }

  public int obtenerCantHojas() {
    if (esVacio()) {
      return -1;
    }
    return raiz.hijoIzq.cantHojas() + raiz.hijoDer.cantHojas();
  }

  public int obtenerTamaño() {
    if (esVacio()) {
      return 0;
    }
    return raiz.obtenerTamaño();
  }

  public int obtenerNivel(Comparable unaEtiqueta) {
    if (esVacio()) {
      return -1;
    } else {
      return raiz.obtenerNivel(unaEtiqueta, 0);
    }
  }
}