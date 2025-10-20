package Model;

import Exception.MenorIgualAZeroException;
import Exception.Util;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) throws MenorIgualAZeroException {
        setRaio(raio);
    }

    @Override
    public double getArea() {
        double area = Math.pow((Math.PI*raio), 2);
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws MenorIgualAZeroException {
        if (Util.campoMenorIgualAZero(raio)) {
            this.raio = raio;
        }

    }
}
