package Bintroducaoclasses.teste;
import Bintroducaoclasses.dominio.Estudante;
import Bintroducaoclasses.dominio.ImpressoraEstudante;


public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.name = "Murilo";
        estudante01.age = 20;
        estudante01.gender = 'M';
        System.out.println("-------");
        Estudante estudante02 = new Estudante();
        estudante02.name = "Murilo2";
        estudante02.age = 202;
        estudante02.gender = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
