package model;

import exception.EstoqueInsuficienteException;

import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;


    //associações
    //associação binária com item
    private List<Item> itens;
    //classe associativa produto-fornecimento-fornecedor
        //associa as duas classes normalmente
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(int codigo, String nome, int quantidade, double preco, List<Item> itens, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.itens = itens;
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public static void baixarEstoque(List<Item> itens) throws EstoqueInsuficienteException {
        for(Item item:itens){
            if(item.getProduto().getQuantidade()>=item.getQuantidade()){
               item.getProduto().setQuantidade(item.getProduto().getQuantidade()- item.getQuantidade());
            }else{
                throw new EstoqueInsuficienteException("Erro, estoque insuficiente.");
            }
        }
    }
    public static void aumentarEstoque(List<Fornecimento> fornecimentos){
        for(Fornecimento fornecimento:fornecimentos){
            fornecimento.getProduto().setQuantidade(fornecimento.getProduto().getQuantidade()+fornecimento.getQuantidade());
        }
    }
    @Override
    public String toString() {
        return "\nProduto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", itens=" + itens +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
