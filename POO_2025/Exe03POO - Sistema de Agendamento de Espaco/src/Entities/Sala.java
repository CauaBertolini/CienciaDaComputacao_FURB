package Entities;

public class Sala {
    private String nome;
    private int codigo;
    private int qntLugares;

    public Sala(String nome, int qntLugares) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQntLugares() {
        return qntLugares;
    }

    public void setQntLugares(int qntLugares) {
        this.qntLugares = qntLugares;
    }

}
