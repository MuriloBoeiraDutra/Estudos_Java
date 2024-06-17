package Kexception.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        divisao(4,2);
        System.out.println(divisao(4,2));
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        //quando eu faço isso do "throws IllegalArgumentsException" eu to basicamente dizendo que o metodo tem a possibilidade de ter argumentos ilegais, quando outra pessoa for ler o meu código ela vai saber
        // E não é obrigatório o tratamento pois ela é uma exceção unchecked
        //Mas é o seguinte meu mano, vc n vai ver tanto esse comentário em exceções do tipo unchecked, só do tipo checked, ai sim vai ver  full
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal");
        }
        return a/b;
    }
}
