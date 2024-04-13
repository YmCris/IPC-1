package com.ymcris.ipc1.exercises.InterfacesGráficas.InterfacesGráficasMain;
import com.ymcris.ipc1.exercises.IInterfacesGráficas.Pantalla;


public class GUI {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
