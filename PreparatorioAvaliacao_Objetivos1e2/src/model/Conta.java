package model;

public abstract class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo+= valor;
    }
    public void saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public abstract void atualiza(double taxa);
}
