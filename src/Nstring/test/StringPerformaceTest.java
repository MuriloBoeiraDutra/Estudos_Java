package Nstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim-inicio) + " milesegundos");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim-inicio) + " milesegundos");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim-inicio) + " milesegundos");


        //absurdo essa diferença de performace :O
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0,01,012,0123...
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder stringbuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringbuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer stringbuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringbuffer.append(i);
        }
    }
}

