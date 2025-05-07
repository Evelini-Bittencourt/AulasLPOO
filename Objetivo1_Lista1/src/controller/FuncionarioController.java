package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario();
        Funcionario f2=new Funcionario();

        Funcionario f3=new Funcionario(3,"nome3",3000.00);
        Funcionario f4=new Funcionario(4,"nome4",4000.00);

        Funcionario f5=new Funcionario(5,"nome5");
        Funcionario f6=new Funcionario(6,"nome6");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        f1.setId(1);
        f1.setNome("nome1");
        f1.setSalario(1000.00);

        f2.setId(2);
        f2.setNome("nome2");
        f2.setSalario(2000.00);

        f3.setId(3);
        f3.setNome("nome3");
        f3.setSalario(3000.00);

        f4.setId(4);
        f4.setNome("nome4");
        f4.setSalario(4000.00);

        f5.setId(5);
        f5.setNome("nome5");
        f5.setSalario(5000.00);

        System.out.println(f1.getId());
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());

        System.out.println(f2.getId());
        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());

        System.out.println(f3.getId());
        System.out.println(f3.getNome());
        System.out.println(f3.getSalario());

        System.out.println(f4.getId());
        System.out.println(f4.getNome());
        System.out.println(f4.getSalario());

        System.out.println(f5.getId());
        System.out.println(f5.getNome());
        System.out.println(f5.getSalario());

        System.out.println(f6.getId());
        System.out.println(f6.getNome());
        System.out.println(f6.getSalario());

        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(f1);
        funcionariosList.add(f2);
        funcionariosList.add(f3);
        funcionariosList.add(f4);
        funcionariosList.add(f5);
        funcionariosList.add(f6);

        Map<Integer,Funcionario> funcionariosMap= new HashMap<>();
        funcionariosMap.put(f1.getId(),f1);
        funcionariosMap.put(f2.getId(),f2);
        funcionariosMap.put(f3.getId(),f3);
        funcionariosMap.put(f4.getId(),f4);
        funcionariosMap.put(f5.getId(),f5);
        funcionariosMap.put(f6.getId(),f6);

        System.out.println("Coleção List" +funcionariosList);
        System.out.println("Coleção Map" +funcionariosMap);

        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("Coleção List Ordenada decescente" +funcionariosList);

        //precisa ordenar para pesquisar principalmente para binarySearch
        funcionariosList.sort(Comparator.comparing(Funcionario::getId));

        //pesquisa por força bruta
        for(Funcionario f:funcionariosList){
            if(f.getId()==3){
                System.out.println("Funcionario com id 3" +f);
            }
        }
        //pesquisa por binarySearch
        System.out.println(funcionariosList.get(
                Collections.binarySearch(
                        funcionariosList,
                        new Funcionario(3,"nome3"),
                        Comparator.comparing(Funcionario::getId)
                )
        ));
        //map não aceita ordenação e nem outros tipos de pesquisa além dessa
        //pesquisa na map
        System.out.println("Pesquisa na map"+funcionariosMap.get(3));



    }
}
