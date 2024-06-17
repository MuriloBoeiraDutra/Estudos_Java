package lassociacao.teste;

import lassociacao.dominio.Jogador;
import lassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Time time1 = new Time("Brasil");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time1);

        time1.setJogadores(jogadores);

        System.out.println("-------jogador---------");
        jogador1.imprime();
        System.out.println("-----time----");
        time1.imprime();
    }
}
