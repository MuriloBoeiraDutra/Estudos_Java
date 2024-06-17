package Kexception.costumize_exception.teste;

import Kexception.costumize_exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste1 {
    public static void main(String [] args){
        try {
            logar();
    } catch(LoginInvalidoException e) {
        e.printStackTrace();
    }
}

private static void logar() throws LoginInvalidoException {
    Scanner teclado = new Scanner(System.in);
    String usernameDB = "murilin";
    String senhaDB = "1234";
    System.out.println("Usuário");
    String usernameDigitado = teclado.nextLine();
    System.out.println("Senha");
    String senhaDigitado = teclado.nextLine();

    if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
        throw new LoginInvalidoException("Usuário ou seha inválidos");
    }
    System.out.println("Usuário logado com sucesso");
    }
}

