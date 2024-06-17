package Fmodificador_final.dominio;

public class Carro {
    private String cor;
    public final String MARCA;

    public Carro(String cor, String MARCA) {
        this.cor = cor;
        this.MARCA = MARCA;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + cor + '\'' +
                ", marca='" + MARCA + '\'' +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String nome) {
        this.cor = nome;
    }

    public String getMarca() {
        return MARCA;
    }
}
