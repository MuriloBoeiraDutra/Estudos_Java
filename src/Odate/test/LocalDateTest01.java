package Odate.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2024, Month.JANUARY, 21);
        LocalDate now = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // ver se é um ano bissexto ou não
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date); //tal qual é salvo em um BDD
        System.out.println(now);

        //Localdate == é uma classe imutavel, que foi introduzida na versão 8 do java
        //Date == Evite utilizar, LocalDate >
        //Calendar == é uma classe abstrata, mutavel, introduzida no java 1.1 e ela pode conter a hora

        // Calendar é considerada mais complexa e menos intuitiva. Além disso, Calendar não tem suporte para muitas
        // das funcionalidades que LocalDate oferece de maneira mais simples.
    }
}
