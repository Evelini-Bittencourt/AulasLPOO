package model;

public class Gerente extends Funcionario{
    private double taxaDeBonificacao;

    public Gerente() {
    }

    public Gerente(String nome, String sobrenome, double salario, double valorDaAcao, int quantidadeDeAcoes, double taxaDeBonificacao) {
        super(nome, sobrenome, salario, valorDaAcao, quantidadeDeAcoes);
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
                ", salario=" + salario +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", taxaDeBonificacao=" + taxaDeBonificacao +
                '}';
    }
}
