package com.ymcris.ipc1.n.archivosdetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FILE WRITER Nos permite escribir en un archivo de texto con el writer y close
 * FILE READER Nos permite crear un objeto para usarlo con el buffered reader
 * BUFFERED READER Fifo permite ser una memoria temporal para leer el archivo de
 * manera temporal, durante la compilacion
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class ArchivoDeTexto {

    protected void escribirEnArchivo() {
        try {
            FileWriter escribir = new FileWriter("Archivo De prueba.txt", true);//TRUE para que no se reescriba todo
            escribir.write("PEPERENGUE");
            escribir.write("\nDICE HOLA MUNDO");
            escribir.close();//si o si debe ponerse
            System.out.println("Texto Añadido");
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    protected void leerArchivoDeTexto() {
        try {
            FileReader lector = new FileReader("Archivo De prueba.txt");
            BufferedReader lectura = new BufferedReader(lector);
            String contenido = lectura.readLine();
            while (contenido != null) {
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
