public class main {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.exibir();
        listaDupla.exibirOrdemInversa();
    }
}
