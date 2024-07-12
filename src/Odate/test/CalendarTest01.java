package Odate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    //Classe mais antiga, mas sepa pode ter códigos que ainda a utilizam então fique esperto :D
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Terça é o terceiro dia da semana :)");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        Date date = c.getTime();
        System.out.println(date);
        System.out.println(c);

        c.add(Calendar.HOUR, 24);
        Date date2 = c.getTime();
        System.out.println(date2);
    }
}
