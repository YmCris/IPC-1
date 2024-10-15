/**
 * Sistema de Gestión de Biblioteca:
 * Desarrolle un programa que permita gestionar los libros en una biblioteca, el programa debe permitir:
 * 1. Agregar un nuevo libro a la biblioteca.
 * 2. Buscar un libro utilizando un identificador único.
 * 3. Prestar un libro si está disponible.
 * 4. Devolver un libro prestado.
 * 5. Mostrar la lista de libros disponibles.
 * 6. Mostrar la lista de libros prestados.
 * 7. Salir del programa.
 *
 * - El sistema debe gestionar la colección de libros y mantener un registro de cuáles están disponibles y cuáles han sido prestados.
 * - Cuando se intente prestar un libro que ya está prestado el programa debe notificarlo.
 * - El programa debe permitir devolver un libro prestado y actualizar su estado en el sistema.
 * - Inmplementa un menú interactivo.
 */
package com.ymcris.ipc1.z.ejercicios1;

/**
 *
 * @author YmCris
 */
public class GestionDeLibros {

    String librosPrestados[] = new String[10];
    String[] librosDisponiblesPredeterminados = {"Principito", "Stewart", "Leithodot", "Diario de Anna Frank", "Codigo penal", "Harry potter", "Historia", "El señor de los anillos", "Don Quijote", "Antes de diciembre"};
    int[] ISBNPredeterminados = {34525, 13865, 84571, 25964, 23451, 58792, 47965, 35468, 85134, 97586};
    boolean disponible;

    public GestionDeLibros() {
        this.librosDisponiblesPredeterminados = librosDisponiblesPredeterminados;
        this.ISBNPredeterminados = ISBNPredeterminados;
    }

    private void buscarLibro() {

    }

    private void prestarLibros() {

    }

    private void devolverLibros() {

    }

    private void verificarLibroDisponible() {

    }

    private void mostrarLibrosDisponibles() {

    }

    private void mostrarLibrosPrestados() {

    }

    //
    public String[] getLibrosPrestados() {
        return librosPrestados;
    }

    public String[] getLibrosDisponiblesPredeterminados() {
        return librosDisponiblesPredeterminados;
    }

    public int[] getISBNPredeterminados() {
        return ISBNPredeterminados;
    }

    public boolean isDisponible() {
        return disponible;
    }

}
