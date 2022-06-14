package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

    public static void main(String[] args) {
        //CRIANDO UMA DIRETÓRIO
        Path folderPath = Paths.get("folder");
        Path directories = Paths.get("pasta/subpasta1/subpasta2");
        /*Files geralmente gera Exceptions, então é necessário criar checagem*/
        if (Files.notExists(folderPath)) {
            try {
                Path directory = Files.createDirectory(folderPath); //Cria apenas uma pasta
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The Folder: " + folderPath + " aready existe");
        }

        //CRIANDO MULTIPLOS DIRETORIOS DE UMA VEZ
        /*Posso criar apenas uma pasta usando directories, portanto é mais recomendado suar apenas esse método*/
        try {
            /*Create directories não emite exception se o diretório ja existir*/
            directories = Files.createDirectories(directories);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //CRIANDO ARQUIVOS UTILIZANDO CLASSE FILES AND PATHS.


        Path filePath = Paths.get(String.valueOf(directories), "file.txt");
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("The document: "+filePath.getFileName()+" aready exists.");
        }

        //COPIANDO ARQUIVO
        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(),"Copy_file.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);/*This Stardart... is importat to not get
            a Exception if the file aready exist and to replace with the same content anyway*/

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
