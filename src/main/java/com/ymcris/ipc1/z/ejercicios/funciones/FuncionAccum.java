package com.ymcris.ipc1.z.ejercicios.funciones;

import java.util.Scanner;

/**
 * Escribe una función llamada accum que tome como parámetro una cadena que
 * incluye solo letras de la A a la Z (tanto minúsculas como mayúsculas). La
 * función debe transformar la cadena de la siguiente manera:
 *
 * La primera letra debe ser mayúscula, seguida de tantas copias de esa letra
 * como su posición en la cadena (empezando desde 1).
 *
 * Las diferentes partes deben estar separadas por un guion ("-").
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class FuncionAccum {

//------------------------------------------------------------------------------
    private String palabraDesordenada;
//------------------------------------------------------------------------------
    Scanner scan = new Scanner(System.in);
    StringBuilder palabraOrdenada = new StringBuilder();
//------------------------------------------------------------------------------

    public static void main(String[] args) {
        FuncionAccum funtion = new FuncionAccum();
        funtion.pedirLetras();
    }

    private void pedirLetras() {
        System.out.println("Ingresa las letras:");
        palabraDesordenada = scan.nextLine();
        System.out.println("Las letras ordenadas son:");
        System.out.println(accum(palabraDesordenada));
    }

    private String accum(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            palabraOrdenada.append(Character.toUpperCase(letra));
            palabraOrdenada.append(String.valueOf(Character.toLowerCase(letra)).repeat(i));
            if (i < palabra.length() - 1) {
                palabraOrdenada.append("-");
            }
        }
        return palabraOrdenada.toString();
    }

}
