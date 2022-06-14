package basic.Zio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {

        /*File apenas cria um objeto da file. Para criar o arquivo temos que chamar o creatNewFile(), ele retorna booleano*/
        File file = new File("file.txt");
        try {
            System.out.println(file.createNewFile()); //retorna um booleano
//            file.delete(); //para deletar o arquivo dentro de um diretório.
//            boolean existe = file.exists();
            file.getPath();
            file.getAbsoluteFile();//para saber onde o arquivo está localizado.

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
