package Model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class ItemBiblioteca {
    private String titulo;
    private int prazo;
    private float multa;
    private boolean emprestado = false;
    private LocalDate dataEmprestimo;


    public ItemBiblioteca(String nome, int prazo) {
        setTitulo(nome);
        setPrazo(prazo);
        setMulta(0.5f);
    }

    public boolean emprestar() {
        if (emprestado != true) {
            setEmprestado(true);
            setDataEmprestimo(LocalDate.now(ZoneId.of("America/Sao_Paulo")));
            return true;
        } else {
            return false;
        }
    }

    public float devolver() {
        LocalDate dataDevolucao = LocalDate.now(ZoneId.of("America/Sao_Paulo"));

        if (emprestado == true) {
            long diferencaDiasEmprestimo = ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);

            if (diferencaDiasEmprestimo > this.getPrazo()) {
                float valorMulta = (diferencaDiasEmprestimo - prazo) * getMulta();
                setEmprestado(false);
                return valorMulta;
            }
        }
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public float getMulta() {
        return multa;
    }

    protected void setMulta(float multa) {
        this.multa = multa;
    }
}
