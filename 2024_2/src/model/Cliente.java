package model;

public abstract class Cliente implements Socio{
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected double valorDaAcao;
    protected int quantidadeDeAcoes;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String email, double valorDaAcao, int quantidadeDeAcoes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.valorDaAcao = valorDaAcao;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return quantidadeDeAcoes;
    }

    @Override
    public double getValorDaAcao() {
        return valorDaAcao;
    }

    public void setValorDaAcao(double valorDaAcao) {
        this.valorDaAcao = valorDaAcao;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
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
