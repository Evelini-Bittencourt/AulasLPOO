package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta c1= new Conta();
        Conta c2=new Conta();

        Conta c3=new Conta(300.00,3);
        Conta c4=new Conta(400.00,4);

        Conta c5=new Conta(5);
        Conta c6=new Conta(6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        c1.setId(1);
        c1.setSaldo(1000.00);

        c2.setId(2);
        c2.setSaldo(2000.00);

        c3.setId(3);
        c3.setSaldo(3000.00);

        c4.setId(4);
        c4.setSaldo(4000.00);

        c5.setId(5);
        c5.setSaldo(5000.00);

        c6.setId(6);
        c6.setSaldo(6000.00);

        System.out.println(c1.getId());
        System.out.println(c1.getSaldo());

        System.out.println(c2.getId());
        System.out.println(c2.getSaldo());

        System.out.println(c3.getId());
        System.out.println(c3.getSaldo());

        System.out.println(c4.getId());
        System.out.println(c4.getSaldo());

        System.out.println(c5.getId());
        System.out.println(c5.getSaldo());

        System.out.println(c6.getId());
        System.out.println(c6.getSaldo());

        List<Conta> contasList =new ArrayList<>();
        contasList.add(c1);
        contasList.add(c2);
        contasList.add(c3);
        contasList.add(c4);
        contasList.add(c5);
        contasList.add(c6);

        Map<Integer,Conta> contasMap=new HashMap<>();
        contasMap.put(c1.getId(),c1);
        contasMap.put(c2.getId(),c2);
        contasMap.put(c3.getId(),c3);
        contasMap.put(c4.getId(),c4);
        contasMap.put(c5.getId(),c5);
        contasMap.put(c6.getId(),c6);

        System.out.println("Coleção List" +contasList);
        System.out.println("Coleção Map" +contasMap);

        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("Coleção List Ordenada decescente" +contasList);

        //precisa ordenar para pesquisar principalmente para binarySearch
        contasList.sort(Comparator.comparing(Conta::getId));

        //pesquisa por força bruta
        for(Conta c:contasList){
            if(c.getId()==3){
                System.out.println("Conta com id 3" +c);
            }
        }
        //pesquisa por binarySearch
        System.out.println(contasList.get(
                Collections.binarySearch(
                        contasList,
                        new Conta(3),
                        Comparator.comparing(Conta::getId)
                )
        ));
        //map não aceita ordenação e nem outros tipos de pesquisa além dessa
        //pesquisa na map
        System.out.println("Pesquisa na map"+contasMap.get(3));






    }
}
