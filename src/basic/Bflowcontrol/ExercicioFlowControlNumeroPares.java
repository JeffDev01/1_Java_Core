package basic.Bflowcontrol;

public class ExercicioFlowControlNumeroPares {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero par: " + i);
            }
        }
    }
}
