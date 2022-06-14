package aintelliji;

public class DocumentationAndComments {

    /**
     * The documentation here is pretty important for other people to understand your code, with that, when someone
     * imports your code like a library of implement or extends, they can have instant access to your documentation
     * explaining more about your functions.
     *
     * @author Jefferson Borges de Brito
     * @version 1.0
     * @since 2021-08-02
     */

    public static void isWeekend() {
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7 :
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid");
        }
    }


    public static void someMethod() {
        System.out.println("Learning the importance of documentation in JAVA");

        System.out.println(2.0 - 1.1);
        System.out.println(2.0 - 1.2);
        System.out.println(2.0 - 1.3);
        System.out.println(2.0 - 1.4);
        System.out.println(2.0 - 1.5);
        System.out.println(2.0 - 1.6);
        System.out.println(2.0 - 1.7);
        System.out.println(2.0 - 1.9);
        System.out.println(2.0 - 2);
    }

    public static void main(String[] args) {
//        someMethod();
        isWeekend();

    }
}
