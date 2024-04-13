package com.mycompany.exercises.ImplementacionesInterfacesGraficas;



public class Nombres {
    private String nombreJugadorA;
    private String nombreJugadorB;

    public Nombres(String nombreJugadorA, String nombreJugadorB) {
        this.nombreJugadorA = nombreJugadorA;
        this.nombreJugadorB = nombreJugadorB;
    }

    public String getNombreJugadorA() {
        return nombreJugadorA;
    }

    public void setNombreJugadorA(String nombreJugadorA) {
        this.nombreJugadorA = nombreJugadorA;
    }

    public String getNombreJugadorB() {
        return nombreJugadorB;
    }

    public void setNombreJugadorB(String nombreJugadorB) {
        this.nombreJugadorB = nombreJugadorB;
    }
    
}