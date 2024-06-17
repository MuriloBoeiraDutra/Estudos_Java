package Kexception.unchecked.teste;
import Kexception.unchecked.dominio.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setSaldo(200);
        try {
            conta1.depositar(-10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo atual: " + conta1.getSaldo());
        //Unchecked excpetions herdam diretamente de runtimeexcpetion
        //E elas geralmente indicam erro no código
    }
}
