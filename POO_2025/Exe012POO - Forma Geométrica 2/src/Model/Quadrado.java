package Model;

import Exception.MenorIgualAZeroException;
import Exception.Util;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) throws MenorIgualAZeroException {
        setLado(lado);
    }

    @Override
    public double getArea() {
        double area =  getLado() * getLado();
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro =  getLado() * 4;
        return perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws MenorIgualAZeroException {
        if (Util.campoMenorIgualAZero(lado)) {
            this.lado = lado;
        }
    }

}
