package com.ymcris.ipc1.m.excepciones;

/**
 * Clase para probar las excepciones no verificadas (RunTimeException)
 *
 * @author YmCris
 */
public class ExcepcionesNoVerificadas {

    int numero1 = 5;
    int numero2 = 0;
    int resultado;

    public static void main(String[] args) {
        ExcepcionesNoVerificadas ex = new ExcepcionesNoVerificadas();
        ex.excepcionNoVerificada();
    }

    /**
     * Verifica una excepcion no verificada
     */
    private void excepcionNoVerificada() {
        resultado = numero1 / numero2;
        System.out.println(resultado);
    }
}
