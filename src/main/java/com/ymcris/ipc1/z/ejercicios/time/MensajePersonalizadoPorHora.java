package com.ymcris.ipc1.z.ejercicios.time;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su nombre y determine la hora del día
 * para mostrar un mensaje de bienvenida personalizado según sea mañana, tarde o
 * noche.
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class MensajePersonalizadoPorHora {

    private final LocalDateTime horaActual = LocalDateTime.now();
    private final int hora = horaActual.getHour();
    private String mensaje;
    private static String nombre;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = scan.nextLine();
        MensajePersonalizadoPorHora mensaje = new MensajePersonalizadoPorHora();
        System.out.println(mensaje.seleccionarMensaje());
    }

    private String seleccionarMensaje() {
        if (hora >= 6 && hora < 12) {//Mañana
            mensaje = "Hola " + nombre + " Bienvenido a la tienda de café, esperamos" + "\nPueda empezar el día con un exquisito cafe de Hoelu";
        } else if (hora >= 12 && hora < 18) {//tarde
            mensaje = "Hola " + nombre + " Bienvenido a la tienda de café, esperamos" + "\nPueda disfrutar de su cafe con pan en Hoelu";
        } else {//noche
            mensaje = "Hola " + nombre + " Bienvenido a la tienda de café, esperamos" + "\nPueda disfrutar de su cafe en Hoelu";
        }

        return mensaje;
    }

}
