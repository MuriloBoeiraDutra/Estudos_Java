package Aintroducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //meses, 1, 2, 3
        //dias 31, 28, 31
        int[][] days= new int[4][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 29;

        days[1][0] = 30;
        days[1][1] = 32;
        days[1][2] = 27;

        days[2][0] = 25;
        days[2][1] = 32;
        days[2][2] = 33;

        days[3][0] = 30;
        days[3][1] = 29;
        days[3][2] = 26;
        // days = [[31, 12, 1],[23, 24, 4],[5, 3, 3], [23, 23,23]]
        for(int i=0; i < days.length; i++){
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i].length);
                System.out.println("Os dias do mes são " + days[i][j]);
            }
        }
        System.out.println("----------");
        for(int[]arrBase:days){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
