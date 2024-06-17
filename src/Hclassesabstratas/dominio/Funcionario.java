package Hclassesabstratas.dominio;

public abstract class Funcionario {
    //Quando eu digo que uma classe é abstract, ela basicamente n pode ser instanciada :)
    //E METÓDOS ABSTRATODS só podem existir dentro de classes abastradas, fecho
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
