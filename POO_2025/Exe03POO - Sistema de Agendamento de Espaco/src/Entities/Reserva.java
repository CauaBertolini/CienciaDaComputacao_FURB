package Entities;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Reserva {

    DateTimeFormatter formatoPadraoHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH");
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Sala salaReserva;
    private List<Colaborador> listaParticipantes;
    private int codigo;

    public Reserva(String dataHoraInicio, String dataHoraFim, Sala salaReserva) {
        this.setDataHoraInicio(dataHoraInicio);
        this.setDataHoraFim(dataHoraFim);
        this.salaReserva = salaReserva;
    }

    public void adicionarParticipante(Colaborador participante) {
        listaParticipantes.add(participante);
    }

    public void removerParticipante(Colaborador participante) {
        for (Colaborador p : listaParticipantes) {
            if (p.getCodigo() == participante.getCodigo())
                listaParticipantes.remove(p);
        }
    }

    public int getDuration() {
        int duration = (int) ChronoUnit.HOURS.between(getDataHoraInicio(),getDataHoraFim());
        return duration;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = LocalDateTime.parse(dataHoraInicio, formatoPadraoHora);
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataHoraFim) {
        this.dataHoraFim = LocalDateTime.parse(dataHoraFim, formatoPadraoHora);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Sala getSalaReserva() {
        return salaReserva;
    }

    public void setSalaReserva(Sala salaReserva) {
        this.salaReserva = salaReserva;
    }
}
