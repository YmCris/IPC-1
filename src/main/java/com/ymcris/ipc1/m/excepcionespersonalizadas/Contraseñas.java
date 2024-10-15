package com.ymcris.ipc1.m.excepcionespersonalizadas;

import java.util.Scanner;

/**
 * Creación de exepciones personalizadas
 *
 * @author YmCris
 */
public class Contraseñas {

    Scanner scanner = new Scanner(System.in);
    Verificacion v = new Verificacion();

    private String usuario;
    private String contraseña;
    private String contraseñaVerificada;

    public static void main(String[] args) {
        Contraseñas contraseña = new Contraseñas();
        contraseña.pedirContraseñas();
    }

    /**
     * Método encargado de pedir los datos al usuario.
     */
    private void pedirContraseñas() {
        System.out.println("Ingrese el nombre del usuario");
        usuario = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        contraseña = scanner.nextLine();
        System.out.println("Ingrese de nuevo la contraseña");
        contraseñaVerificada = scanner.nextLine();
        comprobarConstraseñas(contraseña, contraseñaVerificada);
    }

    /**
     * Método encargado de intentar probar si ambas contraseñas coinciden
     *
     * @param contraseña1 contraseña inicial
     * @param constraseña2 constraseña verificada
     */
    private void comprobarConstraseñas(String contraseña1, String contraseña2) {
        try {
            v.varlidarContraseña(contraseña1, contraseña2);
            System.out.println("El usuario: " + usuario);
            System.out.println("Tiene la constraseña " + contraseña + " y: " + contraseñaVerificada);
        } catch (ContraseñaInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
