package basic.Rexception.runtimeexception.test;

import java.util.IllegalFormatException;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

        divisao(10,1);

    }

    private static void divisao(int num1, int num2){
        if(num2==0){
            throw new IllegalArgumentException("Passe um numero diferente de zero.");
        }else{

            double result = num1/num2;
            System.out.println(result);
        }
    }
}
