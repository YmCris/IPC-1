package com.ymcris.ipc1.exercises.ClasesAbstractas;



public class Círculo extends Figura{
    
    private double radio;

    public Círculo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }
    
}