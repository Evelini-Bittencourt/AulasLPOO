package model;

import java.util.List;

public class Ator {
    private String nomeCompleto;

    //associações
    List<Atua> atuacoes;

    public Ator() {
    }

    public Ator(String nomeCompleto, List<Atua> atuacoes) {
        this.nomeCompleto = nomeCompleto;
        this.atuacoes = atuacoes;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Atua> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atua> atuacoes) {
        this.atuacoes = atuacoes;
    }

    @Override
    public String toString() {
        return "\nAtor{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", atuacoes=" + atuacoes +
                '}';
    }
}
