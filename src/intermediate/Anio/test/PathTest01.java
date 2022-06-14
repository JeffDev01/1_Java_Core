package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {

        Path path = Paths.get("pastas/subpasta1/subpasta2/subpasta3");
        try {
            System.out.println(Files.createDirectories(path));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
