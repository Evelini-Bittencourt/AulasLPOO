package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class FuncionariosController {
    public static void main(String[] args) {
        Funcionario g1= new Gerente();
        Funcionario g2=new Gerente("gerente1",2000.00);

        Funcionario d1= new Desenvolvedor();
        Funcionario d2=new Desenvolvedor("desenvolvedor2",2000.00);

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        g1.setNome("gerente1");
        g1.setSalario(1000.00);

        d1.setNome("desenvolvedor1");
        d1.setSalario(1000.00);

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("Funcionario: "+g1 + "Bonus: " +g1.getBonus());
        System.out.println("Funcionario: "+g2 + "Bonus: " +g2.getBonus());
        System.out.println("Funcionario: "+d1 + "Bonus: " +d1.getBonus());
        System.out.println("Funcionario: "+d2 + "Bonus: " +d2.getBonus());

        //g
        //i Não, pq ela é abstrata
        //ii Nas classes gerente e desenvolvedor, pq elas são as classes reais onde o domínio do problema está
        // sendo modelado
        Funcionario gg1= new GerenteGeral("gerentegeral1",6500.00);
        Funcionario gd1= new GerenteDesenvolvimento("gerentedesenvolvimento1",4500.00);

        Funcionario ds1= new DesenvolvedorSenior("desenvolvedorsenior1",3500.00);
        Funcionario ds2= new DesenvolvedorSenior("desenvolvedorsenior2",3500.00);
        Funcionario ds3= new DesenvolvedorSenior("desenvolvedorsenior3",3500.00);
        Funcionario ds4= new DesenvolvedorSenior("desenvolvedorsenior4",3500.00);
        Funcionario ds5= new DesenvolvedorSenior("desenvolvedorsenior5",3500.00);
        Funcionario ds6= new DesenvolvedorSenior("desenvolvedorsenior6",3500.00);

        Funcionario dp1= new DesenvolvedorPleno("desenvolvedorpleno1",2500.00);
        Funcionario dp2= new DesenvolvedorPleno("desenvolvedorpleno2",2500.00);
        Funcionario dp3= new DesenvolvedorPleno("desenvolvedorpleno3",2500.00);
        Funcionario dp4= new DesenvolvedorPleno("desenvolvedorpleno4",2500.00);
        Funcionario dp5= new DesenvolvedorPleno("desenvolvedorpleno5",2500.00);
        Funcionario dp6= new DesenvolvedorPleno("desenvolvedorpleno6",2500.00);

        Funcionario dj1= new DesenvolvedorJunior("desenvolvedorjunior1",1800.00);
        Funcionario dj2= new DesenvolvedorJunior("desenvolvedorjunior2",1800.00);
        Funcionario dj3= new DesenvolvedorJunior("desenvolvedorjunior3",1800.00);
        Funcionario dj4= new DesenvolvedorJunior("desenvolvedorjunior4",1800.00);
        Funcionario dj5= new DesenvolvedorJunior("desenvolvedorjunior5",1800.00);
        Funcionario dj6= new DesenvolvedorJunior("desenvolvedorjunior6",1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gg1);
        funcionarios.add(gd1);
        funcionarios.add(ds1);
        funcionarios.add(ds2);
        funcionarios.add(ds3);
        funcionarios.add(ds4);
        funcionarios.add(ds5);
        funcionarios.add(ds6);
        funcionarios.add(dp1);
        funcionarios.add(dp2);
        funcionarios.add(dp3);
        funcionarios.add(dp4);
        funcionarios.add(dp5);
        funcionarios.add(dp6);
        funcionarios.add(dj1);
        funcionarios.add(dj2);
        funcionarios.add(dj3);
        funcionarios.add(dj4);
        funcionarios.add(dj5);
        funcionarios.add(dj6);

        System.out.println("Lista de funcionarios: " +funcionarios);

        double folhasalarialCOMbonus=00.00;
        for (Funcionario f: funcionarios) {
            folhasalarialCOMbonus+=f.getSalario()+f.getBonus();
        }
        System.out.println("Folha salarial com bonus: " +folhasalarialCOMbonus);

        double folhasalarialSEMbonus=00.00;
        for (Funcionario f: funcionarios) {
            folhasalarialSEMbonus+=f.getSalario();
        }
        System.out.println("Folha salarial sem bonus: " +folhasalarialSEMbonus);

        System.out.println("\n\n\n");
        //sempre fazer as contas e colocar em uma variavel, não fazer direto.
        for(Funcionario f: funcionarios){
            double salarioBruto=f.getSalario()+f.getBonus();
            System.out.println("Nome: "+f.getNome());
            System.out.println("Salário: "+f.getSalario());
            System.out.println("Salário bruto: "+ salarioBruto);
            System.out.println("Bonus: "+ f.getBonus());
        }

        System.out.println("Folha salarial com reajuste de 5%: ");
        double folhasalarialReajustada= 00.00;
        for(Funcionario f: funcionarios){
            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
            folhasalarialReajustada+=f.getSalario()+f.getBonus();
        }
        System.out.println("Folha salarial com reajuste de 5%: "+folhasalarialReajustada);





    }
}
