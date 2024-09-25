package com.example.tdas;

public class TArbolAVL<T> extends TArbolBB<T> {

    @Override
    public boolean insertar(Comparable etiqueta, T unDato) {
        TElementoAVL<T> nuevoNodo = new TElementoAVL<>(etiqueta, unDato);
        if (this.raiz == null) {
            this.raiz = nuevoNodo;
            return true;
        } else {
            this.raiz = ((TElementoAVL<T>) this.raiz).insertarAVL(nuevoNodo);
            return true;
        }
    }

    @Override
    public void eliminar(Comparable etiqueta) {
        if (this.raiz != null) {
            this.raiz = ((TElementoAVL<T>) this.raiz).eliminarAVL(etiqueta);
        }
    }
}

