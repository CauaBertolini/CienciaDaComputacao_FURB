package Entities;

import Enums.EnumSetor;

import java.util.Scanner;

public class Program {
    public void Executar(Scanner scanner) {
        Cargo cargo1 = new Cargo("Tech Lead", 001);
        Cargo cargo2 = new Cargo("Desenvolvedor Júnior", 002);
        Cargo cargo3 = new Cargo("Desenvolvedor Pleno", 003);

        Colaborador colaborador1 = new Colaborador("Jonas", cargo1, EnumSetor.Desenvolvimento);
        Colaborador colaborador2 = new Colaborador("Patrícia", cargo2, EnumSetor.Diretoria);
        Colaborador colaborador3 = new Colaborador("Rafael", cargo3, EnumSetor.RH);


        Sala salaA = new Sala("Sala A", 10);
        Sala salaB = new Sala("Sala B", 5);

        ReservasMes janeiro = new ReservasMes();
        ReservasMes fevereiro = new ReservasMes();
        ReservasMes marco = new ReservasMes();

        boolean reservaValida = false;
        String dataReuniao;
        String horaComeco;
        String horaFim;
        while (!reservaValida) {
            System.out.println("Informe a data da reserva com o padrão dd-MM-yyyy: ");
            dataReuniao = scanner.nextLine();

            System.out.println("Informe a hora de começo da reserva HH: ");
            horaComeco = scanner.nextLine();

            System.out.println("Informe a hora de finalização da reserva HH: ");
            horaFim = scanner.nextLine();

            String dataComeco = dataReuniao + " " + horaComeco;
            String dataFim = dataReuniao + " " + horaFim;

            Reserva reserva1 = new Reserva(dataComeco, dataFim, salaA);
        }



    }
}
