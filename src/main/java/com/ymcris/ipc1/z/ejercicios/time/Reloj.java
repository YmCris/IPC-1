package com.ymcris.ipc1.z.ejercicios.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Crea un programa que muestre la hora actual y la fecha en el formato HH:MM:SS
 * DD/MM/AAAA, donde HH representa las horas, MM los minutos, SS los segundos,
 * DD el día, MM el mes y AAAA el año.
 */
/**
 *
 *
 * @Date Feb 9, 2025
 * @author YmCris
 */
public class Reloj {

    LocalDateTime date;
    DateTimeFormatter formate;
    String fechaHoraFormateada;

    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.mostrarHora();
    }

    private void mostrarHora() {
        date = LocalDateTime.now();//Obtiene la fecha y hora actual.
        //Se puede ajustar "formate" solo moviendo los parámetros.
        formate = DateTimeFormatter.ofPattern("HH:mm:ss YYYY/dd/MM");//Formato requerido HH:MM:SS DD/MM/YYYY
        fechaHoraFormateada = date.format(formate);//Formatea la fecha y hora actual.
        System.out.println("La fecha y hora actual es: " + fechaHoraFormateada);//Muestra el resultado
    }
}
