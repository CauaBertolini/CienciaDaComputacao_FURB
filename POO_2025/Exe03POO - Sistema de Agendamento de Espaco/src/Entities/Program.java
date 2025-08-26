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

        String[] opcoesMenu_principal = { "Cadastrar reserva", "Cadastrar colaborador", "Lista de Reservas",
                "Lista de colaboradores",
                "Cadastrar sala - NULL", "Sair" };
        boolean executar = true;

        do {
            exibirMenu("Reserva de Salas", opcoesMenu_principal);
            System.out.print("Sua escolha: ");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    cadastrarReserva(scanner);
                    break;
                case 2:
                    cadastrarColaborador(scanner);
                    break;
                case 3:
                    exibirListaDeReservas();
                    break;
                case 4:
                    exibirListaColaboradores("Colaboradores", colaboradores);
                    break;
                case 5:

                    break;
                case 6:
                    executar = false;
                    break;
            }

        } while (executar);

    }

    public void cadastrarReserva(Scanner scanner) {
        boolean concluido = false;
        boolean cancelar = false;

        exibirTitulo("INICIANDO O CADASTRO DE RESERVA");

        Reserva novaReserva = reservarSala(scanner);

        if (novaReserva != null) {

            while (!cancelar || !concluido) {

                String[] opcoesMenu_reservarSala = { "Gerenciar lista de participantes",
                        "Exibir lista de participantes", "Realocar reunião", "Confirmar reunião", "Cancelar" };

                exibirMenu("Selecione ação", opcoesMenu_reservarSala);
                int opc = scanner.nextInt();

                switch (opc) {

                    case 1:
                        exibirTitulo("Gerenciando participantes");
                        alterarListaDeParticipantes(scanner, novaReserva);
                        break;
                    case 2:
                        exibirTitulo("Exibindo participantes");
                        exibirListaParticipantes("Participantes atuais", novaReserva.getListaParticipantes());
                        break;
                    case 3:

                        break;

                    case 4:
                        if (listaDeReservas.reservar(novaReserva)) {
                            listaDeReservas.getListaDeReservasDoMes().add(novaReserva);
                            System.out.println("Reserva confirmada com sucesso!");
                            concluido = true;
                        } else {
                            System.out.println("Não foi possível confirmar a reserva, conflito de horários.");
                        }
                        break;

                    case 5:
                        cancelar = true;
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("Reserva cancelada.");
        }

    }

    private Reserva reservarSala(Scanner scanner) {

        String dataReuniao;
        String horaComeco;
        String horaFim;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a data da reserva com o padrão dd-MM: (0 para cancelar) ");
        dataReuniao = scanner.next();

        if (dataReuniao.equals("0")) {
            return null;
        }
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a hora de começo da reserva HH: (0 para cancelar) ");
        horaComeco = scanner.next();

        if (horaComeco.equals("0")) {
            return null;
        }
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Informe a hora de finalização da reserva HH: (0 para cancelar) ");
        horaFim = scanner.next();

        if (horaFim.equals("0")) {
            return null;
        }

        String dataComeco = dataReuniao + "-2025 " + horaComeco;
        String dataFim = dataReuniao + "-2025 " + horaFim;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        exibirListaSalas("Escolha a sala", salas);
        System.out.println("Selecione: ");
        int salaId = scanner.nextInt();

        Reserva novaReserva = new Reserva(dataComeco, dataFim, salas.get(salaId));
        return novaReserva;
    }

    public void alterarListaDeParticipantes(Scanner scanner, Reserva novaReserva) {
        boolean alterar = true;
        String[] opcoesMenu_alterarListaDeParticipantes = { "Adicionar Colaborador", "Remover Colaborador", "Voltar" };

        while (alterar) {

            exibirMenu("Que ação deseja fazer?", opcoesMenu_alterarListaDeParticipantes);
            int opc = scanner.nextInt();

            switch (opc) {

                case 1:
                    exibirTitulo("ALTERANDO - ADICIONANDO PARTICIPANTES");

                    adicionarColaboradores("Selecione os colaboradores para a reunião", novaReserva,
                            scanner);
                    break;

                case 2:
                    exibirTitulo("ALTERANDO - REMOVENDO PARTICIPANTES");

                    exibirListaParticipantes("Participantes atuais", novaReserva.getListaParticipantes());
                    System.out.println("Informe o código do colaborador que deseja remover: ");
                    int codigoFuncionario = scanner.nextInt();

                    if (verificarColaboradorPorId(codigoFuncionario)) {
                        if (novaReserva.removerParticipante(getColaboradorPorId(codigoFuncionario))) {
                            System.out.println("Colaborador removido com sucesso!");
                        } else {
                            System.out.println("Colaborador não está na lista de participantes.");
                        }
                        ;
                    }
                    break;

                case 3:
                    alterar = false;
                    break;

                default:
                    break;
            }
        }
    }

    public void adicionarColaboradores(String tituloMenu, Reserva reserva, Scanner scanner) {

        boolean selecionando = true;

        while (selecionando) {
            exibirListaColaboradores(tituloMenu, colaboradores);
            System.out.print("Informe o código para adicionar o colaborador á lista de reunião (0 para cancelar): ");
            int codigoFuncionario = scanner.nextInt();

            if (codigoFuncionario == 0) {
                selecionando = false;
                break;
            }

            if (verificarColaboradorPorId(codigoFuncionario)) {
                if (reserva.adicionarParticipante(getColaboradorPorId(codigoFuncionario))) {
                    System.out.println("Colaborador adicionado com sucesso!");
                } else {
                    System.out.println("Colaborador já está na lista de participantes.");
                }
                ;
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Deseja adicionar mais participantes? (S/N): ");
            String opc = scanner.next();
            if (opc.equalsIgnoreCase("N")) {
                selecionando = false;
            }
        }
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

    public void cadastrarColaborador(Scanner scanner) {

        boolean cadastroValido = false;

        while (!cadastroValido) {

            boolean nomeValido = false;
            boolean cargoValido = false;
            boolean setorValido = false;

            String nome;
            EnumCargo cargo = null;
            EnumSetor setor = null;
            int codigo = colaboradores.size() + 100;

            while (!nomeValido) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.print("Informe o nome do colaborador: ");
                nome = scanner.next();
                if (nome != null && nome != " ") {
                    nomeValido = true;
                } else {
                    System.out.println("Nome inválido, tente novamente.");

                }

                while (!cargoValido) {
                    String[] opcoesMenu_cargos = { "Gerente", "Desenvolvedor", "Analista", "Assistente", "Estagiario",
                            "Coordenador" };
                    exibirMenu("Cargos", opcoesMenu_cargos);
                    int cargoInput = scanner.nextInt();

                    cargo = EnumCargo.values()[cargoInput];

                    if (cargo != null) {
                        cargoValido = true;
                    } else {
                        System.out.println("Cargo inválido, tente novamente.");
                    }
                }

                while (!setorValido) {
                    String[] opcoesMenu_setores = { "Diretoria", "RH", "Desenvolvimento" };
                    exibirMenu("Setores", opcoesMenu_setores);

                    System.out.print("Informe o setor do colaborador: ");
                    int setorInput = scanner.nextInt();

                    setor = EnumSetor.values()[setorInput];

                    if (setor != null) {
                        setorValido = true;
                    } else {
                        System.out.println("Setor inválido, tente novamente.");
                    }

                }
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                try {
                    Colaborador novoColaborador = new Colaborador(nome, cargo, setor, codigo);
                    colaboradores.add(novoColaborador);
                    System.out.println("Colaborador cadastrado com sucesso!");
                    cadastroValido = true;
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar colaborador: " + e.getMessage());
                }

            }
        }
    }

    public void exibirListaSalas(String tituloMenu, ArrayList<Sala> salas) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Sala sa : salas) {
            System.out.printf("[ %d ] %s - %d lugares", sa.getCodigo(), sa.getNome(), sa.getQntLugares());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void exibirListaParticipantes(String tituloMenu, ArrayList<Colaborador> participantes) {
        if (participantes.size() == 0) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Nenhum participante adicionado até o momento.");
            return;
        } else {
             System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(tituloMenu);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            for (Colaborador pa : participantes) {
                System.out.printf("[ %d ] %s", pa.getCodigo(), pa.getNome());
                System.out.println();
            }
            
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void exibirListaColaboradores(String tituloMenu, ArrayList<Colaborador> colaboradores) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Colaborador co : colaboradores) {
            System.out.printf("[ %d ] %s", co.getCodigo(), co.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void exibirMenu(String tituloMenu, String opcoesMenu[]) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < opcoesMenu.length; i++) {
            System.out.printf("[ %d ] %s", i + 1, opcoesMenu[i]);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void exibirMenu(String tituloMenu, ArrayList<Sala> opcoesMenu) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (Sala sa : opcoesMenu) {
            System.out.printf("[ %d ] %s - $d lugares", sa.getCodigo(), sa.getNome(), sa.getQntLugares());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void exibirTitulo(String titulo) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(titulo);
    }

}
