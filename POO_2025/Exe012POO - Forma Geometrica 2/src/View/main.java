package View;

import Model.FormaGeometrica;
import Model.Quadrado;
import Model.Triangulo;

import Exception.MenorIgualAZeroException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String [] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        try {
            Quadrado q1 =  new Quadrado(4);
            Quadrado q2 = new Quadrado(3);
            Quadrado q3 = new Quadrado(2.3);
            Quadrado q4  = new Quadrado(0);

            Triangulo t1 = new Triangulo(10, 7, 8, 6);

            formas.add(q1);
            formas.add(q2);
            formas.add(q3);
            formas.add(t1);

            for (FormaGeometrica f : formas) {
                System.out.println("---------------------------------------");
                System.out.println(f.getClass().getSimpleName() + "\nÁrea: " + f.getArea() + "\nPerímetro: " + f.getPerimetro());
            }

        } catch (MenorIgualAZeroException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }
}
