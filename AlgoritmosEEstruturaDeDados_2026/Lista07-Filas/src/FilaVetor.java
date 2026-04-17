public class FilaVetor<T> implements Fila<T> {
    private T info [];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
    }

    @Override
    public void inserir(T valor) {
        
    }

    @Override
    public boolean estaVazia() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T retirar() {
        return null;
    }

    @Override
    public void liberar() {

    }
}
