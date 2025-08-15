package controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Questao2Controller {
    public static void main(String[] args) {
        String StringA="07/09/2024 10:00";
        ZonedDateTime dataA=LocalDateTime.parse(StringA,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")).atZone(ZoneId.of("UTC-3"));
        System.out.println("Data enviada(UTC-3):");
        System.out.println(dataA);
        System.out.println("Data (UTC-0):");
        System.out.println(dataA.toInstant().atZone(ZoneId.of("UTC-0")));

        Instant instant= Instant.ofEpochMilli(1725715655960L);
        LocalDateTime dataB=LocalDateTime.ofInstant(instant, ZoneId.of("UTC-0"));
        System.out.println("Data enviada(UTC-0):");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataB));
        System.out.println("Data (Pelotas):");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("America/Sao_Paulo"))));
    }
}
