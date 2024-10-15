package com.ymcris.ipc1.q.listasdinamicas.listasenlazadas;

/**
 * Clase encargada de generar un nodo
 *
 * @author YmCris
 */
public class Nodo {

    private Nodo siguiente;
    private Object objeto;

    public Nodo(Object objeto) {
        this.objeto = objeto;
        this.siguiente = null;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void enlazarSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

}
