package Genumeracao.teste;
import Genumeracao.dominio.TipoPagamento;

public class TestePagamento1 {
    public static void main(String[] args) {
        TipoPagamento pagamento1 = TipoPagamento.DEBITO;
        System.out.println(pagamento1);
        System.out.println(pagamento1.getAviadaram());
        System.out.println(pagamento1.calcularJuros(100));

        //Converter String para enum, olha pra baixo ai Murilo do futuro :)

        System.out.println("----");
        TipoPagamento pagamento2 = TipoPagamento.valueOf("CREDITO");
        System.out.println(pagamento2);

        // criar uma lista com os enums tem o metodo values()
        System.out.println("----");
        TipoPagamento[] pagamentos = TipoPagamento.values();
        for (TipoPagamento pagamento : pagamentos) {
            System.out.println(pagamento);
        }
    }
}
