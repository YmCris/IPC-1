package com.ymcris.ipc1.q.listasdinamicas.listasdoblementeenlzadas;

/**
 *
 * @author YmCris
 */
public class ListaDoblementeEnlazada {

    private NodoDoble inicio;
    private NodoDoble fin;
    private int tamaño;

    public ListaDoblementeEnlazada() {
        tamaño = 0;
        inicio = null;
    }

    protected void agregarNodo(Object objeto) {
        NodoDoble nuevo = new NodoDoble(objeto);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        tamaño++;
    }

    protected void eliminarUltimo() throws ListaException {
        if (inicio == null) {
            throw new ListaException("La lista está vacia");
        }
        if (tamaño == 1) {
            inicio = null;
            fin = null;
        } else {
            NodoDoble penultimo = fin.getAnterior();
            penultimo.setSiguiente(null);
            fin.setAnterior(null);
            fin = penultimo;
        }
        tamaño--;
    }

    public Object obtenerContenido(int indice) throws ListaException {
        return obtenerNodo(indice).getObjeto();
    }

    private NodoDoble obtenerNodo(int indice) throws ListaException {
        if (inicio == null) {
            throw new ListaException("La lista esta vacia");
        }
        if (indice >= tamaño) {
            throw new ListaException("El indice esta fuerá del tamaño de la lista");
        }
        int medio = tamaño / 2;
        if (indice < medio) {
            return obtenerNodoAvanzado(indice);
        } else {
            return obtenerNodoRetrocediendo(indice);
        }
    }

    private NodoDoble obtenerNodoAvanzado(int indice) {
        NodoDoble actual = inicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    private NodoDoble obtenerNodoRetrocediendo(int indice) {
        int indiceFinal = tamaño - 1;
        int limite = indiceFinal - indice;
        NodoDoble actual = fin;
        for (int i = 0; i < limite; i++) {
            actual = actual.getAnterior();
        }
        return actual;
    }

}
