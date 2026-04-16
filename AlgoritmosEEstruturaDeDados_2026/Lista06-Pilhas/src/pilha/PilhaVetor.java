package pilha;

public class PilhaVetor implements Pilha {
    private Object lista[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        lista = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(Object info) throws PilhaCheiaException {
        if (tamanho < limite) {
            lista[tamanho] = info;
            tamanho++;
        } else {
            throw new PilhaCheiaException();
        }
    }

    @Override
    public Object pop() throws PilhaVaziaException {

        if (!estaVazia()) {
            Object info = peek(); // Topo
            lista[tamanho-1] = null; // Limpar Referência
            tamanho--;
            return info;
        }
        throw new PilhaVaziaException();

    }

    @Override
    public Object peek() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return lista[tamanho];
    }

    @Override
    public boolean estaVazia() {
        return(tamanho == 0);
    }

    @Override
    public void liberar() {
        for (int i = tamanho-1; i > 0; i--) {
            lista[i] = null;
        }
        tamanho = 0;
    }

    public void concatenar(PilhaVetor p) {
        int espacoDisponivel = limite - tamanho;
        int elementosP = p.tamanho;
        if (elementosP <= espacoDisponivel) {
            PilhaVetor listaAuxiliar = new PilhaVetor(p.limite);

            while(!p.estaVazia()) {
                listaAuxiliar.push(p.pop());
            }
            while (!listaAuxiliar.estaVazia()) {
                this.push(listaAuxiliar.pop());
                p.push(listaAuxiliar.pop());
            }
        }
    }
}
