package model;

public class Gerente extends Funcionario implements Investidor{
    private int qdeCotas;
    private String ticker;

    public Gerente() {
    }

    public Gerente(String nome, double salario, int qdeCotas, String ticker) {
        super(nome, salario);
        this.qdeCotas = qdeCotas;
        this.ticker = ticker;
    }
    @Override
    public double getBonus() {
        return this.getSalario()*0.20;
    }
    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker= ticker;

    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", qdeCotas=" + qdeCotas +
                ", ticker='" + ticker + '\'' +
                '}';
    }
}
