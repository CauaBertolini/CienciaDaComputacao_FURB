package View;

import Model.*;
import Enum.*;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Pessoa> users = new ArrayList<>();

        Veiculo v1 = new Veiculo("Hilux", EnumMarcaCarro.Toyota);
        Veiculo v2 = new Veiculo("Civic", EnumMarcaCarro.Honda);

        Passageiro p1 = new Passageiro("Jonas", "4123123", EnumFormaPagamento.PIX);
        Passageiro p2 = new Passageiro("Laura", "213124123", EnumFormaPagamento.Debito);

        users.add(p1);
        users.add(p2);

        Motorista m1 = new Motorista("Ivi", "MSE21312", v1);
        Motorista m2 = new Motorista("Juao", "masdw222", v2);

        users.add(m1);
        users.add(m2);


        Viagem viagem = new Viagem(p1, m1, "Teatro Carlos Gomes", "FURB");
        p1.incluirViagem(viagem);

    }
}
