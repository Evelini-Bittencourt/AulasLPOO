package model;

import java.time.LocalDate;

public class Fornecimento {
    private LocalDate data;
    private double valor;
    private int quantidade;

    //associações
    //classe associativa produto-fornecimento-fornecedor
        //um atributo para cada uma das duas classes
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento() {
    }


    public Fornecimento(LocalDate data, double valor, int quantidade, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valor = valor;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
