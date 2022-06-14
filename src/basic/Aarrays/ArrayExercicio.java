package basic.Aarrays;

public class ArrayExercicio {
    public static void main(String[] args) {
        int[] numero = new int[]{1, 2, 3, 4, 5};

        for (int i = numero.length; i >= 1; i--) {
            System.out.println(numero[i - 1]);
        }
    }
}
