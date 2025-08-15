package model;

import java.util.List;

public class Genero {
    private String descricao;

    //associações
    private List<Filme> filmes;

    public Genero() {
    }

    public Genero(String descricao, List<Filme> filmes) {
        this.descricao = descricao;
        this.filmes = filmes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "\nGenero{" +
                "descricao='" + descricao + '\'' +
                ", filmes=" + filmes +
                '}';
    }
}
