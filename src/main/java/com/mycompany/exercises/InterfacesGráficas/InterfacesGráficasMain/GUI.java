package com.mycompany.exercises.InterfacesGráficas.InterfacesGráficasMain;
import com.mycompany.exercises.InterfacesGráficas.Pantalla;


public class GUI {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
