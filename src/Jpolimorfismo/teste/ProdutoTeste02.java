package Jpolimorfismo.teste;

import Jpolimorfismo.dominio.Computador;
import Jpolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("TAPORRA :O", 10000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}
