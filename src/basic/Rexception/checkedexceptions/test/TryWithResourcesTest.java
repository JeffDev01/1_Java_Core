package basic.Rexception.checkedexceptions.test;

import basic.Rexception.checkedexceptions.classes.Leitor1;
import basic.Rexception.checkedexceptions.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivoNew();

    }


    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //TryWithResources ja contem o método close!
    public static void lerArquivoNew() {//No trywithresourcers a classe precisa obrigatoriamente conter o método closeble!
        try (Leitor2 leitor2 = new Leitor2();
             Leitor1 leitor1 = new Leitor1()) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
