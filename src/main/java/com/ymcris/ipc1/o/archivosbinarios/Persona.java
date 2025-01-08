package com.ymcris.ipc1.o.archivosbinarios;

import java.io.Serializable;

/**
 * SERIALIZABLE, permite guardar el objeto en archivos binarios, la convierte en
 * flujo de bytes.
 *
 * @Date Oct 16, 2024
 * @author YmCris
 */
public class Persona implements Serializable {

    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
