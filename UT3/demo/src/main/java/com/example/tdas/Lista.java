package com.example.tdas;

public class Lista<T> implements ILista<T> {

    class Nodo<T> {

        protected Comparable etiqueta;
        protected T dato;
        protected Nodo<T> siguiente = null;
    
        protected Nodo(Comparable etiqueta, T dato ) {
            this.etiqueta = etiqueta;
            this.dato = dato;
        }
    }

    protected Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public boolean insertar(T dato, Comparable clave) {
        Nodo<T> nuevo = new Nodo<T>(clave, dato);
        Nodo<T> aux = primero;
        if (primero == null) {
            primero = nuevo;
        } else {
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        return true;
    }

    @Override
    public T buscar(Comparable clave) {
        Nodo <T> aux = primero;
        if (aux != null) {
            while (aux != null) {
                if (aux.etiqueta == clave) {
                    return aux.dato;
                }
                aux = aux.siguiente;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {

        if (primero == null) {
            return false; // La lista está vacía
        }

        if (primero.etiqueta == clave) {
            primero = primero.siguiente; // Eliminar el primer nodo
            return true;
        }

        Nodo<T> aux = primero;
        while (aux.siguiente != null && aux.siguiente.etiqueta != clave) {
            aux = aux.siguiente;
        }

        if (aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente; // Eliminar el nodo encontrado
            return true;
        }
        return false;
    }

    @Override
    public String imprimir() {

        StringBuilder resultado = new StringBuilder();
        Nodo<T> aux = primero;
        while (aux != null) {
            resultado.append(aux.etiqueta);
            if (aux.siguiente != null) {
                resultado.append(" -> ");
            }
            aux = aux.siguiente;
        }
        return resultado.toString();
    }

    @Override
    public String imprimir(String separador) {

        StringBuilder resultado = new StringBuilder();
        Nodo<T> aux = primero;
        while (aux != null) {
            resultado.append(aux.etiqueta);
            if (aux.siguiente != null) {
                resultado.append(separador);
            }
            aux = aux.siguiente;
        }
        return resultado.toString();
    }

    @Override
    public int cantElementos() {

        int contador = 0;
        Nodo<T> aux = primero;
        while (aux != null) {
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    // Eliminar duplicados
    @SuppressWarnings("unchecked")
    public void eliminarDuplicados() {
        Nodo<T> nodoActual = primero;

        while (nodoActual != null) {
            Nodo<T> otroNodo = nodoActual.siguiente;

            while (otroNodo != null) {
                if (otroNodo.etiqueta.compareTo(nodoActual.etiqueta) == 0) {
                    eliminar(otroNodo.etiqueta); // Utiliza el método eliminar que ya implementamos
                }
                otroNodo = otroNodo.siguiente;
            }

            nodoActual = nodoActual.siguiente;
        }
    }
}
