package model;

public class Gerente extends Funcionario{
    private double taxaDeBonificacao;

    public Gerente() {
    }

    public Gerente(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, double salario, double taxaDeBonificacao) {
        super(quantidadeDeAcoes, valorDaAcao, nome, sobrenome, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public double getTaxaDeBonificacao() {
        return taxaDeBonificacao/100;
    }

    public void setTaxaDeBonificacao(double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", salario=" + salario +
                ", taxaDeBonificacao=" + taxaDeBonificacao +
                '}';
    }
}
