package Model;

public class Motorista {
    private String numCNH;
    private Veiculo modeloCarro;

    public String getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(String numCNH) {
        this.numCNH = numCNH;
    }

    public Veiculo getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(Veiculo modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
}
