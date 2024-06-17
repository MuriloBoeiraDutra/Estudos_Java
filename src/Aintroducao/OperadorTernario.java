package Aintroducao;

public class OperadorTernario {
    public static void main(String[] args) {
        //String operador = (condicao)? verdadeiro : falso;
        int salario = 300;
        String msg = "Deu bom";
        String msg2 = "ta paia meu nego";
        String resultado = (salario >= 5000) ? msg : msg2;
        System.out.println(resultado);

    }
}
