package com.ymcris.ipc1.z.ejercicios.funciones;

import java.util.Scanner;

/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class VocalesEnUnaFrase {

    private String palabra;
    private char[] vocales;
    private boolean continuar;
    private int cantidadDeVocales;

    Scanner scan = new Scanner(System.in);

    public VocalesEnUnaFrase() {
        this.vocales = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        this.cantidadDeVocales = 0;
        this.continuar = true;
    }

    public static void main(String[] args) {
        VocalesEnUnaFrase frase = new VocalesEnUnaFrase();
        frase.pedirFrase();
    }

    private void pedirFrase() {
        do {
            System.out.println("Ingresa una palabra o frase:");
            palabra = scan.nextLine();
            calcularVocales(palabra);
            System.out.println("Deseas continuar? Si =1 / No = 2 ");
            int opcion = scan.nextInt();
            scan.nextLine();//SUPER IMPORTANTE POR QUÉ SINO NO SE CONSUME EL SALTO DE LÍNEA PENDIENTE
            if (opcion == 1) {
                continuar = true;
            } else {
                continuar = false;
            }
        } while (continuar == true);
    }

    private void calcularVocales(String palabra) {
        cantidadDeVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);//Obtiene el carácter en la posición i
            for (char vocal : vocales) {//Recorre el arreglo de Vocales
                if (letra == vocal) {
                    cantidadDeVocales++;
                    break;//Sale del bucle interno si encuentra una coincidencia.
                }
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadDeVocales);
    }

}
