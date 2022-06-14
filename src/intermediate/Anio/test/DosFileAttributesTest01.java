package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        //SETANDO ATRIBUTOS DOS DE ARQUIVOS VIA "DOS" COMO "LER APENAS" OU "OCULTAR"
        Path path = Paths.get("folder/test.txt");
        if(Files.notExists(path)){
            Path file = Files.createFile(path);
        }
        Files.setAttribute(path, "dos:readonly",false);
        Files.setAttribute(path, "dos:hidden",false);

        //AGORA LENDO AS PROPRIEDADES ALTERADAS DOS ARQUIVOS PELO "DOS"
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Ler apenas:  "+dosFileAttributes.isReadOnly());
        System.out.println("Está oculto: "+dosFileAttributes.isHidden());

        //AGORA ALTERANDO OS ATRIBUTOS QUE FORAM SETADOS VIA PATH
        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosFileAttributeView.setHidden(false);
        dosFileAttributeView.setReadOnly(false);
        System.out.println("Ler apenas:  "+dosFileAttributeView.readAttributes().isReadOnly());
        System.out.println("Está oculto: "+dosFileAttributeView.readAttributes().isHidden());



    }
}
