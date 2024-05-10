package com.ymcris.ipc1.i.clasesAbstractas;

/**
 *
 * @author crist
 */
public abstract class Figura {

    /**
     *
     */
    protected double x;

    /**
     *
     */
    protected double y;

    /**
     *
     */
    protected Figura() {
    }

    /**
     *
     * @param x
     * @param y
     */
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    public abstract double calcularArea();

}
