package com.ymcris.ipc1.c.herencia;

/**
 *
 * @author crist
 */
public class Jefe extends Persona {

    int id_jefe;
    String departamento_jefe;

    /**
     *
     */
    public Jefe() {
    }

    /**
     *
     * @param id_jefe
     * @param departamento_jefe
     */
    public Jefe(int id_jefe, String departamento_jefe) {
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    /**
     *
     * @param id_jefe
     * @param departamento_jefe
     * @param id
     * @param dni
     * @param nombre
     * @param apellido
     * @param domicilio
     * @param telefono
     */
    public Jefe(int id_jefe, String departamento_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    /**
     *
     * @return
     */
    public int getId_jefe() {
        return id_jefe;
    }

    /**
     *
     * @param id_jefe
     */
    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    /**
     *
     * @return
     */
    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    /**
     *
     * @param departamento_jefe
     */
    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

}
