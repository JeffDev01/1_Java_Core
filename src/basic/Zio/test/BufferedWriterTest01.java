package basic.Zio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {


    public static void main(String[] args) {
        /*Sempre usar o BufferedWriter por motivos de performance*/

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);/*Caso eu queira continuar no mesmo arquivo, eu coloco a append = true*/
             BufferedWriter bw = new BufferedWriter(fw)) {//A BufferedWriter otimizar passando as info para memoria antes de ser gravadas
            bw.write("O DevDoj é o curso gratuíto mais completo de Java no Brasil");
            bw.newLine();//Usando esse método ele pula linha independendo do sistema operacional
            bw.flush();//Tem sempre que dar o flush! e fechar, nesse cao dentro do TryWithResourcers
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

