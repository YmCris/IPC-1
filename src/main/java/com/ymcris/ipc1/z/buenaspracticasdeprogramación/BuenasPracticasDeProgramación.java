package com.ymcris.ipc1.z.buenaspracticasdeprogramación;

import java.util.Scanner;

/**
 * BuenasPracticasDeProgramación: Clase encargada de mostrar las buenas
 * prácticas de programación
 *
 * @author crist
 */
public class BuenasPracticasDeProgramación {

    private final int AÑO_ACTUAL = 2024;
    private int edad;
    private String nombre;

    /**
     *
     */
    public void ingresarNombreYEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
    }

    /**
     *
     */
    public void mostrarNombreYEdad() {
        ingresarNombreYEdad();
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("En el año: " + AÑO_ACTUAL);
    }

    /**
     * Método encargado de <b>recibir</b> dos números y sumarlos
     *
     * @param numeroUno - Valor del primer número a sumar
     * @param numeroDos - Valor del segundo número a sumar
     * @return int - Valor entero de sumar dos números
     * @see "BuenasPracticasDeProgramación"
     */
    public int sumarDosNumeros(int numeroUno, int numeroDos) {
        int resultado = numeroUno + numeroDos;
        return resultado;
    }
}
