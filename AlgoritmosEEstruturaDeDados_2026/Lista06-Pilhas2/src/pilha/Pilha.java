package pilha;

public interface Pilha {
    public void push(Object info);
    public Object pop();
    public Object peek();
    public boolean estaVazia();
    public void liberar();
}
