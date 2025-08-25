package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservasMes {
    private List<Reserva> listaDeReservasDoMes = new ArrayList<>();

    public boolean reservar(Reserva novaReserva) {
        if (listaDeReservasDoMes != null) {
            for (Reserva outraReservaQualquer : listaDeReservasDoMes) {
                if (novaReserva.getSalaReserva().equals(outraReservaQualquer.getSalaReserva())) {
                    if (novaReserva.getDataHoraInicio().isBefore(outraReservaQualquer.getDataHoraFim()) ||
                            novaReserva.getDataHoraFim().isAfter(outraReservaQualquer.getDataHoraInicio())) {
                        return  false;
                    }
                }
            }
        } else {
            listaDeReservasDoMes.add(novaReserva);
        }
        return true;
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
