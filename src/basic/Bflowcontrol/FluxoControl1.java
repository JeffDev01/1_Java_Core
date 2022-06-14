package basic.Bflowcontrol;

public class FluxoControl1 {


    public static void main(String[] args) {
        int age = 16;
        String category;

        if (age >= 20){
            category = "Adult";
        }else if (age >= 18 && age < 20) {
            category = "teenager";
        } else {
            category = "Kid";
        }
        System.out.println("You category is: "+category);




    }
}
