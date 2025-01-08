package com.ymcris.ipc1.q.listasdinamicas.listasenlazadas;

/**
 * Clase encargada de generar un nodo
 *
 * @author YmCris
 */
public class Nodo {

    private Nodo siguiente;
    private Object objeto;

    /**
     * Constructor
     *
     * @param objeto Tipo de dato el cual va a almacenar el nodo.
     */
    public Nodo(Object objeto) {
        this.objeto = objeto;
        this.siguiente = null;
    }

    /**
     * Obtiene el dato, información almacenada en el nodo.
     *
     * @return Dato almacenado en el nodo.
     */
    public Object getObjeto() {
        return objeto;
    }

    /**
     * Marca el nodo con el siguiente nodo.
     *
     * @param siguiente Hace referencia al siguiente nodo.
     */
    public void enlazarSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el nodo que esta siguiente de uno.
     *
     * @return Nodo posterior.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

}
