package controller;

import exeption.FaltaCadastrarSalaDaSessao;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Questao1Controller {
    public static void main(String[] args) throws FaltaCadastrarSalaDaSessao{
        Assento assento1 = new Assento("fila1","numero1",null);
        Sala sala1= new Sala(1,200,List.of(assento1),null);
        Genero genero1= new Genero("descricaogenero1",null);
        Ator ator1= new Ator("nomecompletoator1",null);
        Atua atuacao1= new Atua("papel1",null,ator1);
        Filme filme1= new Filme("titulofilme1", LocalTime.parse("01:45", DateTimeFormatter.ofPattern("HH:mm")),null,genero1,List.of(atuacao1));
        Sessao sessao1= new Sessao(LocalDateTime.parse("01/01/2023 18:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), BigDecimal.valueOf(43.00),BigDecimal.valueOf(21.00),sala1,Situacao.FECHADA,null,filme1);
        Ingresso ingresso1= new Ingresso("1",sessao1);
        System.out.println(ingresso1);

        Sessao sessao2= new Sessao();
        if(sessao2.getSala()==null){
            throw new FaltaCadastrarSalaDaSessao("Falta Cadastrar Sala Da Sessao");
        }else{
            Ingresso ingresso2= new Ingresso("1",sessao2);
        }


    }
}
