package Odate.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(10000000); // long em milesegundos, ele já se tornou obsoleto :0
        System.out.println(date);
    }
}
