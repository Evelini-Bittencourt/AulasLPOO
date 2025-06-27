package controller;

import exception.EstoqueInsuficiente;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidosController {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(111L,"nomeCompletov1","emailv1","telefonev1", BigDecimal.valueOf(1000.0),2.0,null, Regiao.SUL);
        Fornecedor f1= new Fornecedor("znpjf1","razaoSocial","emailf1","telefonef1",null);
        Produto p1= new Produto("akup1","nomep1","descricaop1",100,BigDecimal.valueOf(10.00),BigDecimal.valueOf(20.00),List.of(f1));
        Produto p2= new Produto("akup2","nomep2","descricaop2",100,BigDecimal.valueOf(20.00),BigDecimal.valueOf(40.00),List.of(f1));
        Produto p3= new Produto("akup3","nomep3","descricaop3",100,BigDecimal.valueOf(30.00),BigDecimal.valueOf(60.00),List.of(f1));
        Item i1= new Item(10,p1.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)),p1, Situacao.ATIVO);
        Item i2= new Item(20,p2.getPrecoDeVenda().multiply(BigDecimal.valueOf(20)),p2, Situacao.CANCELADO);
        Item i3= new Item(30,p3.getPrecoDeVenda().multiply(BigDecimal.valueOf(30)),p3, Situacao.ATIVO);
        List<Item> Carrinho= new ArrayList<>();
        Carrinho.add(i1);
        Carrinho.add(i2);
        Carrinho.add(i3);
        BigDecimal totalDoCarrinho= BigDecimal.ZERO;
        for(Item item: Carrinho){
            totalDoCarrinho= totalDoCarrinho.add(item.getTotal());
        }
        Produto.baixarEstoque(Carrinho);
        System.out.println(Carrinho);
        Pedido ped1= new Pedido("1", LocalDateTime.now(),totalDoCarrinho,Carrinho,Estado.ABERTO,v1);
        System.out.println(ped1);
        System.out.println(totalDoCarrinho);
        System.out.println("************ D ***********");
        List<Item> Carrinho2= new ArrayList<>();
        Item i4= new Item(4,p1.getPrecoDeVenda().multiply(BigDecimal.valueOf(4)),p1, Situacao.ATIVO);
        Item i5= new Item(5,p2.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)),p2, Situacao.CANCELADO);
        Item i6= new Item(6,p3.getPrecoDeVenda().multiply(BigDecimal.valueOf(6)),p3, Situacao.ATIVO);
        Carrinho2.add(i4);
        Carrinho2.add(i5);
        Carrinho2.add(i6);
        //só isso não estava dando certo, perguntar sobre:
//            itens.clear(); //limpa o carrinho???????????
//            i1 = new Item(15, arroz.getPrecoDeVenda().multiply(BigDecimal.valueOf(15)), Situacao.Ativo, arroz);
//            itens.add(i1);
//            i2 = new Item(15, feijao.getPrecoDeVenda().multiply(BigDecimal.valueOf(15)), Situacao.Ativo, feijao);
//
//            itens.add(i2);

//        i1.setQuantidade(1);
//        i1.setTotal(p1.getPrecoDeVenda().multiply(BigDecimal.valueOf(1)));
//        i2.setQuantidade(2);
//        i2.setTotal(p2.getPrecoDeVenda().multiply(BigDecimal.valueOf(2)));
//        i3.setQuantidade(3);
//        i1.setTotal(p3.getPrecoDeVenda().multiply(BigDecimal.valueOf(3)));
        totalDoCarrinho= BigDecimal.ZERO;
        for(Item item: Carrinho2){
            totalDoCarrinho= totalDoCarrinho.add(item.getTotal());
        }
        Produto.baixarEstoque(Carrinho2);
        Pedido ped2= new Pedido("2", LocalDateTime.now(),totalDoCarrinho,Carrinho2,Estado.ABERTO,v1);
        System.out.println(ped2);
        System.out.println(totalDoCarrinho);

        System.out.println("************ E ***********");
        List<Pedido> pedidos= new ArrayList<>();
        pedidos.add(ped1);
        pedidos.add(ped2);
        System.out.println("************ F ***********");
        BigDecimal totalDoPedidos= BigDecimal.ZERO;
        for(Pedido p: pedidos){
            totalDoPedidos= totalDoPedidos.add(p.getTotal());
        }
        System.out.println(pedidos);
        System.out.println("Total de pedidos: "+totalDoPedidos);

        System.out.println("************ g ***********");
        Fornecimento forn1= new Fornecimento(LocalDateTime.now(),20,p1.getPrecoDeCusto().multiply(BigDecimal.valueOf(20)),f1,p1);
        //como ele sabe qual o produto deve ter o estoque atualizado?
            //resp: no metodo aparece assim: fornecimento.getProduto()....
        Produto.atualizaEstoque(forn1);
        System.out.println(p1.getEstoque());
        Fornecimento forn2= new Fornecimento(LocalDateTime.now(),40,p2.getPrecoDeCusto().multiply(BigDecimal.valueOf(40)),f1,p2);
        Produto.atualizaEstoque(forn2);
        System.out.println(p2.getEstoque());
        Fornecimento forn3= new Fornecimento(LocalDateTime.now(),60,p3.getPrecoDeCusto().multiply(BigDecimal.valueOf(60)),f1,p3);
        //da pra usar o set
        Produto.atualizaEstoque(forn3);
        System.out.println(p3.getEstoque());

        System.out.println("************ H ***********");
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(forn1);
        fornecimentos.add(forn2);
        fornecimentos.add(forn3);
        BigDecimal totalDoForn= BigDecimal.ZERO;
        for(Fornecimento f: fornecimentos){
            totalDoForn=totalDoForn.add(f.getTotal());
        }
        System.out.println(fornecimentos);
        System.out.println("Total de fornecimentos: "+totalDoForn);

        System.out.println("************ i ***********");

        List<Item> Carrinho3= new ArrayList<>();
        Item i7= new Item(400,p1.getPrecoDeVenda().multiply(BigDecimal.valueOf(400)),p1, Situacao.ATIVO);
        Item i8= new Item(500,p2.getPrecoDeVenda().multiply(BigDecimal.valueOf(500)),p2, Situacao.CANCELADO);
        Item i9= new Item(600,p3.getPrecoDeVenda().multiply(BigDecimal.valueOf(600)),p3, Situacao.ATIVO);
        Carrinho3.add(i7);
        Carrinho3.add(i8);
        Carrinho3.add(i9);
        totalDoCarrinho= BigDecimal.ZERO;
        for(Item item: Carrinho3){
            totalDoCarrinho= totalDoCarrinho.add(item.getTotal());
        }
        Pedido ped3 = new Pedido("3", LocalDateTime.now(), totalDoCarrinho, Carrinho3, Estado.ABERTO, v1);
        try{
            Produto.baixarEstoqueComException(Carrinho3);
        }catch (EstoqueInsuficiente e){//a exceção lançada no try vai ser capturada e colocada em om objeto, obviamente do tipo EstoqueInsuficiente
            e.printStackTrace(); //imprime a pilha de exceção do objeto
        }finally { //sempre executa esse bloco, nesse caso sempre apresenta o estoque atualizado
            System.out.println("Estoque atualizado:");
        }
        System.out.println(ped3);
        System.out.println(totalDoCarrinho);




    }
}
