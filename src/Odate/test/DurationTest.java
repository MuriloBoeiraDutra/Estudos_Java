package Odate.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        //Period: Ideal para manipulações com anos, meses e dias. Não lida com horas e minutos.
        //Duration: Ideal para manipulações com horas, minutos, segundos e nanossegundos. Não lida com anos e meses.
        //ChronoUnit: Versátil e flexível, pode lidar com qualquer unidade de tempo, desde nanossegundos até milênios. Útil para medir tempo e adicionar/subtrair unidades de tempo específicas.
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);

        System.out.println("Now after two years " + d1);
        System.out.println("Duração entre o tempo atual e o tempo em menos 7 horas: " + d2);
        System.out.println("Duração entre o instante atual e o instante após 1000 segundos:  " + d3);
        System.out.println("Dias em horas: " + d4);
    }
}
