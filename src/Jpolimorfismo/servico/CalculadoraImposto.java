package Jpolimorfismo.servico;

import Jpolimorfismo.dominio.Produto;
import Jpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
        public static void calcularImposto(Produto produtoN){
            System.out.println("Relatório do produto");
            double imposto = produtoN.calcularImposto();
            System.out.println("Produto " + produtoN.getNome());
            System.out.println("Preço " + produtoN.getValor());
            System.out.println("Imposto a ser pago " + imposto);
            if (produtoN instanceof Tomate) {
                //Tomate tomate = (Tomate) produtoN;
                //System.out.println(tomate.getData_de_validade());
                System.out.println(((Tomate) produtoN).getData_de_validade());
            }
        }
    }
