package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        //esse metodo deve ser usado quando é um long
        Instant instant= Instant.ofEpochMilli(1723066578101L);
        //pq isso??
//        LocalDateTime data= LocalDateTime.ofInstant(instant, ZoneId.of("UTC-0"));
//        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("UTC-0"))));

        System.out.println("\n\n************ b ************");
        //Não funciona. Por que???
        // data=LocalDateTime.ofInstant(instant, ZoneId.of("UTC+1"));
    //System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data.atZone(ZoneId.of("UTC-3"))));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("UTC-3"))));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("UTC+1"))));

        System.out.println("\n\n************ c ************");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("America/Sao_Paulo"))));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("Europe/Paris"))));
        //Sim, se os paises estiverem em horário de verão Europe/Paris e America/Sao_Paulo vão estar uma hora a frente de UTC-3 e UTC+1

        System.out.println("\n\n************ d ************");
        //pq precisa colocar em uma string??????
        //String dataString="07/08/2024";
        LocalDate data=LocalDate.parse("07/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data));

        System.out.println("\n\n************ e ************");
        //Pq esse não deu erro???
        LocalTime hora= LocalTime.parse("14:05");
        System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(hora));

        System.out.println("\n\n************ f ************");
        LocalDate data1=LocalDate.parse("07/09/1822",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data2=LocalDate.now();
        Period periodo=Period.between(data1,data2);
        System.out.println(periodo);
        //esse tipo de saida não funciona com println
        System.out.printf("Saida formatada: %s anos, %s meses, %s dias",periodo.getYears(),periodo.getMonths(),periodo.getDays());

        System.out.println("\n\n************ g ************");
        Instant inicio=Instant.parse("2024-08-07T21:50:41Z");
        Instant fim=Instant.parse("2024-08-07T21:50:44Z");
        Duration duracao=Duration.between(inicio,fim);
        System.out.println(duracao);
        System.out.printf("Saida formatada: %ss",duracao.getSeconds());

        System.out.println("\n\n************ h ************");
        //ele fez o negocio da string de novo. PQ?????
        LocalDateTime datah=LocalDateTime.parse("12/06/2014 17:00",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(datah));

        System.out.println("\n\n************ i ************");
        System.out.println("\n\n************ a ************");
        Produto p1=new Produto();
        p1.setPrecoDeCusto(BigDecimal.valueOf(10.00));
        p1.setQuantidade(0);
        Fornecedor f1=new Fornecedor();
        p1.setFornecedores(List.of(f1));
        //não deveria aumentar a quantidade  de produtos???
        Fornecimento forn1=new Fornecimento(LocalDateTime.now(),100, p1.getPrecoDeCusto().multiply(BigDecimal.valueOf(100)),p1,f1);
        System.out.println(forn1);

        System.out.println("\n\n************ b ************");
        Fornecimento forn2=new Fornecimento(LocalDateTime.now().minusDays(30L),100, p1.getPrecoDeCusto().multiply(BigDecimal.valueOf(100)),p1,f1);
        System.out.println(forn2);

        System.out.println("\n\n************ c ************");
        Fornecimento forn3=new Fornecimento(LocalDateTime.now().minusDays(60L),100, p1.getPrecoDeCusto().multiply(BigDecimal.valueOf(100)),p1,f1);
        System.out.println(forn3);

        System.out.println("\n\n************ d ************");
        double acumulador=0.0;
        List<Fornecimento> fornecimentos=List.of(forn1,forn2,forn3);
        for (Fornecimento fornecimento : fornecimentos) {
            if (fornecimento.getData().isAfter(LocalDateTime.now().minusDays(31L))) {
                acumulador+=fornecimento.getValor().doubleValue();
                System.out.println(fornecimento);
            }
        }
        System.out.println("Total: "+acumulador);
        System.out.println("\n\n************ e ************");
        acumulador=0.0;
        for (Fornecimento fornecimento : fornecimentos) {
            if (fornecimento.getData().isAfter(LocalDateTime.now().minusDays(61L))) {
                acumulador+=fornecimento.getValor().doubleValue();
                System.out.println(fornecimento);
            }
        }
        System.out.println("Total: "+acumulador);

        //exercicios criados pelo gpt pra treinar
//        Crie um programa que:
//
//        Receba o Instant com valor 1700000000000L;
//
//        Converta e imprima a data e hora no formato dd/MM/yyyy HH:mm em:
//
//        UTC-0
//
//        UTC-3
//
//        UTC+2
        Instant instancia=Instant.ofEpochMilli(1700000000000L);
        LocalDateTime data5= LocalDateTime.ofInstant(instancia,ZoneId.of("UTC-0"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data5));

        //mudo a variavel de zona e a imprimo
        data5= LocalDateTime.ofInstant(instancia,ZoneId.of("UTC-3"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data5));
        //imprimo na zona certa, mas sem formatação
        System.out.println(instancia.atZone(ZoneId.of("UTC-3")));
        //melhor jeito:
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("UTC-3"))));

        data5= LocalDateTime.ofInstant(instancia,ZoneId.of("UTC+2"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data5));

