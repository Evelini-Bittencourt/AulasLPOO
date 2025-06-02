package model;

public class Funcionario implements Socio{
    protected int quantidadeDeAcoes;
    protected double valorDaAcao;
    protected String nome;
    protected String sobrenome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, double salario) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
