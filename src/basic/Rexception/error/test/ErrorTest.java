package basic.Rexception.error.test;

public class ErrorTest {

    public static void main(String[] args) {

        stackOverFlowError();


    }

    public static void stackOverFlowError(){

        stackOverFlowError();;
    }

}
