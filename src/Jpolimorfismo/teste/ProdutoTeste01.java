package Jpolimorfismo.teste;

import Jpolimorfismo.dominio.Computador;
import Jpolimorfismo.dominio.Tomate;
import Jpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Unlock 10", 1100);
        Tomate tomate = new Tomate("Tomatão", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
