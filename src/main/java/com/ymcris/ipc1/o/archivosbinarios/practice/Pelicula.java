package com.ymcris.ipc1.o.archivosbinarios.practice;

/**
 *
 *
 * @Date Oct 16, 2024
 * @author YmCris
 */
public class Pelicula {

    //Atributos
    private String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula: " + nombre + "\n";
    }

}
