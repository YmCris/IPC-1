package com.ymcris.ipc1.exercises.ImplementacionesInterfacesGraficas;

/**
 *
 * @author crist
 */
public class Puntuaje {
    //private static int puntuajeJugadorA=0;
    //private static int puntuajeJugadorB=0;

    /**
     *
     */
    public static int[] puntuajeTotalJugadorA= new int[1];

    /**
     *
     */
    public static int[] puntuajeTotalJugadorB= new int[1];
    
    /**
     *
     * @param añadirPuntosA
     */
    public void añadirPuntosA(int añadirPuntosA){
        puntuajeTotalJugadorA[0]+= añadirPuntosA;
    }
            
    /**
     *
     * @return
     */
    public static int obtenerPuntuajeTotalA(){
        return puntuajeTotalJugadorA[0];
    }
        
    /**
     *
     * @param añadirPuntosB
     */
    public void añadirPuntosB(int añadirPuntosB){
        puntuajeTotalJugadorB[0]+= añadirPuntosB;
    }
    
    /**
     *
     * @return
     */
    public static int obtenerPuntuajeTotalB(){
        return puntuajeTotalJugadorB[0];
    }    
}

/*
            ClaseMotorDelJuego ganar = new ClaseMotorDelJuego();
            ganar.agregarOro(3);
*/
