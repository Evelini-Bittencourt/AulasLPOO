package model;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;
    private double total;

    //associações
    //composição com pedido
        //a associação só vai do lado forte
    //associação binária com produto
    private Produto produto;

    public Item() {
    }

    public Item(int codItem, double desconto, int quantidade, double total, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", total=" + total +
                ", produto=" + produto +
                '}';
    }
}
