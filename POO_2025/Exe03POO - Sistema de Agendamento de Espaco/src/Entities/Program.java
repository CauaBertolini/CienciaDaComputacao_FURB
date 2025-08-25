package Entities;

import Enums.EnumSetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public void Executar(Scanner scanner) {

        String[] opcoesMenu = {"Reservar sala", "Cadastrar Colaborador", "Cadastrar Sala", "Sair"};
        boolean executar = true;

        do {
            mostrarMenu("Reserva de Salas", opcoesMenu);
            System.out.print("Sua escolha: ");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    reservarSala(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    executar = false;
                    break;
            }

        } while(executar);



    }

    public void reservarSala(Scanner scanner) {
        // Definindo cargos
        Cargo cargo1 = new Cargo("Tech Lead", 001);
        Cargo cargo2 = new Cargo("Desenvolvedor Júnior", 002);
        Cargo cargo3 = new Cargo("Desenvolvedor Pleno", 003);
        ArrayList<Cargo> cargos = new ArrayList<>();
        cargos.add(cargo1);
        cargos.add(cargo2);
        cargos.add(cargo3);


        // Definindo colaboradores
        Colaborador colaborador1 = new Colaborador("Jonas", cargo1, EnumSetor.Desenvolvimento);
        Colaborador colaborador2 = new Colaborador("Patrícia", cargo2, EnumSetor.Diretoria);
        Colaborador colaborador3 = new Colaborador("Rafael", cargo3, EnumSetor.RH);
        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        colaboradores.add(colaborador1);
        colaboradores.add(colaborador2);
        colaboradores.add(colaborador3);

        // Definindo meses de reserva
        ReservasMes listaDeReservas = new ReservasMes();

        //Definindo salas
        ArrayList<Sala> salas = new ArrayList<>();
        Sala salaA = new Sala("Sala A", 10, 1);
        Sala salaB = new Sala("Sala B", 5, 2);
        salas.add(salaA);
        salas.add(salaB);

        boolean reservaValida = false;
        String dataReuniao;
        String horaComeco;
        String horaFim;

        while (!reservaValida) {
            System.out.println("Informe a data da reserva com o padrão MM-dd: ");
            dataReuniao = scanner.next();

            System.out.println("Informe a hora de começo da reserva HH: ");
            horaComeco = scanner.next();

            System.out.println("Informe a hora de finalização da reserva HH: ");
            horaFim = scanner.next();

            String dataComeco = dataReuniao + "-2025 " + horaComeco;
            String dataFim = dataReuniao + "-2025 " + horaFim;

            mostrarMenu("Escolha a sala", salas);
            System.out.println("Selecione: ");
            int salaId = scanner.nextInt();

            Reserva novaReserva = new Reserva(dataComeco, dataFim, salas.get(salaId));
            boolean reservou = listaDeReservas.reservar(novaReserva);
            if (reservou) {
                System.out.println("Reserva realizada com sucesso!");
                reservaValida = true;
            } else {
                System.out.println("Não foi possível reservar nesta sala para este horário.");
            }
        }
    }

    public void mostrarMenu(String tituloMenu, List<String> opcoesMenu) {
        int contador = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (String op : opcoesMenu) {
            contador++;
            System.out.printf("[ %d ] %s", contador, op);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void mostrarMenu(String tituloMenu, String opcoesMenu[]) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < opcoesMenu.length; i++) {
            System.out.printf("[ %d ] %s", i+1, opcoesMenu[i]);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mostrarMenu(String tituloMenu, ArrayList<Sala> opcoesMenu) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (Sala sa : opcoesMenu) {
            System.out.printf("[ %d ] %s", sa.getCodigo(), sa.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
