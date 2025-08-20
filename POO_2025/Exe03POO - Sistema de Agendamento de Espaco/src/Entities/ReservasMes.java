package Entities;

import java.util.Date;
import java.util.List;

public class ReservasMes {
    private List<Reserva> listaDeReservasDoMes;

    public boolean reservar(Reserva novaReserva) {
        for (Reserva outraReservaQualquer : listaDeReservasDoMes) {
            if (novaReserva.getSalaReserva().equals(outraReservaQualquer.getSalaReserva())) {
                if (novaReserva.getDataHoraInicio().isBefore(outraReservaQualquer.getDataHoraFim()) &&
                        novaReserva.getDataHoraFim().isAfter(outraReservaQualquer.getDataHoraInicio())) {
                    System.out.println("Não é possível agendar uma reunião nessa sala nesse horário.");
                    return  false;
                }
            }
        }
        return true;
    }
    //(novaReserva.getDataHoraInicio().isEqual(outraReservaQualquer.getDataHoraInicio())) || (novaReserva.getDataHoraInicio().isBefore(outraReservaQualquer.getDataHoraInicio()) && novaReserva.getDataHoraFim().isAfter(outraReservaQualquer.getDataHoraInicio())) || (novaReserva.getDataHoraInicio().isAfter(outraReservaQualquer.getDataHoraInicio()) && novaReserva.getDataHoraFim().isBefore(outraReservaQualquer.getDataHoraFim()))

    public void realocar(Sala sala) {

    }

    public void reagendar(Date date) {

    }
}
