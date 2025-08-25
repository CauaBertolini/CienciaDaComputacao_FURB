package Entities;

import Enums.EnumCargo;
import Enums.EnumSetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private ArrayList<Sala> salas = new ArrayList<>();
    private ReservasMes listaDeReservas = new ReservasMes();

    public void Executar(Scanner scanner) {

        Colaborador colaborador1 = new Colaborador("Jonas", EnumCargo.Gerente, EnumSetor.Desenvolvimento, 100);
        Colaborador colaborador2 = new Colaborador("Patrícia", EnumCargo.Desenvolvedor, EnumSetor.Diretoria, 101);
        Colaborador colaborador3 = new Colaborador("Rafael", EnumCargo.Analista, EnumSetor.RH, 102);
        colaboradores.add(colaborador1);
        colaboradores.add(colaborador2);
        colaboradores.add(colaborador3);

        Sala salaA = new Sala("Sala A", 10, 1);
        Sala salaB = new Sala("Sala B", 5, 2);
        Sala salaC = new Sala("Sala C", 20, 3);
        salas.add(salaA);
        salas.add(salaB);
        salas.add(salaC);

        String[] opcoesMenu_principal = { "Reservar sala", "Lista de reservas", "Cadastrar colaborador",
                "Cadastrar sala", "Sair" };
        boolean executar = true;

        do {
            mostrarMenu("Reserva de Salas", opcoesMenu_principal);
            System.out.print("Sua escolha: ");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    reservarSala(scanner);
                    break;
                case 2:
                    exibirListaDeReservas();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    executar = false;
                    break;
            }

        } while (executar);

    }

    public void reservarSala(Scanner scanner) {
        boolean reservaValida = false;
        boolean cancelar = false;

        ArrayList<Colaborador> participantes = new ArrayList<>();

        mostrarTitulo("RESERVANDO - ESCOLHA OS PARTICIPANTES");
        
        participantes = selecionarParticipantes("Selecione os colaboradores para a reunião", participantes, scanner);

        while (!reservaValida && !cancelar) {

            String[] opcoesMenu_reservarSala = { "Alterar Lista de Participantes", "Reservar Sala", "Cancelar" };

            mostrarMenu("Selecione ação", opcoesMenu_reservarSala);
            int opc = scanner.nextInt();

            switch (opc) {

                case 1:
                    mostrarTitulo("RESERVANDO - ALTERANDO OS PARTICIPANTES");
                    participantes = alterarListaDeParticipantes(scanner, participantes);
                    break;

                case 2:
                    mostrarTitulo("RESERVANDO - CADASTRANDO A RESERVA");
                    reservaValida = cadastrarReserva(scanner);
                    break;

                case 3:
                    cancelar = true;
                    break;

                default:
                    break;
            }

        }
    }

    private boolean cadastrarReserva(Scanner scanner) {
        boolean reservou = false;

        String dataReuniao;
        String horaComeco;
        String horaFim;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a data da reserva com o padrão MM-dd: ");
        dataReuniao = scanner.next();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a hora de começo da reserva HH: ");
        horaComeco = scanner.next();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a hora de finalização da reserva HH: ");
        horaFim = scanner.next();

        String dataComeco = dataReuniao + "-2025 " + horaComeco;
        String dataFim = dataReuniao + "-2025 " + horaFim;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        mostrarListaSalas("Escolha a sala", salas);
        System.out.println("Selecione: ");
        int salaId = scanner.nextInt();

        Reserva novaReserva = new Reserva(dataComeco, dataFim, salas.get(salaId));
        reservou = listaDeReservas.reservar(novaReserva);

        if (reservou) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Reserva realizada com sucesso!");
            return reservou;

        } else {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Não foi possível reservar nesta sala para este horário.");
        }
        return reservou;
    }

    public ArrayList<Colaborador> alterarListaDeParticipantes(Scanner scanner, ArrayList<Colaborador> participantes) {
        boolean alterar = true;
        String[] opcoesMenu_alterarListaDeParticipantes = { "Adicionar Colaborador", "Remover Colaborador", "Voltar" };

        while (alterar) {

            mostrarMenu("Que ação deseja fazer?", opcoesMenu_alterarListaDeParticipantes);
            int opc = scanner.nextInt();
            switch (opc) {

                case 1:
                    mostrarTitulo("ALTERANDO - ADICIONANDO PARTICIPANTES");

                    participantes = selecionarParticipantes("Selecione os colaboradores para a reunião", participantes,
                            scanner);
                    break;

                case 2:
                    mostrarTitulo("ALTERANDO - REMOVENDO PARTICIPANTES");

                    mostrarListaParticipantes("Participantes atuais", participantes);
                    System.out.println("Informe o código do colaborador que deseja remover: ");
                    int codigoFuncionario = scanner.nextInt();
                    if (verificarColaboradorPorId(codigoFuncionario)) {
                        participantes.remove(getColaboradorPorId(codigoFuncionario));
                    } else {
                        System.out.println("Colaborador não encontrado.");
                    }
                    break;

                case 3:
                    alterar = false;
                    break;

                default:
                    break;
            }
        }
        return participantes;
    }

    public ArrayList<Colaborador> selecionarParticipantes(String tituloMenu, ArrayList<Colaborador> participantes, Scanner scanner) {

        boolean selecionando = true;

        while (selecionando) {
            mostrarListaColaboradores(tituloMenu, colaboradores);
            System.out.print("Informe o código para adicionar o colaborador á lista de reunião (0 para cancelar): ");
            int codigoFuncionario = scanner.nextInt();

            if (codigoFuncionario == 0) {
                selecionando = false;
                break;
            }

            if (verificarColaboradorPorId(codigoFuncionario)) {
                if (participantes.contains(getColaboradorPorId(codigoFuncionario)) == false) {
                    participantes.add(getColaboradorPorId(codigoFuncionario));
                } else {
                    System.out.println("Colaborador já adicionado.");
                }
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Deseja adicionar mais participantes? (S/N): ");
            String opc = scanner.next();
            if (opc.equalsIgnoreCase("N")) {
                selecionando = false;
            }
        }
        return participantes;
    }

    public boolean verificarColaboradorPorId(int codigo) {
        for (Colaborador c : colaboradores) {
            if (c.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public Colaborador getColaboradorPorId(int codigo) {
        for (Colaborador c : colaboradores) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }

    public void exibirListaDeReservas() {
        if (listaDeReservas.getListaDeReservasDoMes().size() > 0) {
            for (Reserva r : listaDeReservas.getListaDeReservasDoMes()) {
                System.out.println(r.getDataHoraInicio() + " - " + r.getDataHoraFim() + " | " + r.getSalaReserva());
            }
        } else {
            System.out.println("Nenhuma reserva realizada até o momento.");
        }
    }

    public void mostrarListaSalas(String tituloMenu, ArrayList<Sala> salas) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Sala sa : salas) {
            System.out.printf("[ %d ] %s", sa.getCodigo(), sa.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mostrarListaParticipantes(String tituloMenu, ArrayList<Colaborador> participantes) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Colaborador pa : participantes) {
            System.out.printf("[ %d ] %s", pa.getCodigo(), pa.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void mostrarListaColaboradores(String tituloMenu, ArrayList<Colaborador> colaboradores) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Colaborador co : colaboradores) {
            System.out.printf("[ %d ] %s", co.getCodigo(), co.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void mostrarMenu(String tituloMenu, String opcoesMenu[]) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < opcoesMenu.length; i++) {
            System.out.printf("[ %d ] %s", i + 1, opcoesMenu[i]);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void mostrarMenu(String tituloMenu, ArrayList<Sala> opcoesMenu) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (Sala sa : opcoesMenu) {
            System.out.printf("[ %d ] %s - $d lugares", sa.getCodigo(), sa.getNome(), sa.getQntLugares());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mostrarTitulo(String titulo) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(titulo);
    }

}
