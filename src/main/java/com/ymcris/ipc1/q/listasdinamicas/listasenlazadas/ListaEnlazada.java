package com.ymcris.ipc1.q.listasdinamicas.listasenlazadas;

/**
 * Clase encargada de generar una lista enlazada.
 *
 * @author YmCris
 */
public class ListaEnlazada {

    private int tamaño;
    private Nodo inicio;

    /**
     * Constructor que define el inicio vacio y la lista vacia.
     */
    public ListaEnlazada() {
        inicio = null;
        tamaño = 0;
    }

    /**
     * Método encargado de insertar un nodo en la primera posición de la lista.
     *
     * @param objeto Nodo (Dato) que se va a almacenar en la primera posición.
     */
    protected void insertarPrimerNodo(Object objeto) {
        if (inicio == null) {//Verifica si la lista esta vacia, de estarlo añade un nodo en el inicio.
            inicio = new Nodo(objeto);
        } else {//Almacena el dato en un nodo suelto, crea un nuevo nodo y se enlaza el nuevo con el "suelto"  y el nuevo toma el valor del inicial.
            Nodo temporal = inicio;
            Nodo nuevo = new Nodo(objeto);
            nuevo.enlazarSiguiente(temporal);
            inicio = nuevo;
        }
        tamaño++;//Incrementa el tamaño de la lista enlazada.
    }

    /**
     * Método encargado de eliminar el primer nodo.
     */
    protected void eliminarPrimerNodo() {
        inicio = inicio.getSiguiente();//Marca el inicio como el segundo
        tamaño--;
    }

    /**
     * Método encargado de obtener un nodo en una posición cualquiera.
     *
     * @param indice lugar donde se obtendrá el nodo
     * @return Nodo en la posición del indice
     */
    protected Object obtenerNodo(int indice) {
        int contador = 0;
        Nodo temporal = inicio;
        while (contador < indice) {//Recorre toda la lista hasta que el nodo temporal sea el del indice
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getObjeto();
    }

    /**
     * Método encargado de eliminar el nodo en cualquier posición.
     *
     * @param indice lugar en el cual se va a eliminar el nodo.
     */
    protected void eliminarNodo(int indice) {
        if (indice == 0) {//Verifica si se quiere eliminar el primer nodo
            eliminarPrimerNodo();
        } else {//Guarda el último nodo en un nodo temporal
            int contador = 0;
            Nodo temporal = inicio;
            while (contador < indice - 1) {
                temporal = temporal.getSiguiente();
                contador++;
            }//El nodo temporal enlaza al siguiente del siguiente, por lo que el "siguiente" no se enlaza a nada.
            temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
        }
        tamaño--;
    }

    /**
     * Devuelve el tamaño de la lista enlazada
     *
     * @return Devuelve el tamaño de la lista enlazada
     */
    public int getTamaño() {
        return tamaño;
    }

}
