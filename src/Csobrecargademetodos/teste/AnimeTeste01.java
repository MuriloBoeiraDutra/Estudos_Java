package Csobrecargademetodos.teste;

import Csobrecargademetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Tv", 12);
        anime.init("Naruto", "Tv", 12, "Shounen");
        anime.imprime();
        System.out.println("------");
        anime.setNome("Mudei lalalalal");
        anime.imprime();

    }
}
