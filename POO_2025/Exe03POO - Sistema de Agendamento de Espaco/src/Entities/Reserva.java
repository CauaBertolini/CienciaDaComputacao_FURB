package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Reserva {
    private DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("dd-MM-yyyy HH");
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Sala salaReserva;
    private ArrayList<Colaborador> listaParticipantes = new ArrayList<>();
    private int codigo;

    public Reserva(String dataHoraInicio, String dataHoraFim, Sala salaReserva) {
        this.setDataHoraInicio(dataHoraInicio);
        this.setDataHoraFim(dataHoraFim);
        this.salaReserva = salaReserva;
    }

    @Override
    public String toString() {
        return this.getCodigoReserva() + " | " + this.dataHoraInicio.format(formatoHorario) + " - " + this.dataHoraFim.format(formatoHorario) + " | " + this.getSalaReserva().getNome();
    }

    public boolean adicionarParticipante(Colaborador novoParticipante) {
        if (listaParticipantes != null) {
            if (listaParticipantes.contains(novoParticipante) == false && salaReserva != null) {
                if (listaParticipantes.size() + 1 <= salaReserva.getQntLugares()) {
                    listaParticipantes.add(novoParticipante);
                    return true;
                } else {
                    System.out.println("Não foi possível adicionar colaborador pois a a quantidade de pessoas iria ultrapassar a capacidade da sala.");
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }

    public boolean removerParticipante(Colaborador participante) {
        for (Colaborador p : listaParticipantes) {
            if (p.getCodigo() == participante.getCodigo()) {
                listaParticipantes.remove(p);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Colaborador> getListaParticipantes() {
        return listaParticipantes;
    }

    public int getDuration() {
        int duration = (int) ChronoUnit.HOURS.between(getDataHoraInicio(),getDataHoraFim());
        return duration;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataHoraInicio) throws IllegalArgumentException {
        this.dataHoraInicio = LocalDateTime.parse(dataHoraInicio, formatoHorario);
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataHoraFim) throws IllegalArgumentException {
        this.dataHoraFim = LocalDateTime.parse(dataHoraFim, formatoHorario);
    }

    public int getCodigoReserva() {
        return codigo;
    }

    public void setCodigoReserva(int codigo) throws IllegalArgumentException {
        this.codigo = codigo;
    }

    public Sala getSalaReserva() {
        return salaReserva;
    }

    public void setSalaReserva(Sala salaReserva) throws IllegalArgumentException {
        this.salaReserva = salaReserva;
    }
}
