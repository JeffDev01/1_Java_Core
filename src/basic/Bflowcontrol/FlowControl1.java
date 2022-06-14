package basic.Bflowcontrol;

public class FlowControl1 {
    public static void main(String[] args) {

        int age = 16;
        float salary = 2000;

        if (age >= 20) {
            System.out.println("You are old enouth to get it");

        } else if (age >= 14 && age < 20) {
            System.out.println("You are a teenager");

        } else {
            System.out.println("You are a kid");
        }
    }
}