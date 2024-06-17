package Aintroducao;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // Criação de um HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adicionando elementos ao HashMap
        map.put("Um", 1);
        map.put("Dois", 2);
        map.put("Três", 3);

        // Acessando um valor no HashMap
        int valor = map.get("Dois");
        System.out.println("O valor associado à chave 'Dois' é: " + valor);

        // Verificando se uma chave existe no HashMap
        if (map.containsKey("Três")) {
            System.out.println("O HashMap contém a chave 'Três'.");
        }

        // Iterando sobre os elementos do HashMap
        for (String chave : map.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + map.get(chave));
        }
    }
}
