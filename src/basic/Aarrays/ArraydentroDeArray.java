package basic.Aarrays;

public class ArraydentroDeArray {
    public static void main(String[] args) {
        int dias[][] = new int[3][];

        dias[0] = new int[2];
        dias[1] = new int[]{20, 30, 40};
        dias[2] = new int[3];

        for(int[] array : dias){
            for(int aux : array){
                System.out.println(aux);
            }
        }



    }

}
