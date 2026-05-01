package arvoreBinaria;

public interface IArvoreBinaria<T> {

    public void setRaiz(NoArvoreBinaria<T> raiz);
    public boolean estaVazia();
    public boolean pertence(T info);
    public int contarNos();
    public String toString();
}
