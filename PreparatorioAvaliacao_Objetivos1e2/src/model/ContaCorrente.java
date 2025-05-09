package model;

public class ContaCorrente extends Conta implements Associado{
    private int qdeCotas;
    public ContaCorrente() {
    }

    public ContaCorrente(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public ContaCorrente(double saldo, int qdeCotas) {
        super(saldo);
        this.qdeCotas = qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", saldo=" + saldo +
                '}';
    }
}
