package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UberController {
    public static void main(String[] args) {
        //perguntar sore deixar os atributos das associações de fora dos construtores.
        Usuario u1= new Usuario("nomeu1","emailu1","telefoneu1");
        Motorista m1= new Motorista("nomem1","emailm1","telefonem1");
        Veiculo v1= new Veiculo("placav1","renavamv1","faabricantev1","modelov1",2020,m1);

        Corrida c1= new Corrida(BigDecimal.valueOf(10.00), LocalDateTime.now(),LocalDateTime.now(),u1,m1,FormaDePagamento.CARTAO_DEBITO, Situacao.AGENDADA);
        Corrida c2= new Corrida(BigDecimal.valueOf(20.00), LocalDateTime.now(),LocalDateTime.now(),u1,m1,FormaDePagamento.PIX, Situacao.FATURADA);

         List<Corrida> corridasList= new ArrayList<>();
         corridasList.add(c1);
         corridasList.add(c2);

        corridasList.sort(Comparator.comparing(Corrida::getValor).reversed());
         for(Corrida c: corridasList){
             if (c.getUsuario().equals(u1)) {
                 System.out.println(c);
             }
         }

         corridasList.sort(Comparator.comparing(Corrida::getDataInicio));
         for(Corrida c: corridasList){
             if(c.getMotorista().equals(m1)){
                 System.out.println(c);
             }
         }
         BigDecimal total=BigDecimal.ZERO;

         for(Corrida c: corridasList){
             if(c.getMotorista().equals(m1)){
                 total=total.add(c.getValor());
             }
         }
        System.out.println("\n"+m1+"  Total das corridas: "+total);
    }
}
