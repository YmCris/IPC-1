package com.ymcris.ipc1.o.archivosbinarios;

/**
 *
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        ArchivosBinarios binario = new ArchivosBinarios();
        binario.crearBinario();
        binario.añadirBinario();
        binario.leerBinario();
    }
    
}
