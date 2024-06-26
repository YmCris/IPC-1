package com.ymcris.ipc1.g.constructores;

/**
 *
 * @author crist
 */
public class Alumno {

    int id;
    String nombre;
    String apellido;

    /**
     *
     */
    public Alumno() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     */
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     *
     * @return usuario que regresa un hola mundo
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     */
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y este es mi nombre");
    }

}
