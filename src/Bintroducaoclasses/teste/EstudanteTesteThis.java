package Bintroducaoclasses.teste;

import Bintroducaoclasses.dominio.Estudante;

public class EstudanteTesteThis {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.name = "Murilo";
        estudante01.gender = 'M';
        estudante01.age = 20;
        estudante01.imprime();
    }
}
