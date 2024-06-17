package lassociacao.teste;

import lassociacao.dominio.Jogador;
import lassociacao.dominio.Time;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Murilo");
        Time time1 = new Time("Seleção brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
