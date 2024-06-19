package Odate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        //basicamente uma junção do LocalDate e do LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2024, Month.JUNE, 19);
        LocalDate date2 = LocalDate.parse("2024-06-20");
        LocalTime time = LocalTime.of(14, 14, 0);
        LocalTime time2 = LocalTime.parse("14:14:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(time);
        System.out.println(time2);

        System.out.println("----------");
        LocalDateTime ldt2 = date2.atTime(time);
        System.out.println(ldt2);

        LocalDateTime ldt1 = time2.atDate(date2);
        System.out.println(ldt1);
    }
}
