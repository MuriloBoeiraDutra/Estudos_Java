package Kexception.exceptiontest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado");
        }catch (IOException e){
            //pelo amor de deus Murilo, n deixa esse bloco em branco
            // e também evite colocar regra de negócio no catch
            e.printStackTrace();
        }
    }
}
