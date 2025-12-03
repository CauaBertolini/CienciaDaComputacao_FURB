package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Pessoa {
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    public Pessoa(String nomeCompleto, LocalDate dataNascimento, String email, String telefone) {
        setNomeCompleto(nomeCompleto);
        setDataNascimento(dataNascimento);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
