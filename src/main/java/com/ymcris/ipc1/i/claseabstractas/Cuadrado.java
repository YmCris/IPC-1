package com.ymcris.ipc1.i.claseabstractas;

/**
 *
 * @author crist
 */
public class Cuadrado extends Figura {

    private double lado;

    /**
     *
     */
    public Cuadrado() {
    }

    /**
     *
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     *
     * @return
     */
    public double getLado() {
        return lado;
    }

    /**
     *
     * @param lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

}
