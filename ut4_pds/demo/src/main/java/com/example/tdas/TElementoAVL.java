package com.example.tdas;

public class TElementoAVL<T> extends TElementoAB<T> {

    private int altura;

    public TElementoAVL(Comparable etiqueta, T datos) {
        super(etiqueta, datos);
        this.altura = 0;
    }

    public int getAltura() {
        return this.altura;
    }

    private int getBalance() {
        int alturaIzq = (this.hijoIzq != null) ? ((TElementoAVL<T>) this.hijoIzq).getAltura() : -1;
        int alturaDer = (this.hijoDer != null) ? ((TElementoAVL<T>) this.hijoDer).getAltura() : -1;
        return alturaIzq - alturaDer;
    }

    public void actualizarAltura() {

        int alturaIzq = (this.hijoIzq != null) ? ((TElementoAVL<T>) this.hijoIzq).getAltura() : -1;
        int alturaDer = (this.hijoDer != null) ? ((TElementoAVL<T>) this.hijoDer).getAltura() : -1;
        this.altura = Math.max(alturaIzq, alturaDer) + 1;
    }

    private TElementoAVL<T> rotarLL() {
        TElementoAVL<T> k1 = (TElementoAVL<T>) this.hijoIzq;
        this.hijoIzq = k1.hijoDer;
        k1.hijoDer = this;
        this.actualizarAltura();
        k1.actualizarAltura();
        return k1;
    }

    private TElementoAVL<T> rotarRR() {
        TElementoAVL<T> k2 = (TElementoAVL<T>) this.hijoDer;
        this.hijoDer = k2.hijoIzq;
        k2.hijoIzq = this;
        this.actualizarAltura();
        k2.actualizarAltura();
        return k2;
    }

    public TElementoAVL<T> insertarAVL(TElementoAVL<T> nuevoNodo) {
        if (nuevoNodo.getEtiqueta().compareTo(etiqueta) < 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = nuevoNodo;
            } else {
                this.hijoIzq = ((TElementoAVL<T>) this.hijoIzq).insertarAVL(nuevoNodo);
            }
        } else if (nuevoNodo.getEtiqueta().compareTo(this.etiqueta) > 0) {
            if (this.hijoDer == null) {
                this.hijoDer = nuevoNodo;
            } else {
                this.hijoDer = ((TElementoAVL<T>) this.hijoDer).insertarAVL(nuevoNodo);
            }
        }
        this.actualizarAltura();
        return balancear();
    }

    public TElementoAVL<T> eliminarAVL(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
            if (this.hijoIzq != null) {
                this.hijoIzq = ((TElementoAVL<T>) this.hijoIzq).eliminarAVL(unaEtiqueta);
            }
        } else if (unaEtiqueta.compareTo(this.etiqueta) > 0) {
            if (this.hijoDer != null) {
                this.hijoDer = ((TElementoAVL<T>) this.hijoDer).eliminarAVL(unaEtiqueta);
            }
        } else {
            if (this.hijoIzq == null || this.hijoDer == null) {
                return (this.hijoIzq != null) ? (TElementoAVL<T>) this.hijoIzq : (TElementoAVL<T>) this.hijoDer;
            } else {
                TElementoAVL<T> sucesor = obtenerMinimo(this.hijoDer);
                this.etiqueta = sucesor.getEtiqueta();
                this.datos = sucesor.getDatos();
                this.hijoDer = ((TElementoAVL<T>) this.hijoDer).eliminarAVL(sucesor.getEtiqueta());
            }
        }
        if (this != null) {
            this.actualizarAltura();
            return balancear();
        }
        return this;
    }

    private TElementoAVL<T> balancear() {
        int balance = getBalance();
        if (balance > 1) {
            if (((TElementoAVL<T>) this.hijoIzq).getBalance() < 0) {
                this.hijoIzq = ((TElementoAVL<T>) this.hijoIzq).rotarRR();
            }
            return this.rotarLL();
        }
        if (balance < -1) {
            if (((TElementoAVL<T>) this.hijoDer).getBalance() > 0) {
                this.hijoDer = ((TElementoAVL<T>) this.hijoDer).rotarLL();
            }
            return this.rotarRR();
        }
        return this;
    }

    private TElementoAVL<T> obtenerMinimo(IElementoAB<T> nodo) {
        while (nodo.getHijoIzq() != null) {
            nodo = nodo.getHijoIzq();
        }
        return (TElementoAVL<T>) nodo;
    }
}
