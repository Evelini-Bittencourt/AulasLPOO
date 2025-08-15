package model;

import exception.EstoqueInsuficiente;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
    private String sku;
    private String nome;
    private String descricao;
    private Integer estoque;
    private BigDecimal precoDeCusto;
    private BigDecimal precoDeVenda;

    //associações
    private List<Fornecedor> fornecedores;
    //não vai o de Item?Pq tem a flexa de sentido de navegação?

    public Produto() {
    }

    public Produto(String sku, String nome, String descricao, Integer estoque, BigDecimal precoDeCusto, BigDecimal precoDeVenda, List<Fornecedor> fornecedores) {
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
        this.fornecedores = fornecedores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public BigDecimal getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(BigDecimal precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public BigDecimal getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(BigDecimal precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    public static void baixarEstoque(List<Item>itens) {
        for (Item item : itens) {
            if (item.getProduto().getEstoque()>=item.getQuantidade()) {
                item.getProduto().setEstoque(item.getProduto().getEstoque()-item.getQuantidade());
            }else{
                System.out.println("Estoque insuficiente");
            }
        }
    }
    public static void baixarEstoqueComException(List<Item>itens) { //ele colocou throws EstoqueInsufiente entre o ) e a {
        for (Item item : itens) {
            if (item.getProduto().getEstoque()>=item.getQuantidade()) {
                item.getProduto().setEstoque(item.getProduto().getEstoque()-item.getQuantidade());
            }else{
                throw new EstoqueInsuficiente("Estoque insuficiente de " + item.getProduto().getNome());
            }
        }
    }
    public static void atualizaEstoque(Fornecimento fornecimento) {
        fornecimento.getProduto().setEstoque(fornecimento.getProduto().getEstoque()+fornecimento.getQuantidade());
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estoque=" + estoque +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
                ", fornecedores=" + fornecedores +
                '}';
    }
}
