package model;

public class Vendedor extends Funcionario{
    private double taxaDeComissao;

    public Vendedor() {
    }

    public Vendedor(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, double salario, double taxaDeComissao) {
        super(quantidadeDeAcoes, valorDaAcao, nome, sobrenome, salario);
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
                ", valorDaAcao=" + valorDaAcao +
                ", salario=" + salario +
                ", taxaDeComissao=" + taxaDeComissao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                '}';
    }
}
