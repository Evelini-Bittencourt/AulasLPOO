package model;

public class Cliente implements Socio{
    protected int quantidadeDeAcoes;
    protected double valorDaAcao;
    protected String nome;
    protected String sobrenome;
    protected String email;

    public Cliente() {
    }

    public Cliente(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, String email) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }
    @Override
    public int getQuantidadeDeAcoes() {
        return quantidadeDeAcoes;
    }

    @Override
    public double getValorDaAcao() {
        return valorDaAcao;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    public void setValorDaAcao(double valorDaAcao) {
        this.valorDaAcao = valorDaAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
