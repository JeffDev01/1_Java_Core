package basic.Rexception.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

      abrirArquivo();

    }

    public static void criarArquivo() throws IOException {

        File file = new File("Teste.txt");
        System.out.println("Arquivo criado?: " + file.createNewFile());


    }

    public static String abrirArquivo() {
        try {
            File file = new File("Teste.txt");
            System.out.println("Abrindo um arquivo.");
            System.out.println("Execudando a leitura do arquivo");
            return "Valor";
//            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Dentro do Catch");
            e.printStackTrace();

        }finally{
            System.out.println("finally: Fechar arquivo");
        }
        return null;


    }


}



