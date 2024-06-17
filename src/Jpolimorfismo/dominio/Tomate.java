package Jpolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    protected String data_de_validade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do tomate");
        return (this.valor * IMPOSTO_POR_CENTO);
    }

    public String getData_de_validade() {
        return data_de_validade;
    }

    public void setData_de_validade(String data_de_validade) {
        this.data_de_validade = data_de_validade;
    }
}
