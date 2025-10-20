package Entities;

import Enums.EnumCargo;
import Enums.EnumSetor;

public class Colaborador {
    private String nome;
    private EnumCargo cargo;
    private EnumSetor setor;
    private int codigo;
    private int ramal;

    public Colaborador(String nome, EnumCargo cargo, EnumSetor setor, int codigo) {
        this.setNome(nome);
        this.setCargo(cargo);
        this.setSetor(setor);
        this.setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        this.nome = nome;
    }

    public EnumCargo getCargo() {
        return cargo;
    }

    public void setCargo(EnumCargo cargo) throws IllegalArgumentException {
        this.cargo = cargo;
    }

    public EnumSetor getSetor() {
        return setor;
    }

    public void setSetor(EnumSetor setor) throws IllegalArgumentException {
        this.setor = setor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        this.codigo = codigo;
    }
}
