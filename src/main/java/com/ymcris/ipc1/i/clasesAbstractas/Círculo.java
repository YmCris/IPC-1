package com.ymcris.ipc1.i.clasesAbstractas;

/**
 *
 * @author crist
 */
public class Círculo extends Figura {

    private double radio;

    /**
     *
     * @param radio
     * @param x
     * @param y
     */
    public Círculo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

}
