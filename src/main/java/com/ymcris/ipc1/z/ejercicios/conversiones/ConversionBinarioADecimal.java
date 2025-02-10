package com.ymcris.ipc1.z.ejercicios.conversiones;

import java.util.Scanner;

/**
 * Crea un programa que lea un número binario proporcionado por el usuario y lo
 * convierta a su equivalente decimal sin utilizar funciones propias del
 * lenguaje que realicen la conversión directamente.
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class ConversionBinarioADecimal {

    private int numeroDecimal;
    private int numeroBinario;

    Scanner scan = new Scanner(System.in);

    /**
     * Método Main encargado de hacer que el programa funcione.
     *
     * @param args Argumentos que se deben poner en el .jar
     */
    public static void main(String[] args) {
        ConversionBinarioADecimal conversion = new ConversionBinarioADecimal();
        conversion.repetirProceso();
    }

    /**
     * Método encargado de pedir el número al usuario
     */
    private int pedirNumero() {
        System.out.println("Ingrese el número a convertir a binario");
        numeroDecimal = Integer.parseInt(scan.nextLine());
        return numeroDecimal;
    }

    /**
     * Método encargado de repetir el proceso las veces que el usuario desee.
     */
    private void repetirProceso() {
        boolean continuarCalculando;
        String opcion;
        do {
            mostrarNumero();
            System.out.println("Desea continuar calculando?   S/N");
            opcion = scan.nextLine();
            if (opcion.equals("S")) {
                continuarCalculando = true;
            } else if (opcion.equals("N")) {
                System.out.println("Ya no calcularé");
                continuarCalculando = false;
            } else {
                System.out.println("Opción no válida");
                continuarCalculando = false;
            }
        } while (continuarCalculando == true);
    }

    /**
     * Método encargado de mostrar el número
     */
    private void mostrarNumero() {
        numeroBinario = retornarEnBinario(pedirNumero());
        //retornarEnBinario(pedirNumero()); <- ES LO MISMO
        System.out.println("El número: " + numeroDecimal + " Es el número: " + numeroBinario + " en binario");
    }

    /**
     * Método encargado de retornar un número en binario.
     *
     * @param numeroAConvertir - Usa el número normal.
     * @return Retorna el número ya en binario.
     */
    private int retornarEnBinario(int numeroAConvertir) {
        StringBuilder binario = new StringBuilder();
        while (numeroAConvertir > 0) {
            binario.insert(0, numeroAConvertir % 2);
            numeroAConvertir /= 2;
        }
        numeroBinario = binario.length() > 0 ? Integer.parseInt(binario.toString()) : 0;
        return numeroBinario;
    }
}
