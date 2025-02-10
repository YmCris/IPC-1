package com.ymcris.ipc1.z.ejercicios.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Crea un programa que muestre la hora actual y la fecha en el formato HH:MM:SS
 * DD/MM/AAAA, donde HH representa las horas, MM los minutos, SS los segundos,
 * DD el día, MM el mes y AAAA el año y además este se este actualizando
 * constantemente.
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class RelojDigital {

    private final DateTimeFormatter formatoDeHora = DateTimeFormatter.ofPattern("dd/MM/YYYY HH/mm/ss");
    private String fecha;

    public static void main(String[] args) {
        RelojDigital relojDigital = new RelojDigital();
        relojDigital.mostrarHora();
    }

    private void mostrarHora() {
        while (true) {
            LocalDateTime horaActual = LocalDateTime.now();
            fecha = horaActual.format(formatoDeHora);
            System.out.println(fecha);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El error se encuentra en la silla.");
                e.printStackTrace();
            }
        }
    }
}
