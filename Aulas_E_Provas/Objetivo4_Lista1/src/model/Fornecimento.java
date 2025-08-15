package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Fornecimento {
    private LocalDateTime data;
    private Integer quantidade;
    private BigDecimal valor;

    //associação terciária
    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDateTime data, Integer quantidade, BigDecimal valor, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", produto=" + produto +
                '}';
    }
}
