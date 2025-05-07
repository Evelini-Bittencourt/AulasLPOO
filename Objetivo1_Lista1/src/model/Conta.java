package model;

public class Conta {
    private double saldo;
    private int id;

    public Conta() {
    }

    public Conta(double saldo, int id) {
        this.saldo = saldo;
        this.id = id;
    }

    public Conta(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
