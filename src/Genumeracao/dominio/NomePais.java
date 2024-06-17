package Genumeracao.dominio;

public enum NomePais {
    Brazil(1),
    EUA(2);

    //public final int VALOR;

    //NomePais(int valor){
    //    this.VALOR = valor;
    //}

    //Ambas as formas funcionam...

    private int valor;

    NomePais(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
