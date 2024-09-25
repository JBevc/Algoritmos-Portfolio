package com.example.tdas;

public class ListaOrdenada<T> extends Lista<T> {
  
  @Override
  public boolean insertar(T dato, Comparable clave) {
    Nodo<T> nuevoNodo = new Nodo<T>(clave, dato);

    // Si la lista es vacia
    if (primero == null) {
      primero = nuevoNodo;
      return true;
    }
    Nodo<T> aux = primero;
    // si la etiqueta del primer nodo es mayor a actual
    if (aux.etiqueta.compareTo(nuevoNodo.etiqueta) > 0) {
      nuevoNodo.siguiente = aux;
      primero = nuevoNodo;
      return true;
    }

    while (aux.siguiente != null) {
      if (aux.siguiente.etiqueta.compareTo(nuevoNodo.etiqueta) > 0) {
        nuevoNodo.siguiente = aux.siguiente;
        aux.siguiente = nuevoNodo;
        return true;
      }
      aux = aux.siguiente;
    }

    // Se inserta al final
    aux.siguiente = nuevoNodo;
    return true;
  }

  
  
}
