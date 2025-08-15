package model;

public class Cliente implements Investidor{
    private String nome;
    private String sobrenome;
    private int qdeCotas;
    private String ticker;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, int qdeCotas, String ticker) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.qdeCotas = qdeCotas;
        this.ticker = ticker;
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
        this.qdeCotas=qdeCotas;

    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", ticker='" + ticker + '\'' +
                '}';
    }
}
