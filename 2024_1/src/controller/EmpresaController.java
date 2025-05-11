package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        ClientePessoaFisica clientePF1= new ClientePessoaFisica("clientePF1","sobrenomePF1","emailPF1",1000.00,100,"cpfPF1");
        ClientePessoaFisica clientePF2= new ClientePessoaFisica("clientePF2","sobrenomePF2","emailPF2",2000.00,200,"cpfPF2");

        ClientePessoaJuridica clientePJ1= new ClientePessoaJuridica("clientePJ1","sobrenomePJ1","emailPJ1",1000.00,100,"cnpjPJ1");
        ClientePessoaJuridica clientePJ2= new ClientePessoaJuridica("clientePJ2","sobrenomePJ2","emailPJ2",2000.00,200,"cnpjPJ2");

        Gerente g1= new Gerente("gerente1","sobrenomeG1",1000.00,1000.00,100,1);
        Gerente g2= new Gerente("gerente2","sobrenomeG2",2000.00,2000.00,200,2);

        Vendedor v1= new Vendedor("vendedor1","sobrenomeV1",1000.00,1000.00,100,1);
        Vendedor v2= new Vendedor("vendedor2","sobrenomeV2",2000.00,2000.00,200,2);

        System.out.println("Clientes criados:"+"\n"+clientePF1+clientePF2+clientePJ1+clientePJ2);
        System.out.println("\nFuncionários criados:"+"\n"+g1+g2+v1+v2);

        List<Socio> socios = new ArrayList<>();
        socios.add(clientePF1);
        socios.add(clientePF2);
        socios.add(clientePJ1);
        socios.add(clientePJ2);
        socios.add(g1);
        socios.add(g2);
        socios.add(v1);
        socios.add(v2);

        List<Funcionario> funcionarios= new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(v1);
        funcionarios.add(v2);

        List<Cliente> clientes= new ArrayList<>();
        clientes.add(clientePF1);
        clientes.add(clientePF2);
        clientes.add(clientePJ1);
        clientes.add(clientePJ2);

        System.out.println("\nLista de socios: "+"\n"+ socios);
        System.out.println("\nLista de funcionarios: "+"\n"+funcionarios);
        System.out.println("\nLista de clientes: "+"\n"+clientes);
        //é mais correto colocar decimal aqui e converter no model ou colocar double aqui????

        v1.setSalario(3000.00);
        v1.setTaxaDeComissao(5);

        v2.setSalario(3000.00);
        v2.setTaxaDeComissao(5);

        g1.setSalario(12000.00);
        g1.setTaxaDeBonificacao(2);

        g2.setSalario(12000.00);
        g2.setTaxaDeBonificacao(2);
        System.out.println("\nLista de funcionarios após reajustes de salario e bonificação/comissão: "+"\n"+funcionarios);

        double folhaSalarial=00.00;
        //forEach não aceita acumulador declarado externamente,
        // só se for clacular  alguma coisa dentro(a cada coclo), como slario bruto
        // funcionarios.forEach(f ->{
        //    folhaSalarial += f.getSalario();
        //});
        for(Funcionario f: funcionarios){
            folhaSalarial += f.getSalario();
        }
        System.out.println("\nFolha salarial: "+folhaSalarial);

        double custoDaEmpresa=00.00;
        for(Funcionario f: funcionarios){
            if(f instanceof Gerente){
                custoDaEmpresa += f.getSalario()+(((Gerente) f).getTaxaDeBonificacao()*1000000.00);
            }else if(f instanceof Vendedor){
                custoDaEmpresa += f.getSalario()+(((Vendedor) f).getTaxaDeComissao()*500000.00);
            }
        }
        System.out.println("\nCusto da empresa: "+custoDaEmpresa);

        clientePF1.setQuantidadeDeAcoes(700);
        clientePF2.setQuantidadeDeAcoes(1000);
        clientePJ1.setQuantidadeDeAcoes(1500);
        clientePJ2.setQuantidadeDeAcoes(2000);
        g1.setQuantidadeDeAcoes(100);
        g2.setQuantidadeDeAcoes(900);
        v1.setQuantidadeDeAcoes(40);
        v2.setQuantidadeDeAcoes(400);

        socios.sort(Comparator.comparing(Socio::getQuantidadeDeAcoes));
        System.out.println("\nLista de socios ordenada por quantidade de ações: "+"\n"+socios);

        clientes.sort(Comparator.comparing(Cliente::getNome));
        System.out.println("\nLista de clientes ordenada por nome: "+"\n"+clientes);

        int QdeAcoes=0;
        for(Socio s: socios){
            QdeAcoes += s.getQuantidadeDeAcoes();
        }
        double valorDeMercado=QdeAcoes*10;
        System.out.println("\nValor de mercado: "+valorDeMercado);

        int maiorQdeAcoes= Collections.max(socios,Comparator.comparing(Socio::getQuantidadeDeAcoes)).getQuantidadeDeAcoes();

        System.out.println("\nSocio(s) com maior quantidade de ações: "+"\n");
        socios.forEach(s -> {
            if(s.getQuantidadeDeAcoes() >= maiorQdeAcoes){
                System.out.println(s);
            }
        });
    }
}
