package controller;

import model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Desenvolvedor 1", 1000.00);
        Desenvolvedor d2 = new Desenvolvedor("Desenvolvedor 2", 2000.00);
        Desenvolvedor d3 = new Desenvolvedor("Desenvolvedor 3", 3000.00);
        Desenvolvedor d4 = new Desenvolvedor("Desenvolvedor 4", 4000.00);
        Desenvolvedor d5 = new Desenvolvedor("Desenvolvedor 5", 5000.00);
        Desenvolvedor d6 = new Desenvolvedor("Desenvolvedor 6", 6000.00);

        Gerente g1 = new Gerente("Gerente 1", 1000.00, 100, "ticker1");
        Gerente g2 = new Gerente("Gerente 2", 2000.00, 200, "ticker2");
        Gerente g3 = new Gerente("Gerente 3", 3000.00, 300, "ticker3");
        Gerente g4 = new Gerente("Gerente 4", 4000.00, 400, "ticker4");
        Gerente g5 = new Gerente("Gerente 5", 5000.00, 500, "ticker5");
        Gerente g6 = new Gerente("Gerente 6", 6000.00, 600, "ticker6");

        Cliente c1 = new Cliente("Cliente 1", "sobrenome1", 100, "ticker1");
        Cliente c2 = new Cliente("Cliente 2", "sobrenome2", 200, "ticker2");
        Cliente c3 = new Cliente("Cliente 3", "sobrenome3", 300, "ticker3");
        Cliente c4 = new Cliente("Cliente 4", "sobrenome4", 400, "ticker4");
        Cliente c5 = new Cliente("Cliente 5", "sobrenome5", 500, "ticker5");
        Cliente c6 = new Cliente("Cliente 6", "sobrenome6", 600, "ticker6");

        System.out.println("Dsenvolvedores: " + d1 + "" + d2 + d3 + d4 + d5 + d6);
        System.out.println("Gerentes: " + g1 + "" + g2 + g3 + g4 + g5 + g6);
        System.out.println("Clientes: " + c1 + "" + c2 + c3 + c4 + c5 + c6);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);
        investidores.add(g4);
        investidores.add(g5);
        investidores.add(g6);
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);

        System.out.println("Lista de investidores: " + investidores);
        System.out.println("Lista de funcionarios: " + funcionarios);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("Lista de funcionarios ordenados por salário(decrescente): " + funcionarios);

        investidores.sort(Comparator.comparing(Investidor::getQdeCotas).reversed());
        System.out.println("Lista de clientes ordenados por quantidade de cotas(decrescente) com for i: ");
        for (Investidor i : investidores) {
            if (i instanceof Cliente) {
                System.out.println(i);
            }
        }
        //forEach
        System.out.println("Lista de clientes ordenados por quantidade de cotas(decrescente) com forEach: ");
        investidores.forEach(i -> {
            if (i instanceof Cliente) {
                System.out.print(i);
            }
        });
        System.out.println("\n\nLista de investidores ordenados por quantidade de cotas(decrescente): " + investidores);

        //encontrando o maior valor com a Ccllections
        Funcionario fMaiorSalario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        System.out.println("\n\nFuncionario(s) com maior salário: ");

        funcionarios.forEach(f -> {
            if (f.getSalario() >= fMaiorSalario.getSalario()) {
                System.out.println(f);
            }

        });
        Investidor iMaiorQdeCotas = Collections.max(investidores, Comparator.comparing(Investidor::getQdeCotas));
        System.out.println("\n\nInvestidor(s) com maior quantidade de cotas: ");
        investidores.forEach(i -> {
            if (i.getQdeCotas() >= iMaiorQdeCotas.getQdeCotas()) {
                System.out.println(i);
            }
        });

    }
}