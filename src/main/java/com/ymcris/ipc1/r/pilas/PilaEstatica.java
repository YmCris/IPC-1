package com.ymcris.ipc1.r.pilas;

/**
 * Clase encargada de crear una pila desde cero en vez de la pila Stack
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class PilaEstatica {

    Object arreglo[];
    int tamañoMaximo;
    int top;

    public PilaEstatica(int tamañoMaximo) {
        this.arreglo = new Object[tamañoMaximo];
        this.tamañoMaximo = tamañoMaximo;
        this.top = 0;
    }

    public boolean empty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object objeto) {
        if (top < tamañoMaximo) {
            arreglo[top] = objeto;
            top++;
        } else {
            System.out.println("La pila esta llena");
        }
    }

    public Object peek() {
        if (top > 0) {
            return arreglo[top - 1];
        } else {
            return null;
        }
    }

    public Object pop() {
        Object temporal = null;
        if (top > 0) {
            temporal = arreglo[top - 1];
            arreglo[top - 1] = null;
            top--;
        }
        return temporal;
    }
}
