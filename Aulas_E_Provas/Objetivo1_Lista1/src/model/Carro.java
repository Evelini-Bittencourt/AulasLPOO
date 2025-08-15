package model;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private int anoFabricacao;

    public Carro() {

    }

    public Carro(int id, String modelo, String marca, int anoFabricacao) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public Carro(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
