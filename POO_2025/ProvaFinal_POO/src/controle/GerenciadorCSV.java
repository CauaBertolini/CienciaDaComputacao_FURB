// Cauã Fernando Bertolini

package controle;

import modelo.OnibusEletrico;
import modelo.VanDeEntrega;
import modelo.Veiculo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorCSV {
    private static final String NOME_ARQUIVO_CSV = "salvamentoDeVeiculos.csv";

    public static boolean salvarVeiculosNoCSV(List<Veiculo> lista) {
        try (FileWriter escritorDeArquivos = new FileWriter(NOME_ARQUIVO_CSV, false);
             PrintWriter impressorDeEscrita = new PrintWriter(escritorDeArquivos)) {

            for (Veiculo v : lista) {
                impressorDeEscrita.println(v.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static List<Veiculo> importarVeiculosDoCSV() {
        Path caminhoCSV = Paths.get(NOME_ARQUIVO_CSV);

        if (!Files.exists(caminhoCSV)) {
            return List.of();
        }

        List<String> veiculosString = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();

        try {
            veiculosString = Files.readAllLines(caminhoCSV);

            for (String vs : veiculosString) {
                String veiculo[] = vs.split(",");

                char tag = veiculo[0].toUpperCase().trim().charAt(0);
                String nome = veiculo[1].trim();
                String rota = veiculo[2].trim();
                int quilometrosRodados = Integer.parseInt(veiculo[3]);

                switch (tag) {
                    case 'B':
                        int totalkWhConsumido = Integer.parseInt(veiculo[4].trim());
                        int paradasNaoProgramadas = Integer.parseInt(veiculo[5].trim());

                        veiculos.add(new OnibusEletrico(tag, nome, rota, quilometrosRodados, totalkWhConsumido, paradasNaoProgramadas));
                        break;

                    case 'V':
                        int combustivelGasto = Integer.parseInt(veiculo[4].trim());
                        int ocorrenciaDeAtraso = Integer.parseInt(veiculo[5].trim());

                        veiculos.add(new VanDeEntrega(tag, nome, rota, quilometrosRodados,combustivelGasto, ocorrenciaDeAtraso));
                        break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return veiculos;
    }

    public static List<Veiculo> pegarCSVOrdenadoAlfabeticamente() {
        List<Veiculo> veiculos = importarVeiculosDoCSV();

        veiculos.sort(Comparator.comparing(Veiculo::getNome, String.CASE_INSENSITIVE_ORDER));

        return veiculos;
    }

}
