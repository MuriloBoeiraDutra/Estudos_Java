package Genumeracao.dominio;

public enum TipoPagamento{
    DEBITO("Débito bonitinho"){
        @Override
        public double calcularJuros(double valor){
            return valor * 0.3;
        }
    }, CREDITO("Crédito bonitinho"){
        @Override
        public double calcularJuros(double valor){
            return valor * 0.05;
        }
    };

    TipoPagamento(String aviadaram) {
        this.aviadaram = aviadaram;
    }

    public String aviadaram;
    public abstract double calcularJuros(double valor);

    public String getAviadaram() {
        return aviadaram;
    }
}
