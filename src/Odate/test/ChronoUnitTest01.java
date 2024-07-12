package Odate.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        //Period: Ideal para manipulações com anos, meses e dias. Não lida com horas e minutos.
        //Duration: Ideal para manipulações com horas, minutos, segundos e nanossegundos. Não lida com anos e meses.
        //ChronoUnit: Versátil e flexível, pode lidar com qualquer unidade de tempo, desde nanossegundos até milênios. Útil para medir tempo e adicionar/subtrair unidades de tempo específicas.
        LocalDateTime birthday = LocalDateTime.of(1988, Month.JUNE, 6, 12,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS.between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
    }
}
