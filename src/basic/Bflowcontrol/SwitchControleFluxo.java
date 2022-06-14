package basic.Bflowcontrol;

public class SwitchControleFluxo {

    public static void main(String[] args) {

        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                if (true) {
                    System.out.println("Inside the switch");
                }
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        String sexo = "L";
        switch (sexo) {
            case "F":
                System.out.println("Female");
                break;
            case "M":
                System.out.println("Male");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }


    }
}
