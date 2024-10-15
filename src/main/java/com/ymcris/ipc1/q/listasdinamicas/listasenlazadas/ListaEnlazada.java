package com.ymcris.ipc1.q.listasdinamicas.listasenlazadas;

/**
 *
 * @author YmCris
 */
public class ListaEnlazada {

    private int tamaño;
    private Nodo inicio;

    public ListaEnlazada() {
        inicio = null;
        tamaño = 0;
    }

    protected void insertarPrimerNodo(Object objeto) {
        if (inicio == null) {
            inicio = new Nodo(objeto);
        } else {
            Nodo temp = inicio;
            Nodo nuevo = new Nodo(objeto);
            nuevo.enlazarSiguiente(temp);
            inicio = nuevo;
        }
        tamaño++;
    }

    protected void eliminarPrimerNodo() {
        inicio = inicio.getSiguiente();
        tamaño--;
    }

    protected void eliminarNodo(int indice) {
        if (indice == 0) {
            eliminarPrimerNodo();
        } else {
            int contador = 0;
            Nodo temporal = inicio;
            while (contador < indice - 1) {
                temporal = temporal.getSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
        }
        tamaño--;
    }

    protected Object obtenerNodo(int indice) {
        int contador = 0;
        Nodo temporal = inicio;
        while (contador < indice) {
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getObjeto();
    }

    public int getTamaño() {
        return tamaño;
    }

}
