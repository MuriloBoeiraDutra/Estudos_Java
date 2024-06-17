package Bintroducaoclasses.dominio;

public class Acoplamento {
    public String nome;
    public int idade;
    //Alta coesão significa q a classe faz poucas coisas
    //E o acoplamento é o quanto uma classe depende da outra :D

    public Acoplamento(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
}
