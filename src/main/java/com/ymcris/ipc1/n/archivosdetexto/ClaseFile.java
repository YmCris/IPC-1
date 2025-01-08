package com.ymcris.ipc1.n.archivosdetexto;

import java.io.File;
import java.io.IOException;

/**
 * USO DE LA CLASE FILE. Clase encargada de crear archivos de texto. (Tambien
 * conocidos como ficheros)
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class ClaseFile {

    //CLASE FILE --- Permite crear, eliminarlos, etc.
    File archivoRelativo = new File("Archivo De prueba.txt");//Ruta relativa (solo el nombre del archivo)
    File archivoAbsoluto = new File("C:\\Users\\crist\\OneDrive\\1. A little bit of\\3. PROGRAMMING\\1. Java\\IPC-1\\IPC-1\\Archivos\\Prueba.txt");//Ruta relativa (solo el nombre del archivo)
    File directorio = new File("directorio");//Ruta relativa (solo el nombre del archivo)

    public void crearArchivoDeTextoConRutaRelativa() {
        try {
            if (archivoRelativo.createNewFile()) {
                System.out.println("El archivo ha sido creado exitosamente");
            } else if (archivoRelativo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                System.out.println("El archivo no se ha podido crear");
            }
        } catch (IOException e) {
            System.out.println("El archivo no se ha podido crear");
        }
    }

    public void crearArchivoDeTextoConRutaAbsoluta() {
        try {
            if (archivoAbsoluto.createNewFile()) {
                System.out.println("El archivo ha sido creado exitosamente");
            } else if (archivoAbsoluto.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                System.out.println("El archivo no se ha podido crear");
            }
        } catch (IOException e) {
            System.out.println("El archivo no se ha podido crear");
        }
    }

    public void crearDirectorio() {
        if (directorio.mkdir()) {//Crea una carpeta
            System.out.println("El directorio ha sido creado exitosamente");
        } else if (directorio.exists()) {
            System.out.println("El directorio ya existe");
        } else {
            System.out.println("El directorio no se ha podido crear");
        }
    }

    public void eliminarArchivo() {
        File archivo = new File("C:\\Users\\crist\\OneDrive\\1. A little bit of\\3. PROGRAMMING\\1. Java\\IPC-1\\IPC-1\\Archivos\\Prueba.txt");//Ruta relativa (solo el nombre del archivo)
        if (archivo.delete()) {
            System.out.println("El archivo ha sido borrado exitosamente");
        } else {
            System.out.println("El archivo no se ha podido borrar");
        }
    }

    public void obtenerInformacionArchivo() {
        System.out.println("El nombre del archivo es: " + archivoRelativo.getName());
        System.out.println("El path relativo es: " + archivoRelativo.getPath());
        System.out.println("El path absoluto es: " + archivoRelativo.getAbsolutePath());
        System.out.println("Existe el archivo: " + archivoRelativo.exists());
        System.out.println("Se puede esxribir el archivo: " + archivoRelativo.canWrite());
        System.out.println("Se puede leer el archivo: " + archivoRelativo.canRead());
        System.out.println("Es un archivo: " + directorio.isFile());
        System.out.println("Longitud:" + archivoRelativo.length());
    }

}
