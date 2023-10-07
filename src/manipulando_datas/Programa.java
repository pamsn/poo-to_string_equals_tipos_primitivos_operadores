package manipulando_datas;

import java.time.Instant;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa {

	public static void main(String[] args) {
		// Instant representa um ponto no tempo UTC
        Instant instant = Instant.now();

        // Duration representa uma duração em segundos e nanossegundos
        Duration duration = Duration.ofHours(2);

        // Adicionando duração ao Instant
        Instant novoInstant = instant.plus(duration);

        System.out.println("Instant original: " + instant);
        System.out.println("Instant após adição de duração: " + novoInstant);

        // LocalDate representa uma data sem informações de tempo
        LocalDate localDate = LocalDate.now();

        // Adicionando dias a LocalDate
        LocalDate novaData = localDate.plusDays(10);

        System.out.println("LocalDate original: " + localDate);
        System.out.println("LocalDate após adição de dias: " + novaData);

        // LocalDateTime representa uma data e hora sem fuso horário
        LocalDateTime localDateTime = LocalDateTime.now();
        
     // Adicionando horas a LocalDateTime
        LocalDateTime novoLocalDateTime = localDateTime.plusHours(3);

        System.out.println("LocalDateTime original: " + localDateTime);
        System.out.println("LocalDateTime após adição de horas: " + novoLocalDateTime);

        // ZonedDateTime representa uma data e hora com fuso horário
        ZoneId zona = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zona);

        // Adicionando meses a ZonedDateTime
        ZonedDateTime novoZonedDateTime = zonedDateTime.plusMonths(2);

        System.out.println("ZonedDateTime original: " + zonedDateTime);
        System.out.println("ZonedDateTime após adição de meses: " + novoZonedDateTime);

        // Formatando datas usando DateTimeFormatter
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = localDateTime.format(formato);

        System.out.println("Data formatada: " + dataFormatada);

	}

}
