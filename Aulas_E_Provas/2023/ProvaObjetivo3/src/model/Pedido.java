package model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDateTime data;
    private double valor;

    //associações
    //associação binária com Vendedor
    private Vendedor vendedor;
    //composição com item
    private List<Item> itens;
    //implementação do enum
    private Tipo tipo;

    public Pedido() {
    }

    public Pedido(int numero, LocalDateTime data, double valor, Vendedor vendedor, List<Item> itens, Tipo tipo) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                ", tipo=" + tipo +
                '}';
    }
}
