package com.example.tdas;

import java.util.LinkedList;

public class TElementoAB<T> implements IElementoAB<T> {

  Comparable etiqueta;
  TElementoAB hijoIzq;
  TElementoAB hijoDer;
  T datos;

  public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
    etiqueta = unaEtiqueta;
    datos = unosDatos;
  }

  @Override
  public Comparable getEtiqueta() {
    return this.etiqueta;
  }

  @Override
  public IElementoAB<T> getHijoIzq() {
    return this.hijoIzq;
  }

  @Override
  public IElementoAB<T> getHijoDer() {
    return this.hijoDer;
  }

  @Override
  public void setHijoIzq(IElementoAB<T> elemento) {
    this.hijoIzq = (TElementoAB) elemento;
  }

  @Override
  // de tipo IElemento o TElemento?????
  public void setHijoDer(IElementoAB<T> elemento) {
    this.hijoDer = (TElementoAB) elemento;
  }

  @SuppressWarnings("unchecked")
  @Override
  public IElementoAB<T> buscar(Comparable unaEtiqueta) {
    if (unaEtiqueta.compareTo(this.etiqueta) == 0) {
      return this;
    } else {
      if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
        if (hijoIzq != null) {
          return hijoIzq.buscar(unaEtiqueta);
        } else {
          return null;
        }
      } else {
        if (unaEtiqueta.compareTo(etiqueta) > 0) {
          if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta);
          } else {
            return null;
          }
        } else {
          return null;
        }
      }
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean insertar(IElementoAB<T> elemento) {
    if (elemento.getEtiqueta().compareTo(etiqueta) == 0) {
      return false;
    }
    if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
      if (this.hijoIzq == null) {
        this.setHijoIzq(elemento);
      } else {
        this.getHijoIzq().insertar(elemento);
      }
    } else {
      if (this.hijoDer == null) {
        this.setHijoDer(elemento);
      } else {
        this.getHijoDer().insertar(elemento);
      }
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean insertar(IElementoAB<T> elemento, int[] contador) {
    contador[0] = contador[0] + 1;
    if (elemento.getEtiqueta().compareTo(etiqueta) == 0) {
      return false;
    }
    if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
      if (elemento.getHijoIzq() == null) {
        this.setHijoIzq(elemento);
      } else {
        this.getHijoIzq().insertar(elemento);
      }
    } else {
      if (elemento.getHijoDer() == null) {
        this.setHijoDer(elemento);
      } else {
        this.getHijoDer().insertar(elemento);
      }
    }
    return true;
  }

  @Override
  public void preOrden(LinkedList<T> unaLista) {
    unaLista.add(this.datos);
    if (this.hijoIzq != null) {
      this.hijoIzq.preOrden(unaLista);
    }
    if (this.hijoDer != null) {
      this.hijoDer.preOrden(unaLista);
    }
  }

  public void inOrdenEtiqueta(LinkedList<Comparable> unaLista) {
    if (this.hijoIzq != null) {
      this.hijoIzq.inOrdenEtiqueta(unaLista);
    }
    unaLista.add(etiqueta);
    if (this.hijoDer != null) {
      this.hijoDer.inOrdenEtiqueta(unaLista);
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public void inOrden(LinkedList<T> unaLista) {
    if (hijoIzq != null) {
      hijoIzq.inOrden(unaLista);
    }
    unaLista.add(this.datos);
    if (hijoDer != null) {
      hijoDer.inOrden(unaLista);
    }
  }

  @Override
  public void postOrden(LinkedList<T> unaLista) {
    if (hijoIzq != null) {
      hijoIzq.postOrden(unaLista);
    }
    if (hijoDer != null) {
      hijoDer.postOrden(unaLista);
    }
    unaLista.add(this.datos);
  }

  @Override
  public T getDatos() {
    return datos;
  }

  @Override
  public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
    if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
      if (hijoIzq != null) {
        hijoIzq = hijoIzq.eliminar(unaEtiqueta);
      }
    } else if (unaEtiqueta.compareTo(this.etiqueta) > 0) {
      if (hijoDer != null) {
        hijoDer = hijoDer.eliminar(unaEtiqueta);
      }
    } else {

      if (hijoIzq == null && hijoDer == null) {
        return null;
      } else if (hijoIzq == null) {
        return hijoDer;
      } else if (hijoDer == null) {
        return hijoIzq;
      } else {
        IElementoAB<T> predecesor = hijoIzq;
        while (predecesor.getHijoDer() != null) {
          predecesor = predecesor.getHijoDer();
        }
        this.etiqueta = predecesor.getEtiqueta();
        this.datos = predecesor.getDatos();
        hijoIzq = hijoIzq.eliminar(this.etiqueta);
      }
    }
    return this;
  }

  @Override
  public int obtenerTamaño() {
    int contador = 1;
    if (hijoIzq != null) {
      contador += hijoIzq.obtenerTamaño();
    }
    if (hijoDer != null) {
      contador += hijoDer.obtenerTamaño();
    }
    return contador;
  }

  public int obtenerNivel(Comparable unaEtiqueta, int nivelActual) {
    if (this.etiqueta.equals(unaEtiqueta)) {
      return nivelActual;
    } else if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
      if (this.hijoIzq != null) {
        return this.hijoIzq.obtenerNivel(unaEtiqueta, nivelActual + 1);
      } else {
        return -1;
      }
    } else {
      if (this.hijoDer != null) {
        return this.hijoDer.obtenerNivel(unaEtiqueta, nivelActual + 1);
      } else {
        return -1;
      }
    }
  }

  public boolean esHoja() {
    if (hijoDer == null && hijoIzq == null) {
      return true;
    }
    return false;
  }

  public int altura() {
    if (esHoja()) {
      return 0;
    }
    if (hijoIzq == null) {
      return hijoDer.altura() + 1;
    }
    if (hijoDer == null) {
      return hijoIzq.altura() + 1;
    }
    return Integer.max(hijoIzq.altura() + 1, hijoDer.altura() + 1);
  }

  public int cantHojas() {
    if (esHoja()) {
      return 1;
    }
    if (hijoIzq == null) {
      return hijoDer.cantHojas();
    }
    if (hijoDer == null) {
      return hijoIzq.cantHojas();
    } else
      return hijoDer.cantHojas() + hijoIzq.cantHojas();
  }

  @Override
  public void actualizarAltura() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarAltura'");
  }
}