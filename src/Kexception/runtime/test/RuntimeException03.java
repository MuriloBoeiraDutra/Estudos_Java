package Kexception.runtime.test;

public class RuntimeException03 {
    public static void main(String[] args) {
        abreConexao();
    }
    public static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Fechando o arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operancional"); // = "fechando o arquivo" kkk
        }
        return null;
    }
}