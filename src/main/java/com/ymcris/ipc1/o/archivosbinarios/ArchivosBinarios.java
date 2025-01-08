package com.ymcris.ipc1.o.archivosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * FileOutputStream ....Escribe datos binarios en un archivo, permitiendo crear,
 * sobrescribir o adjuntar contenido-------------------------------------------.
 * ObjectOutputStream . Escribe objetos serializables en un archivo o flujo de
 * salida, permitiendo guardar y recuperar el estado completo de los objetos.
 *
 * FileInputStream .............................Lee el archivo binario, entrada
 * INPUT ................................................................. Leer
 * OUTPUT ..............................................................Escribir
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class ArchivosBinarios {

    private final String PATH_CARPETA = "C:\\Users\\crist\\OneDrive\\1. A little bit of\\3. PROGRAMMING\\1. Java\\IPC-1\\IPC-1\\Archivos\\Personas.bin";
    private File archivoPersonas;
    private File archivoBinario;

    public void crearBinario() {
        archivoBinario = new File(PATH_CARPETA);
        archivoPersonas = new File(PATH_CARPETA);
        try {
            archivoBinario.createNewFile();
            archivoPersonas.createNewFile();
        } catch (IOException iOException) {
        }
    }

    /**
    Escribe en binario, pero borra todo lo que ya había.
    public void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream(archivoPersonas);//true, para que no reescriba en lo que ya esta
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            escritura.writeObject(new Persona(24, "PEPERENGUES"));//Pasa el objeto al archivo
            escritura.close();
            System.out.println("Objeto añadido a binario.");
        } catch (IOException e) {

        }
    }
    */     
     
    /**
     * Lee solo lo primero que se añadio en binario
     *
     * @throws ClassNotFoundException
     */
    public void leerBinario() throws ClassNotFoundException {
        Persona persona;
        try {
            FileInputStream archivo = new FileInputStream(PATH_CARPETA);
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while (true) {
                persona = (Persona) lectura.readObject();//CASTEO PARA CONVERTIR LA LECTURA EN UN OBJETO DEL TIPO PERSONA
                persona.mostrarDatos();
                System.out.println("");
            }
        } catch (IOException ex) {

        }
    }

    /**
     * Añade constantemente al archivo binario.
     */
    public void añadirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream(archivoPersonas, true);//true, para que no reescriba en lo que ya esta
            AñadirContenido escritura = new AñadirContenido(archivo);
            escritura.writeObject(new Persona(24, "PEPERENGUES"));//Pasa el objeto al archivo
            escritura.writeObject(new Persona(15, "El juan"));//Pasa el objeto al archivo
            escritura.writeObject(new Persona(50, "Cristian"));//Pasa el objeto al archivo
            escritura.writeObject(new Persona(22, "MARTIN"));//Pasa el objeto al archivo
            escritura.writeObject(new Persona(64, "PEDRO"));//Pasa el objeto al archivo
            escritura.close();
            System.out.println("Objeto añadido a binario.");
        } catch (IOException e) {

        }
    }

}
