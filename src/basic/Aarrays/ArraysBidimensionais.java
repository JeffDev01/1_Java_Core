package basic.Aarrays;

public class ArraysBidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[2][3];
        dias[0][0] = 0;
        dias[0][1] = 1;
        dias[0][2] = 2;
        dias[1][1] = 3;
        dias[1][1] = 3;
        dias[1][1] = 3;

        for (int[] i : dias) {
            for (int ij : i) {
                System.out.println(ij);
            }
        }

        System.out.println("####################");

        for(int[] dia : dias){ //For each bidimensional, muito mais simples!!!!
            for(int d : dia ){
                System.out.println(d);
            }
        }

    }


}
