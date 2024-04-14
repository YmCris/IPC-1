package com.ymcris.ipc1.exercises.A.herencia;

/**
 *
 * @author crist
 */
public class Empleado extends Persona {

    String nombre_empleado;
    int num_empleado;

    /**
     *
     */
    public Empleado() {
    }

    /**
     *
     * @param nombre_empleado
     * @param num_empleado
     * @param id
     * @param dni
     * @param nombre
     * @param apellido
     * @param domicilio
     * @param telefono
     */
    public Empleado(String nombre_empleado, int num_empleado, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_empleado = nombre_empleado;
        this.num_empleado = num_empleado;
    }

    /**
     *
     * @return
     */
    public String getNombre_empleado() {
        return nombre_empleado;
    }

    /**
     *
     * @param nombre_empleado
     */
    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    /**
     *
     * @return
     */
    public int getNum_empleado() {
        return num_empleado;
    }

    /**
     *
     * @param num_empleado
     */
    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

}
