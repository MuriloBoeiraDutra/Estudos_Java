package Jpolimorfismo.teste;

import Jpolimorfismo.dominio.Computador;
import Jpolimorfismo.dominio.Produto;
import Jpolimorfismo.dominio.Tomate;
import Jpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste3 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("TAPORRA :O", 10000);

        Tomate tomate = new Tomate("Tomatao", 2500);
        tomate.setData_de_validade("11/03/500");

        CalculadoraImposto.calcularImposto(tomate);
    }
}


