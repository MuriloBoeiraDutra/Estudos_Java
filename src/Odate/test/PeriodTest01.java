package Odate.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        //Period: Ideal para manipulações com anos, meses e dias. Não lida com horas e minutos.
        //Duration: Ideal para manipulações com horas, minutos, segundos e nanossegundos. Não lida com anos e meses.
        //ChronoUnit: Versátil e flexível, pode lidar com qualquer unidade de tempo, desde nanossegundos até milênios. Útil para medir tempo e adicionar/subtrair unidades de tempo específicas.
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(5);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println("2 anos e 5 dias entre agora e daqui a dois anos: " + p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p3.getMonths()); //olha o b.o q vai da
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}
