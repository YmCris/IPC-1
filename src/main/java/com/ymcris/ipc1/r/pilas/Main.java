package com.ymcris.ipc1.r.pilas;

/**
 * Main
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Main {

    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();
        pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4");
        pila.push("5");

        System.out.println(pila.pop());
        System.out.println(pila.empty());
        System.out.println(pila.pop());
        System.out.println(pila.empty());

    }
}
