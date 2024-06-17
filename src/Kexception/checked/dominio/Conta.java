package Kexception.checked.dominio;

public class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws Exception{
        if(valor < 0){
            Exception erro1 = new Exception("Não aceitamos valores menores que zero -_-");
            throw erro1;
        }
        saldo += valor;
    }
}
