public class main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.inserir(1);
        listaEncadeada.inserir(2);
        listaEncadeada.inserir(3);
        listaEncadeada.inserir(4);
        listaEncadeada.inserir(5);

        listaEncadeada.exibir();

        System.out.printf("Próximo depois do 5");

    }
}
