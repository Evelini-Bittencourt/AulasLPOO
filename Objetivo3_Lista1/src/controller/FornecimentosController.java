package controller;

import exception.NaoPossuiNumeroDeTelefone;
import exception.NaoPossuiNumeroDeTelefoneVerificada;
import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecimentosController {
    public static void main(String[] args) {
        List<Produto> produtosList= new ArrayList<>();
        List<Fornecedor> fornecedoresList= new ArrayList<>();
        //o que criar primeiro?
        //se eu crio um fornecedor, falta os produtos, e se eu crio os produtos falta o fornecedor????????

        Fornecedor f1= new Fornecedor();
        fornecedoresList.add(f1);

        Produto p1= new Produto("skup1","nomep1","descricaop1",100, BigDecimal.valueOf(10.00),BigDecimal.valueOf(20.00),fornecedoresList);
        Produto p2= new Produto("skup2","nomep2","descricaop2",200, BigDecimal.valueOf(20.00),BigDecimal.valueOf(40.00),fornecedoresList);
        produtosList.add(p1);
        produtosList.add(p2);

        Fornecimento forn1=new Fornecimento(LocalDateTime.now(),100,(p1.getPrecoDeCusto().multiply(BigDecimal.valueOf(100))),p1,f1);
        Fornecimento forn2=new Fornecimento(LocalDateTime.now(),200,(p2.getPrecoDeCusto().multiply(BigDecimal.valueOf(200))),p2,f1);

        List<Fornecimento> fornecimentosList= new ArrayList<>();
        fornecimentosList.add(forn1);
        fornecimentosList.add(forn2);

        BigDecimal total=BigDecimal.ZERO;
        for (Fornecimento f:fornecimentosList){
            total=total.add(f.getTotal());
        }

        System.out.println("Relatório de Fornecimentos:"+"\n"+fornecimentosList);
        System.out.println("Total: "+"\n"+total);

//        Exercício de exceções:
//
//        1. A partir do diagrama Produto-Fornecedor-Fornecimento da Lista de Exercícios 1 do Objetivo 3, faça o que se pede:
//        a. Crie uma classe de exceção do tipo Não Verificada e lance essa exceção quando, ao registrar um Fornecimento, o Fornecedor
//           não possuir um número de telefone (ele seja null ou ""). Faça a lógica necessária para que a aplicação lance a exceção.
//        b. Agora crie uma classe de exceção do tipo Verificada e lance a exceção quando as mesmas condições apresentadas no item "a"
//           acontecerem.
//        c. Para testar o lançamento das exceções, faça as chamadas no controlador. Teste a Exceção Não Verificada primeiro, comente
//            o código, e teste a Exceção Verificada.

        Fornecedor f2= new Fornecedor("cnpjf2","razãosocialf2","nomefantasiaf2","emailf2",null,null);
        Fornecimento forn3=new Fornecimento(LocalDateTime.now(),200,(p2.getPrecoDeCusto().multiply(BigDecimal.valueOf(200))),p2,f2);
        System.out.println("\n\n"+f2);

        if (forn3.getFornecedor().getTelefone()==null || forn3.getFornecedor().getTelefone()==""){
            throw new NaoPossuiNumeroDeTelefone("O frornecedor não possui numero de telefone");
        }

        //NÃO ENTENDI O TRY CATCH!!
        //O que seria tratar a exceção????
        Fornecedor f3= new Fornecedor("cnpjf2","razãosocialf2","nomefantasiaf2","emailf2",null,null);
        Fornecimento forn4=new Fornecimento(LocalDateTime.now(),200,(p2.getPrecoDeCusto().multiply(BigDecimal.valueOf(200))),p2,f3);
        if(forn4.getFornecedor().getTelefone()==null || forn4.getFornecedor().getTelefone()==""){
            try {
                throw new NaoPossuiNumeroDeTelefoneVerificada("O frornecedor não possui numero de telefone");
            }catch (NaoPossuiNumeroDeTelefoneVerificada e){
                e.printStackTrace();
            }
        }


    }
}
