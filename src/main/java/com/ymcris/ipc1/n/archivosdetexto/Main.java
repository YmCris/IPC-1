package com.ymcris.ipc1.n.archivosdetexto;

/**
 *
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Main {

    public static void main(String[] args) {
        ClaseFile archivo = new ClaseFile();
        archivo.crearArchivoDeTextoConRutaRelativa();
        ArchivoDeTexto archivos = new ArchivoDeTexto();
        archivos.escribirEnArchivo();
        archivos.leerArchivoDeTexto();
    }
}
