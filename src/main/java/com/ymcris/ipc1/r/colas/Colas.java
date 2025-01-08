package com.ymcris.ipc1.r.colas;

import javax.swing.JOptionPane;

/**
 * Clase encargada de crear colas.
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Colas {

    private Nodo finalCola;
    private Nodo inicioCola;
    String Cola = "";

    public Colas() {
        inicioCola = null;
        finalCola = null;
    }

    /**
     * Método para saber si la cola esta vacia
     *
     * @return si esta vacia
     */
    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para insertar a la cola
     *
     * @param informacion Dato a almacenar en la cola.
     */
    public void insertar(Object informacion) {
        Nodo nuevo = new Nodo();
        nuevo.dato = informacion;
        nuevo.siguiente = null;
        if (colaVacia()) {
            inicioCola = nuevo;
            finalCola = nuevo;
        } else {
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
    }

    /**
     * Método para extraer de la cola
     *
     * @return objeto extarido
     */
    public Object extraer() {
        if (!colaVacia()) {
            Object dato = inicioCola.dato;
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return dato;
        } else {
            return null;
        }
    }

    /**
     * Método para mostrar el contenido de la cola
     */
    public void mostrarContenido() {
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        while (recorrido != null) {
            Cola += recorrido.dato + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena[] = Cola.split(" ");
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
