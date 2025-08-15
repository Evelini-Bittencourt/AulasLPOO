package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro c1= new Carro();
        Carro c2=new Carro();

        Carro c3=new Carro(1,"Ferrari", "Ferrari", 2020 );
        Carro c4=new Carro(2,"<NAME>", "Lamborghini", 2010 );

        Carro c5=new Carro(1,"Corsa");
        Carro c6=new Carro(2,"Ferrari");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        c1.setId(1);
        c1.setModelo("modelo1");
        c1.setMarca("marca1");
        c1.setAnoFabricacao(2021);

        c2.setId(2);
        c2.setModelo("modelo2");
        c2.setMarca("marca2");
        c2.setAnoFabricacao(2022);

        c3.setId(3);
        c3.setModelo("modelo3");
        c3.setMarca("marca3");
        c3.setAnoFabricacao(2023);

        c4.setId(4);
        c4.setModelo("modelo4");
        c4.setMarca("marca4");
        c4.setAnoFabricacao(2024);

        c5.setId(5);
        c5.setModelo("modelo5");
        c5.setMarca("marca5");
        c5.setAnoFabricacao(2025);

        c6.setId(6);
        c6.setModelo("modelo6");
        c6.setMarca("marca6");
        c6.setAnoFabricacao(2026);

        System.out.println(c1.getId());
        System.out.println(c1.getModelo());
        System.out.println(c1.getMarca());
        System.out.println(c1.getAnoFabricacao());

        System.out.println(c2.getId());
        System.out.println(c2.getModelo());
        System.out.println(c2.getMarca());
        System.out.println(c2.getAnoFabricacao());

        System.out.println(c3.getId());
        System.out.println(c3.getModelo());
        System.out.println(c3.getMarca());
        System.out.println(c3.getAnoFabricacao());

        System.out.println(c4.getId());
        System.out.println(c4.getModelo());
        System.out.println(c4.getMarca());
        System.out.println(c4.getAnoFabricacao());

        System.out.println(c5.getId());
        System.out.println(c5.getModelo());
        System.out.println(c5.getMarca());
        System.out.println(c5.getAnoFabricacao());

        System.out.println(c6.getId());
        System.out.println(c6.getModelo());
        System.out.println(c6.getMarca());
        System.out.println(c6.getAnoFabricacao());

        List<Carro> carrosList= new ArrayList<>();
        carrosList.add(c1);
        carrosList.add(c2);
        carrosList.add(c3);
        carrosList.add(c4);
        carrosList.add(c5);
        carrosList.add(c6);

        Map<Integer, Carro> carrosMap= new HashMap<>();
        carrosMap.put(c1.getId(), c1);
        carrosMap.put(c2.getId(), c2);
        carrosMap.put(c3.getId(), c3);
        carrosMap.put(c4.getId(), c4);
        carrosMap.put(c5.getId(), c5);
        carrosMap.put(c6.getId(), c6);

        System.out.println("Coleção List" +carrosList);
        System.out.println("Coleção Map" +carrosMap);

        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("Coleção List Ordenada decescente" +carrosList);

        //precisa ordenar para pesquisar principalmente para binarySearch
        carrosList.sort(Comparator.comparing(Carro::getId));

        //pesquisa por força bruta
        for(Carro c:carrosList){
            if(c.getId()==3){
                System.out.println("Carro com id 3" +c);
            }
        }
        //pesquisa por binarySearch
        System.out.println(carrosList.get(
                Collections.binarySearch(
                        carrosList,
                        new Carro(3,"modelo3"),
                        Comparator.comparing(Carro::getId)
                )
        ));
        //map não aceita ordenação e nem outros tipos de pesquisa além dessa
        //pesquisa na map
        System.out.println("Pesquisa na map"+carrosMap.get(3));







    }
}
