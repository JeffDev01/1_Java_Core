package intermediate.Anio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePathTest01 {
    public static void main(String[] args) {

        //ACOPLANDO DUAS PATHS EM COMUM TORNANDO UMA ABSOLUT PATH
        Path dir = Paths.get("pasta/subpasta1");
        Path file = Paths.get("subpasta2/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/pasta/subpasta1");
        Path relative = Paths.get("subpasta2");
        Path fileRelative = Paths.get("file.txt");
        System.out.println("1: "+absolute.resolve(relative));
        System.out.println("2: "+absolute.resolve(fileRelative));
        System.out.println("3: "+relative.resolve(absolute));/*Não funciona pois absolute nao permite resolve.*/


    }
}
