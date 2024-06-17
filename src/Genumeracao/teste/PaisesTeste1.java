package Genumeracao.teste;

import Genumeracao.dominio.Paises;
import Genumeracao.dominio.NomePais;
import Genumeracao.dominio.Paises.Moeda;


public class PaisesTeste1 {
    public static void main(String[] args) {
        Paises pais1 = new Paises(200, NomePais.Brazil, Moeda.REAL);
        System.out.println(pais1);
    }
}
