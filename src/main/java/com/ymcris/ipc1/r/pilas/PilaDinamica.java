package com.ymcris.ipc1.r.pilas;

/**
 * Clase que crea pilas dinámicas
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class PilaDinamica {

    Object arreglo[];
    int top;

    public PilaDinamica() {
        this.arreglo = new Object[2];
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
        if (top < arreglo.length) {
            arreglo[top] = objeto;
            top++;
        } else {
            Object temporal[] = new String[arreglo.length + 2];
            for (int i = 0; i < arreglo.length; i++) {
                temporal[i] = arreglo[i];
            }
            arreglo = temporal;
            arreglo[top] = objeto;
            top++;
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
