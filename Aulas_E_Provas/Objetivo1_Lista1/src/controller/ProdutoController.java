package controller;

import model.Funcionario;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto p1= new Produto();
        Produto p2=new Produto();

        Produto p3=new Produto(3,"nome3", "descricao3", 3000.00, 3);
        Produto p4=new Produto(4,"nome4", "descricao4", 4000.00, 4);

        Produto p5=new Produto(5,"nome5");
        Produto p6=new Produto(6,"nome6");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        p1.setId(1);
        p1.setNome("nome1");
        p1.setDescricao("descricao1");
        p1.setValor(1000.00);
        p1.setEstoque(1);

        p2.setId(2);
        p2.setNome("nome2");
        p2.setDescricao("descricao2");
        p2.setValor(2000.00);
        p2.setEstoque(2);

       p3.setId(3);
       p3.setNome("nome3");
       p3.setDescricao("descricao3");
       p3.setValor(3000.00);
       p3.setEstoque(3);

       p4.setId(4);
       p4.setNome("nome4");
       p4.setDescricao("descricao4");
       p4.setValor(4000.00);
       p4.setEstoque(4);

       p5.setId(5);
       p5.setNome("nome5");
       p5.setDescricao("descricao5");
       p5.setValor(5000.00);
       p5.setEstoque(5);

       p6.setId(6);
       p6.setNome("nome6");
       p6.setDescricao("descricao6");
       p6.setValor(6000.00);
       p6.setEstoque(6);

        System.out.println(p1.getId());
        System.out.println(p1.getNome());
        System.out.println(p1.getDescricao());
        System.out.println(p1.getValor());
        System.out.println(p1.getEstoque());

        System.out.println(p2.getId());
        System.out.println(p2.getNome());
        System.out.println(p2.getDescricao());
        System.out.println(p2.getValor());
        System.out.println(p2.getEstoque());

        System.out.println(p3.getId());
        System.out.println(p3.getNome());
        System.out.println(p3.getDescricao());
        System.out.println(p3.getValor());
        System.out.println(p3.getEstoque());

        System.out.println(p4.getId());
        System.out.println(p4.getNome());
        System.out.println(p4.getDescricao());
        System.out.println(p4.getValor());
        System.out.println(p4.getEstoque());

        System.out.println(p5.getId());
        System.out.println(p5.getNome());
        System.out.println(p5.getDescricao());
        System.out.println(p5.getValor());
        System.out.println(p5.getEstoque());

        System.out.println(p6.getId());
        System.out.println(p6.getNome());
        System.out.println(p6.getDescricao());
        System.out.println(p6.getValor());
        System.out.println(p6.getEstoque());

       List<Produto> produtosList = new ArrayList<>();
       produtosList.add(p1);
       produtosList.add(p2);
       produtosList.add(p3);
       produtosList.add(p4);
       produtosList.add(p5);
       produtosList.add(p6);

       Map<Integer,Produto> produtosMap= new HashMap<>();
       produtosMap.put(p1.getId(),p1);
       produtosMap.put(p2.getId(),p2);
       produtosMap.put(p3.getId(),p3);
       produtosMap.put(p4.getId(),p4);
       produtosMap.put(p5.getId(),p5);
       produtosMap.put(p6.getId(),p6);

       System.out.println("Coleção List" +produtosList);
       System.out.println("Coleção Map" +produtosMap);

       produtosList.sort(Comparator.comparing(Produto::getId).reversed());
       System.out.println("Coleção List Ordenada decrscente" +produtosList);

       //precisa ordenar para pesquisar principalmente para binarySearch
        produtosList.sort(Comparator.comparing(Produto::getId));

        //pesquisa por força bruta
        for(Produto p:produtosList){
            if(p.getId()==3){
                System.out.println("Produto com id 3" +p);
            }
        }
        //pesquisa por binarySearch
        System.out.println(produtosList.get(
                Collections.binarySearch(
                        produtosList,
                        new Produto(3,"nome3"),
                        Comparator.comparing(Produto::getId)
                )
        ));
        //map não aceita ordenação e nem outros tipos de pesquisa além dessa
        //pesquisa na map
        System.out.println("Pesquisa na map"+produtosMap.get(3));



    }
}
