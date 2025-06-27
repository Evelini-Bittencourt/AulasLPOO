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

    }
}
