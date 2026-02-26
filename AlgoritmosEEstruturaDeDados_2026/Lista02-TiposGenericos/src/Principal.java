public class Principal {
    public static void main(String Args[]) {
        ListaEstatica lista = new ListaEstatica();

        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(70);
        lista.inserir(70);
        lista.inserir(60);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);
        lista.inserir(50);

        lista.inverter();
        int tamanho = lista.getTamanho();
        System.out.println(tamanho);
        lista.exibir();

        System.out.println(lista.toString());

        int ondeEstaValor = lista.buscar(30);
        System.out.println("30 está na posição: " + ondeEstaValor);

        lista.retirar(30);
        lista.exibir();

        lista.liberar();
        lista.exibir();
        System.out.println(lista.estaVazia());
    }
}
