package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private String numero;
    private LocalDateTime data;
    private BigDecimal total;

    //associações
    private List<Item> itens;
    private Estado estado;
    private Vendedor vendedor;

    public Pedido() {
    }

    public Pedido(String numero, LocalDateTime data, BigDecimal total, List<Item> itens, Estado estado, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.itens = itens;
        this.estado = estado;
        this.vendedor = vendedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\n\nPedido{" +
                "numero='" + numero + '\'' +
                ", data=" + data +
                ", total=" + total +
                ", itens=" + itens +
                ", estado=" + estado +
                ", vendedor=" + vendedor +
                '}';
    }
}
