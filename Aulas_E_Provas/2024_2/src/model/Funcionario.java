package model;

public abstract class Funcionario implements Socio{
    protected String nome;
    protected String sobrenome;
    protected double salario;
    protected double valorDaAcao;
    protected int quantidadeDeAcoes;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, double salario, double valorDaAcao, int quantidadeDeAcoes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
