package com.ymcris.ipc1.exercises.A.herencia;

/**
 *
 * @author crist
 */
public class Consultor extends Persona {

    int num_legajo;
    String cargo;
    double sueldo;

    /**
     *
     */
    public Consultor() {
    }

    /**
     *
     * @param num_legajo
     * @param cargo
     * @param sueldo
     * @param id
     * @param dni
     * @param nombre
     * @param apellido
     * @param domicilio
     * @param telefono
     */
    public Consultor(int num_legajo, String cargo, double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     *
     * @return
     */
    public int getNum_legajo() {
        return num_legajo;
    }

    /**
     *
     * @param num_legajo
     */
    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    /**
     *
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     *
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     *
     */
    public void nombredelkbron() {
        Consultor miConsultor = new Consultor();
        miConsultor.setNombre("Hola soy moi");
    }

}
