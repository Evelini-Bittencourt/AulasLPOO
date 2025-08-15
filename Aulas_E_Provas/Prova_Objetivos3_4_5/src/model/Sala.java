package model;

import java.util.List;

public class Sala {
    private Integer numero;
    private Integer capacidade;

    //associações
    private List<Assento> assentos;
    private List<Sessao> sessoes;

    public Sala() {
    }

    public Sala(Integer numero, Integer capacidade, List<Assento> assentos, List<Sessao> sessoes) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.assentos = assentos;
        this.sessoes = sessoes;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return "\nSala{" +
                "numero=" + numero +
                ", capacidade=" + capacidade +
                ", assentos=" + assentos +
                ", sessoes=" + sessoes +
                '}';
    }
}
