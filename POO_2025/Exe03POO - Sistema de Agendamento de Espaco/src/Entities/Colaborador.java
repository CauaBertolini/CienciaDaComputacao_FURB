package Entities;

import Enums.EnumSetor;

public class Colaborador {
    private String nome;
    private Cargo cargo;
    private EnumSetor setor;
    private int codigo;
    private int ramal;

    public Colaborador(String nome, Cargo cargo, EnumSetor setor) {
        this.setNome(nome);
        this.setCargo(cargo);
        this.setSetor(setor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public EnumSetor getSetor() {
        return setor;
    }

    public void setSetor(EnumSetor setor) {
        this.setor = setor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
