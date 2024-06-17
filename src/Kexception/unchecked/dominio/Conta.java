package Kexception.unchecked.dominio;

public class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor < 0){
            IllegalArgumentException erro1 = new IllegalArgumentException("Não aceitamos valores menores que zero -_-");
            throw erro1;
        }
        saldo += valor;
    }
}
