package model;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;

    //associações
    //classe associativa produto-fornecimento-fornecedor
        //associa as duas classes normalmente
    private Produto produto;

    public Fornecedor() {
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public Fornecedor(int cnpj, String contato, String nome, Produto produto) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produto = produto;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produto=" + produto +
                '}';
    }
}
