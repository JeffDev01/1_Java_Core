package basic.Bflowcontrol;

public class SwitchExercicioControleDeFluxo {
    public static void main(String[] args) {
        byte dia = 10;

        switch (dia){
            case 1: case 7:
                System.out.println("Fim de semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }





    }

}
