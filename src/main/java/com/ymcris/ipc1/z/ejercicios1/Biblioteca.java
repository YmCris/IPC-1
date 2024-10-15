package com.ymcris.ipc1.z.ejercicios1;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author crist
 */
public class Biblioteca {

    Scanner scanner = new Scanner(System.in);
    GestionDeLibros libros = new GestionDeLibros();

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.menu();
    }

    private void menu() {
        int opcion;
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Agregar un nuevo libro");
        System.out.println("2. Buscar un libro y prestarlo.");
        System.out.println("3. Devolver un libro prestado.");
        System.out.println("4. Mostrar la lista de libros disponibles.");
        System.out.println("5. Mostrar la lista de libros prestados.");
        System.out.println("6. Salir del programa.");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }

    private void mostrarLibrosDisponibles() {
        for (int ISBN : libros.getISBNPredeterminados()) {
            System.out.println(ISBN);
        }
        System.out.println("");
        for (String libros : libros.getLibrosDisponiblesPredeterminados()) {
            System.out.println(libros);
        }
    }

    private void mostrarLibrosPredeterminados() {

    }
    
    protected void agregarLibros(String nombre, int ISBN) {
        System.out.println("Ingrese el nombre del libro:");
        String libro = scanner.nextLine();
        System.out.println("Ingrese el ISBN:");
    }

}
