package Nstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "William"; // String costant pool
        String name2 = "William";
        name = name.concat(" Skorek");
        System.out.println(name);
        System.out.println(name == name2); //comparando a referencia do objeto;
        System.out.println(name.equals(name2)); // comparando se o valor é igual
        String name3 = new String("William"); //1 uma variavel de referencia, 2 um objeto do tipo string, 3 uma string no pool de string
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
