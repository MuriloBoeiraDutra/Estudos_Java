package Nstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "William Skorek";
        name.concat(" De Vargas");
        System.out.println(name);
        //StringBuilder não é uma string, é uma classe que trabaçha com strings, logo ele não é imutavel tal qual as strings
        StringBuilder sb = new StringBuilder("William Skorek");
        sb.append(" de Vargas");
        System.out.println(sb); //isso só é possivel pois o stringuilder tem dentro dele o metodo toString
        //Então seria a mesma coisa escrever "System.out.println(sb)" e isso "System.out.println(sb.toString())"
        sb.reverse();
        System.out.println(sb);

        //Resumo da opera, strings são imutaveis, logo sempre que voce(sim o Murilo do futuro) estiver fazendo alguma coisa com strings, vc está na verdade criando uma nova string no pool de strings
        //ja o stringbuilder não :D
    }
}
