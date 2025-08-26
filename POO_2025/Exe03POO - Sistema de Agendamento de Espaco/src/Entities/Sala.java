package Entities;

public class Sala {
    private String nome;
    private int codigo;
    private int qntLugares;

    public Sala(String nome, int qntLugares, int id) {
        this.setNome(nome);
        this.setQntLugares(qntLugares);
        this.setCodigo(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        this.codigo = codigo;
    }

    public int getQntLugares() {
        return qntLugares;
    }

    public void setQntLugares(int qntLugares) throws IllegalArgumentException {
        this.qntLugares = qntLugares;
    }

}