//        Utilizando o mesmo Instant do exercício anterior, imprima a data/hora nas zonas:
//
//        "America/Sao_Paulo"
//
//        "Europe/Berlin"
//
//→ Em um comentário, responda: Há diferença entre UTC-3 e America/Sao_Paulo nesse instante? Por quê?
        //sim, quando está no horário de verão America/Sao_Paulo está uma hora na frente
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(instancia.atZone(ZoneId.of("America/Sao_Paulo"))));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(instancia.atZone(ZoneId.of("Europe/Berlin"))));


     //   Dada a String dataStr = "25/12/2025", crie uma instância LocalDate e imprima no formato "dd/MM/yyyy".
        String dataStr = "25/12/2025";
        LocalDate data11= LocalDate.parse(dataStr,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data11));

        LocalDate data12= LocalDate.parse("25/12/2025",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//           Quando preferir a forma com variável intermediária (String dataStr = ...):
//                Quando a string vem de entrada do usuário, arquivo, ou outro metodo;
//
//                Quando vai reutilizar a string em vários lugares;
//
//                Quando quer melhorar a legibilidade ou depurar mais facilmente.


       // Dada a String horaStr = "09:45", crie uma instância LocalTime e imprima no mesmo formato.
        String horaStr = "09:45";
        LocalTime hora1=LocalTime.parse(horaStr,DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(hora1));

        //Crie um programa que calcule quantos anos, meses e dias se passaram desde 15/11/1889 (Proclamação da República) até a data atual.
        String dataStr2 = "15/11/1889";
        LocalDate data7= LocalDate.parse(dataStr2,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data8= LocalDate.now();
       Period p=Period.between(data7,data8);
       //não funciona com println
        System.out.printf("Anos: %s Meses: %s dias: %s ",p.getYears(),p.getMonths(),p.getDays());

        //Dado:
        //Instant i1 = Instant.parse("2023-10-10T10:00:00Z");
        //Instant i2 = Instant.parse("2023-10-10T10:00:08Z");
        //
        //Calcule e imprima quantos segundos se passaram entre esses dois instantes.
                //parse sempre que é string, seja instant, LocalDate,etc..
        Instant i1 = Instant.parse("2023-10-10T10:00:00Z");
        Instant i2 = Instant.parse("2023-10-10T10:00:08Z");
        Duration d=Duration.between(i1,i2);
        //mesma questão com o println
        System.out.printf("Segundos: %s segundos",d.getSeconds());

        //Dada a String "01/01/2023 18:30", crie uma instância LocalDateTime e imprima no mesmo formato.
        String dataStr3 = "01/01/2023 18:30";
        LocalDateTime data6= LocalDateTime.parse(dataStr3,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data6));

        //Suponha que você tem uma lista de fornecimentos com datas variadas. Filtre e imprima apenas os que aconteceram nos últimos 15 dias a partir da data atual.
                //if (fornecimento.getData().isAfter(LocalDateTime.now().minusDays(31L))) {
        //if (fornecimento.getData().isAfter(LocalDateTime.now().minusDays(16L)))



    }
}
