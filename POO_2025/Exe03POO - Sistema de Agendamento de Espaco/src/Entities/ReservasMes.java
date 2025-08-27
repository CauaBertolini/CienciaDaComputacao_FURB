package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservasMes {
    private List<Reserva> listaDeReservasDoMes = new ArrayList<>();

    public boolean reservar(Reserva novaReserva) {
        boolean reservaValida = false;
        if (!listaDeReservasDoMes.isEmpty()) {
            for (Reserva outraReservaQualquer : listaDeReservasDoMes) {
                if (novaReserva.getSalaReserva().getCodigoSala() == outraReservaQualquer.getSalaReserva().getCodigoSala()) {
                    if ((novaReserva.getDataHoraInicio().isAfter(novaReserva.getDataHoraFim()) || novaReserva.getDataHoraFim().isBefore(novaReserva.getDataHoraInicio())) ||
                            (outraReservaQualquer.getDataHoraInicio().isEqual(novaReserva.getDataHoraInicio()) || outraReservaQualquer.getDataHoraInicio().isBefore(novaReserva.getDataHoraFim())) ||
                            (outraReservaQualquer.getDataHoraFim().isEqual(novaReserva.getDataHoraFim()) || (outraReservaQualquer.getDataHoraFim().isAfter(novaReserva.getDataHoraInicio()) && outraReservaQualquer.getDataHoraFim().isBefore(novaReserva.getDataHoraFim()))))  {
                        reservaValida = false;
                    }
                }
            }
        } else {
            listaDeReservasDoMes.add(novaReserva);
            reservaValida = true;
        }
        return reservaValida;
    }
    //(novaReserva.getDataHoraInicio().isEqual(outraReservaQualquer.getDataHoraInicio())) || (novaReserva.getDataHoraInicio().isBefore(outraReservaQualquer.getDataHoraInicio()) && novaReserva.getDataHoraFim().isAfter(outraReservaQualquer.getDataHoraInicio())) || (novaReserva.getDataHoraInicio().isAfter(outraReservaQualquer.getDataHoraInicio()) && novaReserva.getDataHoraFim().isBefore(outraReservaQualquer.getDataHoraFim()))

    public List<Reserva> getListaDeReservasDoMes() {
        return this.listaDeReservasDoMes;
    }

    public void realocar(Sala sala) {

    }

    public void reagendar(Date date) {

    }
}
