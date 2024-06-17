package lassociacao.teste;

import lassociacao.dominio.Escola;
import lassociacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Parabixa");
        Professor professor02 = new Professor("Paralol");
        Professor[] professores = {professor01, professor02};
        Escola escola01 = new Escola("Presidente Dutra", professores);

        escola01.imprime();

    }
}
