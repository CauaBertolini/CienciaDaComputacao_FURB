package Entities;

public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;

    @Override
    public void sacar(double valor) {
        if ((getSaldo() + getLimiteCredito()) >= valor) {
            if (valor > this.getSaldo()) {

                double totalSaque = valor;
                double valorSaqueCredito = valor - this.getSaldo();

                setLimiteCredito(getLimiteCredito() - valorSaqueCredito);
                super.sacar(totalSaque - valorSaqueCredito);

            } else {
                super.sacar(valor);
            }
        }

    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

}
