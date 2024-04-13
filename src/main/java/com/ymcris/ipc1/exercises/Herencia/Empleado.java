package com.ymcris.ipc1.exercises.Herencia;



public class Empleado extends Persona {
    
    String nombre_empleado;
    int num_empleado;

    public Empleado() {
    }

    public Empleado(String nombre_empleado, int num_empleado, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_empleado = nombre_empleado;
        this.num_empleado = num_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    
    
}