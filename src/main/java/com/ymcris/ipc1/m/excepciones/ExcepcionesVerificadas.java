package com.ymcris.ipc1.m.excepciones;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Clase para probar las excepciones verificadas (IO Exception )
 *
 * @author YmCris
 */
public class ExcepcionesVerificadas {

    public static void main(String[] args) {
        ExcepcionesVerificadas ex = new ExcepcionesVerificadas();
        ex.llamarExepcion();
    }

    /**
     * Método que throws un IOExcepcion
     *
     * @throws FileNotFoundException
     */
    private void excepcionVerificada() {
        //La excepcion la podemos capturar con un try catch o con un throws
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\crist\\OneDrive\\4. University\\D Fourth Semester\\Others\\Texto.txt"));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tilin, eso no se hace");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "NOOOO Tilin");
        } finally {
            System.out.println("Has hecho las cosas mal tilin, no esperaba eso de tí");
        }

        System.out.println("Programa terminado");
    }

    private void llamarExepcion() {
        excepcionVerificada();
    }

}
