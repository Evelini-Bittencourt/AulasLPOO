package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SociosController {
    public static void main(String[] args) {
        ClientePessoaJuridica cpj1= new ClientePessoaJuridica(100,1000.0,"clienteCPJ1","sobrenomeCPJ1","emailCPJ1","cnpjCPJ1");
        ClientePessoaJuridica cpj2= new ClientePessoaJuridica(200,2000.0,"clienteCPJ2","sobrenomeCPJ2","emailCPJ2","cnpjCPJ2");

        ClientePessoaFisica cpf1= new ClientePessoaFisica(100,1000.0,"nomeCPF1","sobrenomeCPF1","emailPF1","cpfPF1");
        ClientePessoaFisica cpf2= new ClientePessoaFisica(200,2000.0,"nomeCPF2","sobrenomeCPF2","emailPF2","cpfPF2");

        Gerente g1= new Gerente(100,1000.0,"nomeG1","sobrenomeG1", 1000.0,1);
        Gerente g2= new Gerente(200,2000.0,"nomeG2","sobrenomeG2", 2000.0,2);

        Vendedor v1= new Vendedor(100,1000.0,"nomeV1","sobrenomeV1", 1000.0,1);
        Vendedor v2= new Vendedor(200,2000.0,"nomeV2","sobrenomeV2", 2000.0,2);

        System.out.println("Clientes criados: "+"\n"+cpj1+cpj2+cpf1+cpf2);
        System.out.println("Funcionarios criados: "+"\n"+g1+g2+v1+v2);

        List<Socio> socios= new ArrayList<Socio>();
        socios.add(cpj1);
        socios.add(cpf2);
        socios.add(cpj2);
        socios.add(cpf1);
        socios.add(g1);
        socios.add(g2);
        socios.add(v1);
        socios.add(v2);

        System.out.println("Socios List: "+"\n"+socios);

        socios.sort(Comparator.comparing(Socio::getQuantidadeDeAcoes).reversed());
        System.out.println("\nSocios List ordenada: "+"\n"+socios);

        int Qpf1=0;
        int qv=0;
        for(Socio s:socios){
            if(s instanceof Vendedor){
                qv++;
            }else if(s instanceof ClientePessoaFisica){
                Qpf1++;
            }
        }
        System.out.println("\nQuantidade de ClientesPessoaFisica: "+Qpf1);
        System.out.println("\nQuantidade de Vendedores: "+qv);

        System.out.println("\nGerentes:");
        socios.forEach(s->{
            if(s instanceof Gerente){
                System.out.println(s);
            }
        });





    }
}
