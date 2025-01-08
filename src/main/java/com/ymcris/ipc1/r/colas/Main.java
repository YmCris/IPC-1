package com.ymcris.ipc1.r.colas;

import javax.swing.JOptionPane;

/**
 *
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        Object nodoInformacion = 0;
        Colas cola = new Colas();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la Cola\n"
                        + "4. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodoInformacion = JOptionPane.showInputDialog(null, "Porfavor ingresa el valor a guardar en el nodo.");
                        cola.insertar(nodoInformacion);
                        break;
                    case 2:
                        if (!cola.colaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.extraer());
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacía");
                        }
                        break;
                    case 3:
                        cola.mostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                        break;
                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);
    }
}
