package Destatico.dominio;

public class Carro{
    private String nome;
    private double velocidade_maxima;
    private static double velocidade_limite = 250;
    //o "static" diz basicamente que a variavel não pertence mais a instancia e sim ao objeto em si, a classe em si, se ligou?
    //Tipo ó, se vc mudar na classe main a velocidade_maxima do carro, todas as insantcias serão afetadas, pogg ne?


    //Use metodos estaticos quando as variaveis nao acessam nenhum atributo da instancia :D
    public Carro(String nome, double velocidade_maxima){
        this.nome = nome;
        this.velocidade_maxima = velocidade_maxima;
    }

    public void imprime(){
        System.out.println("-------");
        System.out.println("O nome do carro é " + this.nome);
        System.out.println("A velocidade máxima é " + this.velocidade_maxima);
        System.out.println("E a velocidade limite é " + Carro.velocidade_limite);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getVelocidade_maxima(){
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(Double velocidade_maxima){
        this.velocidade_maxima = velocidade_maxima;
    }

    public static double getVelocidade_limite(){
        return Carro.velocidade_limite;
    }

    public static void setVelocidade_limite(double velocidade_limite){
        Carro.velocidade_limite = velocidade_limite;
    }

}