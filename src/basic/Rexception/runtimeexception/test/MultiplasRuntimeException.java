package basic.Rexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeException {
    public static void main(String[] args) {

//        try {
//            throw new ArrayIndexOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Dentro do ArrayIndexOuOfBoundsException");
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Dentro do IlligalArgumentException");
//
//        } catch (ArithmeticException e) {
//            System.out.println("Dentro do ArthmeticException");
//        }


        try { //Essa é uma forma antiga de tratamento de Exception
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Esse é um modo mais atual de tratamento, mas não é o mais utilizado.
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) { //lança uma ou '|' outra. Não pode ser da mesma linha de herança
            e.printStackTrace();
        }


    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
