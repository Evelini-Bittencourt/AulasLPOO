package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Sessao {
    private LocalDateTime dataHora;
    private BigDecimal valorInteira;
    private BigDecimal valorMeia;

    //associações
    private Sala sala;
    private Situacao situacao;
    private List<Ingresso> ingressos;
    private Filme filme;

    public Sessao() {
    }

    public Sessao(LocalDateTime dataHora, BigDecimal valorInteira, BigDecimal valorMeia, Sala sala, Situacao situacao, List<Ingresso> ingressos, Filme filme) {
        this.dataHora = dataHora;
        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;
        this.sala = sala;
        this.situacao = situacao;
        this.ingressos = ingressos;
        this.filme = filme;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public BigDecimal getValorInteira() {
        return valorInteira;
    }

    public void setValorInteira(BigDecimal valorInteira) {
        this.valorInteira = valorInteira;
    }

    public BigDecimal getValorMeia() {
        return valorMeia;
    }

    public void setValorMeia(BigDecimal valorMeia) {
        this.valorMeia = valorMeia;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "\nSessao{" +
                "dataHora=" + dataHora +
                ", valorInteira=" + valorInteira +
                ", valorMeia=" + valorMeia +
                ", sala=" + sala +
                ", situacao=" + situacao +
                ", ingressos=" + ingressos +
                ", filme=" + filme +
                '}';
    }
}
