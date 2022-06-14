package intermediate.Anio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {

        /*Mostra a movientação entre od diretórios*/
        Path dir = Paths.get("home/document/folder");
        Path clazz = Paths.get("home/document/folder/subFolder/file.txt");
        Path pathToClass = dir.relativize(clazz);

        Path absolut1 = Paths.get("/home/document/folder");
        Path absolut2 = Paths.get("/images/profile");
        Path absolut3 = Paths.get("/home/document/folder/subfolder1/subfolder2");
        Path relative1 = Paths.get("arquivos");
        Path relative2 = Paths.get("arquivos/sistema");

        System.out.println(absolut1.relativize(absolut3));
        System.out.println(absolut3.relativize(absolut1));
        System.out.println(absolut1.relativize(absolut2));
    }
}
