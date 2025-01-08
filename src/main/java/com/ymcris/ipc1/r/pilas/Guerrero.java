package com.ymcris.ipc1.r.pilas;

/**
 *
 *
 * @Date Oct 15, 2024
 * @author YmCris
 */
public class Guerrero {

    private int cantidad;
    private String nombre;

    public Guerrero(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public Guerrero() {
        this.cantidad = 10;
        this.nombre = "Juanes";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
