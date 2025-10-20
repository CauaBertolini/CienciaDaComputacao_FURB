import java.util.Date;

public class ContaLuz {
    private Date dataLeitura;
    private int numeroLeitura;
    private double kwGasto;
    private Date dataPaga;

    public ContaLuz() {

    }

    public double getValorPagar() {
        return kwGasto * 0.44876087;
    }

    public double getMediaConsumo() {
        return  kwGasto / 29;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public int getNumeroLeitura() {
        return numeroLeitura;
    }

    public void setNumeroLeitura(int numeroLeitura) {
        this.numeroLeitura = numeroLeitura;
    }

    public double getKwGasto() {
        return kwGasto;
    }

    public void setKwGasto(double kwGasto) {
        this.kwGasto = kwGasto;
    }

    public Date getDataPaga() {
        return dataPaga;
    }

    public void setDataPaga(Date dataPaga) {
        this.dataPaga = dataPaga;
    }
}
