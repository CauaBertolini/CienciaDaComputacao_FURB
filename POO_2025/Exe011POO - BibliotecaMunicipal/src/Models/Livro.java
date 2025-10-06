package Models;

public class Livro extends ItemBiblioteca {
    public Livro(String nome) {
        super(nome, 14);
        setMulta(0.75f);
    }
}
