package basic.Bflowcontrol;

public class ExercicioBreakPerformanceCode {

    public static void main(String[] args) {
        //Given the cars value, find the number of payments possible
        //Payments neet to be over $1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                System.out.println("Fim");
                break;//Is really important to use break to increase the code performance.
            }
            System.out.println("Fora do laço");
        }


    }


}
