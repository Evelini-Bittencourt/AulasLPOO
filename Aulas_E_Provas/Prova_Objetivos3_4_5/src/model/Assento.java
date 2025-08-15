package model;

public class Assento {
    private String fila;
    private String numero;

    //associações
    private Sala sala;

    public Assento() {
    }

    public Assento(String fila, String numero, Sala sala) {
        this.fila = fila;
        this.numero = numero;
        this.sala = sala;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "\nAssento{" +
                "fila='" + fila + '\'' +
                ", numero='" + numero + '\'' +
                ", sala=" + sala +
                '}';
    }
}
