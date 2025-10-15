package Model;

import Exception.MenorIgualAZeroException;
import Exception.Util;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;


    public Triangulo(double base, double lado1, double lado2, double altura) throws MenorIgualAZeroException {
        setBase(base);
        setLado1(lado1);
        setLado2(lado2);
        setAltura(altura);
    }

    @Override
    public double getArea() {
        double area =  getBase() * getAltura();
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro =  getLado1() + getLado2() + getBase();
        return perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws MenorIgualAZeroException {
        if (Util.campoMenorIgualAZero(base)) {
            this.base = base;
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (Util.campoMenorIgualAZero(lado1)) {
            this.lado1 = lado1;
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws MenorIgualAZeroException {
        if (Util.campoMenorIgualAZero(lado2)) {
            this.lado2 = lado2;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws MenorIgualAZeroException {
        if (Util.campoMenorIgualAZero(altura)) {
            this.altura = altura;
        }
    }
}
