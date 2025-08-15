package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        Cliente c1= new Cliente("João", 1000);
        Cliente c2= new Cliente("Maria", 2000);
        Cliente c3= new Cliente("Pedro", 3000);

        ContaCorrente cc1= new ContaCorrente(1000.00,1000);
        ContaCorrente cc2= new ContaCorrente(2000.00,2000);
        ContaCorrente cc3= new ContaCorrente(3000.00,3000);

        ContaPoupanca cp1= new ContaPoupanca(1000.00);
        ContaPoupanca cp2= new ContaPoupanca(2000.00);
        ContaPoupanca cp3= new ContaPoupanca(3000.00);

        System.out.println("\nContas corrente: "+"\n"+cc1+"\n"+cc2+"\n"+cc3);
        System.out.println("\nContas poupanca: "+"\n"+cp1+"\n"+cp2+"\n"+cp3);
        System.out.println("\nClientes: "+"\n"+c1+"\n"+c2+"\n"+c3);

        List<Conta> contas= new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);

        List<Associado> associados= new ArrayList<>();
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);

        System.out.println("\nLista de associados: "+"\n"+associados);
        System.out.println("\nLista de contas: "+"\n"+contas);

        System.out.println("\nConta poupança antes de ser movimentada: "+cp1);
        cp1.deposita(1000.00);
        cp1.atualiza(5);
        cp1.saca(1000.00);
        System.out.println("\nConta poupança depois de ser movimentada: "+cp1);

        c1.setQdeCotas(100);
        c2.setQdeCotas(400);
        c3.setQdeCotas(600);
        cc1.setQdeCotas(300);
        cc2.setQdeCotas(600);
        cc3.setQdeCotas(600);
        System.out.println("\nLista de associados: "+"\n"+associados);

        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("\nLista de associados ordenada por quantidade de cotas(decrescente): "+"\n"+associados);

        System.out.println("\nAssociado(os) com maior quantidade de cotas: \n");
        int aMaiorQdeCotas= Collections.max(associados,Comparator.comparing(Associado::getQdeCotas)).getQdeCotas();
        associados.forEach(a -> {
            if(a.getQdeCotas() >= aMaiorQdeCotas){
                System.out.println(a);
            }
        });
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nLista de contas ordenadas por saldo(decrescente): "+"\n"+contas);

        System.out.println("\nAssociados com conta cadastrada: ");
        associados.forEach(a ->{
            if(a instanceof ContaCorrente){
                System.out.println(a);
            }
        });
        System.out.println("Conta(s) com maior saldo: ");
        double MaiorSaldo= Collections.max(contas,Comparator.comparing(Conta::getSaldo)).getSaldo();
        contas.forEach(c -> {
            if(c.getSaldo() >= MaiorSaldo){
                System.out.println(c);
            }
        });

    }
}
