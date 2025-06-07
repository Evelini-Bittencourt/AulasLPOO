package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario(11L,"cpff1","nomef1","sobrenomef1", LocalDateTime.now());
        Funcionario f2= new Funcionario(22L,"cpff2","nomef2","sobrenomef2", LocalDateTime.now());

        List<Funcionario> funcionariosList= new ArrayList<>();
        funcionariosList.add(f1);
        funcionariosList.add(f2);


        Empresa e1= new Empresa("cnpje1","razaosociale1","nomefantasiae1",funcionariosList);

        funcionariosList.sort(Comparator.comparing(Funcionario::getNome));

        System.out.println("Funcionarios da empresa: "+"\n"+funcionariosList);

        //perguntar sobre isso

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);

        System.out.println("\n\nLista de Funcionários por Empresa (critério nome)");
        System.out.print("\nEmpresa " + e1.getNomeFantasia());
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);

    }
}
