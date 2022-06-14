package basic.Zio.test;


import java.io.File;
import java.io.IOException;

public class FileForDirectoriesTest01 {
    public static void main(String[] args) {
//          CRIANDO O DIRETÓRIO
        try {
            File fileDirectory = new File("folder");
            System.out.println("Diretório criado? "+fileDirectory.mkdir());

//          CRIANDO O ARQUIVO
            File fileInsideFolder = new File(fileDirectory, "Arquivo.txt");//Assim é uma forma mais facil de criar.
            System.out.println("Arquivo criado? "+fileInsideFolder.createNewFile());

//          RENOMEANDO O ARQUIVO
            File renamedFile = new File(fileDirectory,"arquivoRenomeado.txt");
            System.out.println("Arquivo renomeado? : " + fileInsideFolder.renameTo(renamedFile));

//          RENOMEAR DIRETÓRIO
            File renamedDirectory = new File("folderRenamed");
            System.out.println("Folder renomeado? : "+fileDirectory.renameTo(renamedDirectory));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
