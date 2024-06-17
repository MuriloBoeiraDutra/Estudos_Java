package Genumeracao.dominio;

public class Paises {
    public enum Moeda{
        REAL, DOLAR;
    }

    private int num_pessoas;
    private NomePais nomePais;
    private Moeda moeda;

    public Paises(int num_pessoas, NomePais nomePais, Moeda moeda) {
        this.num_pessoas = num_pessoas;
        this.nomePais = nomePais;
        this.moeda = moeda;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "num_pessoas=" + num_pessoas +
                ", nomePais=" + nomePais.getValor() +
                ", moeda=" + moeda +
                '}';
    }
}