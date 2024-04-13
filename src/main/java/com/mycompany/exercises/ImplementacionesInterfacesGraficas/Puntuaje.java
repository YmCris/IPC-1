package com.mycompany.exercises.ImplementacionesInterfacesGraficas;



public class Puntuaje {
    //private static int puntuajeJugadorA=0;
    //private static int puntuajeJugadorB=0;
    public static int[] puntuajeTotalJugadorA= new int[1];
    public static int[] puntuajeTotalJugadorB= new int[1];
    
    public void añadirPuntosA(int añadirPuntosA){
        puntuajeTotalJugadorA[0]+= añadirPuntosA;
    }
            
    public static int obtenerPuntuajeTotalA(){
        return puntuajeTotalJugadorA[0];
    }
        
    public void añadirPuntosB(int añadirPuntosB){
        puntuajeTotalJugadorB[0]+= añadirPuntosB;
    }
    
    public static int obtenerPuntuajeTotalB(){
        return puntuajeTotalJugadorB[0];
    }    
}

/*
            ClaseMotorDelJuego ganar = new ClaseMotorDelJuego();
            ganar.agregarOro(3);
*/
