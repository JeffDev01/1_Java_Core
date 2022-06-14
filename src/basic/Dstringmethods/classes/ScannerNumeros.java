package basic.Dstringmethods.classes;


import java.util.Scanner;

public class ScannerNumeros {
    public static void main(String[] args) {
        System.out.print("Write your name: ");
        Scanner name = new Scanner(System.in);

        System.out.print("\nWhat is your age: ");
        Scanner age = new Scanner(System.in);

        System.out.println("Name: " + name.nextLine() + " Age: " + age.nextLine());

    }
}
