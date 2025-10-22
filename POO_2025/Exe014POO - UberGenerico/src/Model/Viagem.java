package Model;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;
import Exception.Utilitario;

public class Viagem {
    private Passageiro passageiro;
    private Motorista motorista;
    private String pontoPartida;
    private String destino;
    private int distancia;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFim;

    public Viagem(Passageiro passageiro, Motorista motorista, String pontoPartida, String destino) {
        setPassageiro(passageiro);
        setMotorista(motorista);
        setPontoPartida(pontoPartida);
        setDestino(destino);
        setDistancia(0);
        setHoraInicio(LocalDateTime.now());
        setHoraFim(LocalDateTime.now().plusMinutes(30));
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public double calcularValorCorrida() {
        return 0;
    }

    public int calcularTempoEstimado() {
        return 0;
    }

    public double calcularDistancia() {
        if (getDistancia() == 0) {
            setDistancia((int) Math.random() * 21);
        }
        return distancia;
    }

    public void setDistancia(int distancia) {
        if (!Utilitario.ValorMenorIgualAZero(distancia)) {
            this.distancia = distancia;
        }
    }

    public int getDistancia() {
        return distancia;
    }

    public long calcularTempoCorrida() {
        long tempoCorrida = ChronoUnit.MINUTES.between(horaInicio, horaFim);
        return tempoCorrida;
    }


    public String getPontoPartida() {
        return pontoPartida;
    }

    public void setPontoPartida(String pontoPartida) throws CampoVazioOuNuloException {
        if (!Utilitario.CampoVazioOuNulo(pontoPartida)) {
            this.pontoPartida = pontoPartida;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) throws CampoVazioOuNuloException {
        if (!Utilitario.CampoVazioOuNulo(destino)) {
            this.destino = destino;
        }
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDateTime horaFim) {
        this.horaFim = horaFim;
    }
}
