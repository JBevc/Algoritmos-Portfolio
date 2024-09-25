package com.example.tdas;

public class Conjunto<T> extends Lista<T>{
  
  public Conjunto<T> unionConjuntos(Conjunto<T> otroConjunto) {
    Conjunto<T> union = new Conjunto<>();
    Nodo<T> aux = otroConjunto.primero;
    while (aux != null) {
      union.insertar(aux.dato, aux.etiqueta);
      aux = aux.siguiente;
    }
    
    aux =  this.primero;
    while (aux != null) {
      union.insertar(aux.dato, aux.etiqueta);
      aux = aux.siguiente;
    }
      
    return union;
  }

  @Override
  public boolean insertar(T dato, Comparable clave) {
    if (buscar(clave) == null) {
      return super.insertar(dato, clave);
    }
    
    return false;
  }

  public Conjunto<T> inserseccion(Conjunto<T> otroConjunto) {
    Conjunto<T> interseccion = new Conjunto<>();
    Nodo<T> aux = primero;
    while (aux != null) {
      if (otroConjunto.buscar(aux.etiqueta) != null) {
        interseccion.insertar(aux.dato, aux.etiqueta);
      }
      aux = aux.siguiente;
    }

    return interseccion;
  }
}
