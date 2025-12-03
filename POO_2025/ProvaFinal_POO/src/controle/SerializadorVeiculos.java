// Cauã Fernando Bertolini

package controle;

import modelo.OnibusEletrico;
import modelo.VanDeEntrega;
import modelo.Veiculo;
import util.JOptionPaneUtil;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class SerializadorVeiculos {

    public static Veiculo deserealizarVeiculo(String caminho) {
        File arquivo = new File(caminho);

        if (arquivo.exists()) {
            try (DataInputStream deserealizador = new DataInputStream(new FileInputStream(arquivo))) {
                char tag = deserealizador.readChar();
                String nome = deserealizador.readUTF();
                String rota = deserealizador.readUTF();
                int kmPercorridos = deserealizador.readInt();
                int litrosOukWhConsumidos = deserealizador.readInt();
                int ocorrenciaDeAtrasoOuParada = deserealizador.readInt();

                switch (tag) {
                    case 'B':
                        Veiculo onibus = new OnibusEletrico(tag, nome, rota, kmPercorridos, litrosOukWhConsumidos, ocorrenciaDeAtrasoOuParada);
                        return onibus;

                    case 'V':
                        Veiculo van = new VanDeEntrega(tag, nome, rota, kmPercorridos, litrosOukWhConsumidos, ocorrenciaDeAtrasoOuParada);
                        return van;
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    public static boolean serializarVeiculo(Veiculo veiculo, int contador) {
        String caminhoArquivoVeiculo = "veiculo_"+contador+".vxj";

        try (DataOutputStream serializador = new DataOutputStream(new FileOutputStream(new File(caminhoArquivoVeiculo)))) {

            serializador.writeChar(veiculo.getTag());
            serializador.writeUTF(veiculo.getNome());
            serializador.writeUTF(veiculo.getRota());
            serializador.writeInt(veiculo.getKmPercorridos());

            if (veiculo instanceof OnibusEletrico) {
                OnibusEletrico veiculoOnibus = (OnibusEletrico) veiculo;
                serializador.writeInt(veiculoOnibus.getTotalkWhConsumido());
                serializador.writeInt(veiculoOnibus.getParadasNaoProgramadas());
            } else if (veiculo instanceof VanDeEntrega) {
                VanDeEntrega veiculoVan = (VanDeEntrega) veiculo;
                serializador.writeInt(veiculoVan.getCombustivelGasto());
                serializador.writeInt(veiculoVan.getOcorrenciaDeAtraso());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public static void serializarListaVeiculos(List<Veiculo> listaVeiculos) {
        int contador = 1;
        for (Veiculo v : listaVeiculos) {
            serializarVeiculo(v, contador);
            contador++;
        }
    }
}
