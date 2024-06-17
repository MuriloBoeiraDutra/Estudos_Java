package Bintroducaoclasses.dominio;

public class Estudante {
    public int age;
    public String name;
    public char gender;
    //acho q só de ver o código vc vai se ligar o que é o "this", Murilo do futuro, mas se n, fds, olha a aula dnv ai
    public void imprime(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.gender);
    }
}
