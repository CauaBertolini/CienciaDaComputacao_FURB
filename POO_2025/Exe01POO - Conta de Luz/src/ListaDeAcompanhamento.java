import java.util.ArrayList;
import java.util.List;

public class ListaDeAcompanhamento {
    private List<ContaLuz> listaDeContaLuz = new ArrayList<>();

    public void AdicionarContaLuz(ContaLuz conta) {
        if (!listaDeContaLuz.contains(conta)) {
            listaDeContaLuz.add(conta);
        } else {
            System.out.println("Conta já adicionada");
        }
    }

    public void RemoverContaLuz(int numeroLeitura) {
        for(ContaLuz c : listaDeContaLuz) {
            if (c.getNumeroLeitura() == numeroLeitura) {
                listaDeContaLuz.remove(c);
            }
        }
    }

}
