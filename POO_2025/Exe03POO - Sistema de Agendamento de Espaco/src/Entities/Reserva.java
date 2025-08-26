package Entities;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public boolean adicionarParticipante(Colaborador novoParticipante) {
        if (listaParticipantes != null) {
            if (listaParticipantes.contains(novoParticipante) == false) {
            listaParticipantes.add(novoParticipante);
                return true;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        this.codigo = codigo;
    }

    public Sala getSalaReserva() {
        return salaReserva;
    }

    public void setSalaReserva(Sala salaReserva) throws IllegalArgumentException {
        this.salaReserva = salaReserva;
    }
}
