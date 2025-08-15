package controller;

import exception.EstoqueInsuficienteException;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Vendedor v1=new Vendedor(11,"nomev1","endereçov1","bairrov1","cepv1","cidadev1","estadov1","localv1");
        Produto p1= new Produto(1,"nomep1",5,10.0);
        Produto p2= new Produto(2,"nomep2",10,20.0);
        Item i1= new Item(1,1.0,10,(p1.getPreco()*10)-((p1.getPreco()*10)*(1.0/100)),p1);
        Item i2= new Item(2,2.0,20,(p2.getPreco()*20)-((p2.getPreco()*20)*(2.0/100)),p2);

        List<Item> itens = new ArrayList<Item>();
        itens.add(i1);
        itens.add(i2);
        try{
            Produto.baixarEstoque(itens);
        }catch (EstoqueInsuficienteException e){
            e.printStackTrace();
        }
        double totalPedido=0.0;
        for(Item item:itens){
            totalPedido+= item.getTotal();
        }

        Pedido pedido1= new Pedido(1, LocalDateTime.now(),totalPedido,v1,itens, Tipo.ATENDIDO);
        System.out.println("Estoque p1: "+p1.getQuantidade());
        System.out.println("Estoque p2: "+p2.getQuantidade());

        itens=new ArrayList<>();
        //itens.clear(); não funcionou

        Item i3= new Item(3,3.0,30,(p1.getPreco()*30)-((p1.getPreco()*30)*(3.0/100)),p1);
        Item i4= new Item(4,4.0,40,(p2.getPreco()*40)-((p2.getPreco()*40)*(4.0/100)),p2);
        itens.add(i3);
        itens.add(i4);
        try {
            Produto.baixarEstoque(itens);
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        }
        totalPedido=0.0;
        for(Item item:itens){
            totalPedido+= item.getTotal();
        }

        Pedido pedido2= new Pedido(2, LocalDateTime.now(),totalPedido,v1,itens, Tipo.PENDENTE);
        System.out.println("Estoque p1: "+p1.getQuantidade());
        System.out.println("Estoque p2: "+p2.getQuantidade());

        List<Pedido> pedidos= new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        double totalVendas=0.0;
        for(Pedido pedido:pedidos){
            totalVendas+=pedido.getValor();
        }
        System.out.println(pedidos+"\nTotal de vendas"+totalVendas);

        Fornecedor f1= new Fornecedor(111111,"contatof1","nomef1");
        Fornecimento fornecimento1= new Fornecimento(LocalDate.now(),10*p1.getPreco(),10,f1,p1);
        Fornecimento fornecimento2= new Fornecimento(LocalDate.now(),20*p2.getPreco(),20,f1,p2);

        List<Fornecimento> fornecimentos= new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);
        Produto.aumentarEstoque(fornecimentos);

        System.out.println("Estoque p1: "+p1.getQuantidade());
        System.out.println("Estoque p2: "+p2.getQuantidade());
        double totalFornecimentos=0.0;
        for (Fornecimento fornecimento:fornecimentos){
            totalFornecimentos+=fornecimento.getValor();
        }
        System.out.println(fornecimentos+"\nTotal de fornecimentos"+totalFornecimentos);


    }
}
