package com.ymcris.ipc1.q.listasdinamicas.listasenlazadas;

/**
 *
 * @author YmCris
 */
public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("La lista contiene:");

        for (int i = 0; i < 6; i++) {
            lista.insertarPrimerNodo(i);
        }
        
        lista.eliminarNodo(1);

        System.out.println("Primer elemento: " + lista.obtenerNodo(0));
        System.out.println("Segundo elemento: " + lista.obtenerNodo(1));
        System.out.println("Ultimo elemento: " + lista.obtenerNodo(lista.getTamaño() - 1));
    }

}
