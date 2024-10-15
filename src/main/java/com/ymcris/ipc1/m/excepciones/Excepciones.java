package com.ymcris.ipc1.m.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase para probar el try catch finally
 *
 * @author YmCris
 */
public class Excepciones {

    static Scanner scanner = new Scanner(System.in);
    private static int x;

    public static void main(String[] args) {
        Excepciones exceptions = new Excepciones();
        exceptions.manejoDeErrores();
    }

    /**
     * Método generado para implementar el try catch
     */
    private void manejoDeErrores() {
        System.out.println("Dame un valor númerico");
        try {//Realiza la acción que puede generar un ERROR, al ingresar un dato no numérico.
            x = scanner.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {//Captura el error en dado caso se genere.
            System.out.println("No me diste un valor númerico");
        } finally {//pasará sin importar que suceda o no.
            System.out.println("El número ingresado es: " + x);
        }
    }
}
