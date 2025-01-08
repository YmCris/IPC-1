package com.ymcris.ipc1.q.listasdinamicas.listasdoblementeenlzadas;

/**
 *
 * @author YmCris
 */
public class NodoDoble {

    private Object objeto;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

}
