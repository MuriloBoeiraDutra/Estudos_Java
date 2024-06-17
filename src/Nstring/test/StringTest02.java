package Nstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String numbers = "012345";
        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,2)); // o indice 2, no segundo parametro do metodo, é exclusivo, então ele vai até o 2 - 1
        System.out.println(numbers.substring(2));
    }
}
