package com.mycompany.exercises.ImplementacionesInterfacesGraficas;



public class Turnos {    
    public static int[] turnosJugadorA= new int[1];
    public static int[] turnosJugadorB= new int[1];
        
    public void añadirTurnosA(int añadirTurnosA){
        turnosJugadorA[0]+= añadirTurnosA;
    }
    
    public void añadirTurnosB(int añadirTurnosB){
        turnosJugadorB[0]+= añadirTurnosB;
    }
}