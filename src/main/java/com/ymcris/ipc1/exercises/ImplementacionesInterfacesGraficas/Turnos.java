package com.ymcris.ipc1.exercises.ImplementacionesInterfacesGraficas;

/**
 *
 * @author crist
 */
public class Turnos {    

    /**
     *
     */
    public static int[] turnosJugadorA= new int[1];

    /**
     *
     */
    public static int[] turnosJugadorB= new int[1];
        
    /**
     *
     * @param añadirTurnosA
     */
    public void añadirTurnosA(int añadirTurnosA){
        turnosJugadorA[0]+= añadirTurnosA;
    }
    
    /**
     *
     * @param añadirTurnosB
     */
    public void añadirTurnosB(int añadirTurnosB){
        turnosJugadorB[0]+= añadirTurnosB;
    }
}