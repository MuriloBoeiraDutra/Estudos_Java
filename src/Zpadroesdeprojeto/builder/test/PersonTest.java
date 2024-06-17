package Zpadroesdeprojeto.builder.test;

import Zpadroesdeprojeto.builder.dominio.Person;



public class PersonTest {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .email("sdfsd@adas")
                .nome("lala")
                .senha("23423")
                .telefone("235235")
                .build();

        System.out.println(build);
    }
}
