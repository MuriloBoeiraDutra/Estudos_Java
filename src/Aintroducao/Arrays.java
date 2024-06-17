package Aintroducao;

public class Arrays {
    public static void main(String[] args) {
        //Arrays são objetos, ent vc pode usar metodos tipo nomeDoArray.length, fecho pai
        int[] idades = new int[3];
        idades[0] = (int)21.5F;
        idades[1] = 11;
        idades[2] = 3;
        System.out.println(idades[0]);
        int[] numbers = {1,2,3,4,5,6,7,8};
        // vulgo foreach :D
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
