package basic.Zio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {


        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {/*Caso eu queira continuar no mesmo arquivo, eu coloco a append = true*/
            fw.write("O DevDoj é o curso gratuíto mais completo de Java no Brasil");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}