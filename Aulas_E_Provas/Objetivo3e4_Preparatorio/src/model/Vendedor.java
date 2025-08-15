package model;

import java.math.BigDecimal;
import java.util.List;

public class Vendedor extends Funcionario{
    private double taxaDeComissao;
    //associações
    private List<Pedido> pedidos;
    private Regiao regiao;

    public Vendedor() {
    }
    //ele não colocou os pedidos nesse construtor, PQ??

    public Vendedor(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, double taxaDeComissao, List<Pedido> pedidos, Regiao regiao) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.pedidos = pedidos;
        this.regiao = regiao;
    }

    //pq o toString não tá pegando os atributos da superclase???
    //pq estava private e não protected


    @Override
    public String toString() {
        return "Vendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", pedidos=" + pedidos +
                ", regiao=" + regiao +
                ", matricula=" + matricula +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                '}';
    }
}
