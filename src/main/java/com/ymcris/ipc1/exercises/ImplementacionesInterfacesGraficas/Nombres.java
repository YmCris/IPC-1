package com.ymcris.ipc1.exercises.ImplementacionesInterfacesGraficas;

/**
 *
 * @author crist
 */
public class Nombres {
    private String nombreJugadorA;
    private String nombreJugadorB;

    /**
     *
     * @param nombreJugadorA
     * @param nombreJugadorB
     */
    public Nombres(String nombreJugadorA, String nombreJugadorB) {
        this.nombreJugadorA = nombreJugadorA;
        this.nombreJugadorB = nombreJugadorB;
    }

    /**
     *
     * @return
     */
    public String getNombreJugadorA() {
        return nombreJugadorA;
    }

    /**
     *
     * @param nombreJugadorA
     */
    public void setNombreJugadorA(String nombreJugadorA) {
        this.nombreJugadorA = nombreJugadorA;
    }

    /**
     *
     * @return
     */
    public String getNombreJugadorB() {
        return nombreJugadorB;
    }

    /**
     *
     * @param nombreJugadorB
     */
    public void setNombreJugadorB(String nombreJugadorB) {
        this.nombreJugadorB = nombreJugadorB;
    }
    
}