package model;

import java.math.BigDecimal;

public class Item {
    private Integer quantidade;
    private BigDecimal total;

    //associações
    private Produto produto;
    private Situacao situacao;
    //pedido não entra pq é uma composição(lembrar: um agregado pode ir em bora, mas algo que te compõe não pode ser retirado.
    // E, quando é composição, a associação só é escrita do lado forte.)

    public Item() {
    }

    public Item(Integer quantidade, BigDecimal total, Produto produto, Situacao situacao) {
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.situacao = situacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "quantidade=" + quantidade +
                ", total=" + total +
                ", produto=" + produto +
                ", situacao=" + situacao +
                '}';
    }
}
