package com.ymcris.ipc1.z.ejercicios.arreglos;

import java.util.Scanner;

/**
 * Dada una matriz no vacía de números enteros, tu misión es devolver el
 * resultado de multiplicar todos los valores en orden. Por ejemplo, para la
 * entrada [1, 2, 3, 4], el resultado debe ser 1 * 2 * 3 * 4 = 24.
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class MultiplicacionDeDatos {

    private int tamaño;
    private int resultado;
    private int[] numerosAGuardar;

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        MultiplicacionDeDatos datos = new MultiplicacionDeDatos();
        datos.pedirTamaño();
    }

    public MultiplicacionDeDatos() {
        this.resultado = 1;
    }

    private void pedirTamaño() {
        System.out.println("Ingresa la cantidad de números a guardar");
        tamaño = Integer.parseInt(scan.nextLine());
        numerosAGuardar = new int[tamaño];
        pedirNumeros(numerosAGuardar);
    }

    private void pedirNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el " + i + " número a guardar:");
            numeros[i] = Integer.parseInt(scan.nextLine());
        }
        multiplicarNúmeros(numeros);
    }

    private void multiplicarNúmeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                resultado *= numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("El resultado de multiplicar");
        System.out.println("Es: " + resultado);
    }

}
