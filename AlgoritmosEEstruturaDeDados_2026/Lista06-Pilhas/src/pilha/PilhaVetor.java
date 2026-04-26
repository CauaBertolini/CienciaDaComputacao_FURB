package pilha;

public class PilhaVetor<T> implements Pilha<T> {
    private T lista[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        lista = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T info) throws PilhaCheiaException {
        if (tamanho < limite) {
            lista[tamanho] = info;
            tamanho++;
        } else {
            throw new PilhaCheiaException();
        }
    }

    @Override
    public T pop() throws PilhaVaziaException {

        if (!estaVazia()) {
            T info = peek(); // Topo
            lista[tamanho-1] = null; // Limpar Referência
            tamanho--;
            return info;
        }
        throw new PilhaVaziaException();

    }

    @Override
    public T peek() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return lista[tamanho-1];
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
            PilhaVetor<T> listaAuxiliar = new PilhaVetor(p.limite);

            while(!p.estaVazia()) {
                listaAuxiliar.push((T) p.pop());
            }
            while (!listaAuxiliar.estaVazia()) {
                this.push(listaAuxiliar.pop());
                p.push(listaAuxiliar.pop());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        PilhaVetor<T> pilhaAuxiliar = new PilhaVetor<>(limite);
        while (!estaVazia()) {
            T info = pop();
            pilhaAuxiliar.push(info);
            sb.append(info.toString());
            if (tamanho == 0) {
                sb.append(".");
            } else {
                sb.append(", ");
            }
        }
        while (!pilhaAuxiliar.estaVazia()) {
            push(pilhaAuxiliar.pop());
        }
        return sb.toString();
    }
}
