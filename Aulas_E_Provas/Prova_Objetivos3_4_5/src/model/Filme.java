package model;

import java.time.LocalTime;
import java.util.List;

public class Filme {
    private String titulo;
    private LocalTime duracao;

    //associações
    private List<Sessao> sessoes;
    private Genero genero;
    private List<Atua> atuacoes;

    public Filme() {
    }

    public Filme(String titulo, LocalTime duracao, List<Sessao> sessoes, Genero genero, List<Atua> atuacoes) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.sessoes = sessoes;
        this.genero = genero;
        this.atuacoes = atuacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Atua> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atua> atuacoes) {
        this.atuacoes = atuacoes;
    }

    @Override
    public String toString() {
        return "\nFilme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", sessoes=" + sessoes +
                ", genero=" + genero +
                ", atuacoes=" + atuacoes +
                '}';
    }
}
