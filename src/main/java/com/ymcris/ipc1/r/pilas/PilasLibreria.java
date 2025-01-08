package com.ymcris.ipc1.r.pilas;

import java.util.Stack;

/**
 * Clase encargada de generar pilas.
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class PilasLibreria {

    static Guerrero guerrero = new Guerrero();

    //PUSH -- añadir un elemento
    //POP  -- es para sacar el elemento final (El que esta hasta arriba)(lo quita de la pila)
    //PEEK -- para ver ultimo elemento (El que esta hasta arriba)
    //EMPTY-- saber si la pila esta vacia
    public static void main(String[] args) {
        Stack pila = new Stack();//[]
        pila.push("Hola");//[Hola]
        pila.push("Mundo");//[Hola, Mundo]
        pila.push("PEPE");
        pila.push(guerrero.getNombre());
        //[PEPE]
        //[Mundo]
        //[Hola]

        //Va a mostrar el ultimo elemento (PEPE) sacado / borrado
        System.out.println(pila.pop());

        //Va a mostrar el ultimo elemento añadido (Hola)
        System.out.println(pila.peek());
    }

}
