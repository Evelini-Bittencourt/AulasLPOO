package model;

public class Vendedor extends Funcionario{
    private double taxaDeComissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String sobrenome, double salario, double valorDaAcao, int quantidadeDeAcoes, double taxaDeComissao) {
        super(nome, sobrenome, salario, valorDaAcao, quantidadeDeAcoes);
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao/100;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                ", taxaDeComissao=" + taxaDeComissao +
                '}';
    }
}
