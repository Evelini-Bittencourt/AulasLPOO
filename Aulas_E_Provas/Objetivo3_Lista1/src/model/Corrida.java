package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Corrida {
    private BigDecimal valor;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    //associação entre as classes
    //associação binária
    private Usuario usuario;
    private Motorista motorista;
    private FormaDePagamento formaDePagamento;
    private Situacao situacao;

    public Corrida() {
    }

    public Corrida(BigDecimal valor, LocalDateTime dataInicio, LocalDateTime dataFim, Usuario usuario, Motorista motorista, FormaDePagamento formaDePagamento, Situacao situacao) {
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
        this.motorista = motorista;
        this.formaDePagamento = formaDePagamento;
        this.situacao = situacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "valor=" + valor +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                ", formaDePagamento=" + formaDePagamento +
                ", situacao=" + situacao +
                '}';
    }
}
