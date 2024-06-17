package Eheranca.teste;

import Eheranca.dominio.Funcionario;
import Eheranca.dominio.Pessoa;

public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Murilo", 20);
        Funcionario funcionario1 = new Funcionario("Parabixa", 20, 2000);
        System.out.println(pessoa1.toString());
        System.out.println(funcionario1.toString());
    }
}
