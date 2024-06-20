package Odate.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //essa classe trabalha com nanosegundos
        //Zulo time é tipo um tempo universal
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getNano());
        //Instant é interessante quando for trabalhar com aplicações
    }
}
