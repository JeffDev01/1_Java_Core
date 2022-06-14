package intermediate.Anio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    /*Normilize means to manipulate paths in the systems*/
    public static void main(String[] args) {

        String path1= "home/images/jefferson";
        String path2 = "../../../file.txt";
        Path path = Paths.get(path1, path2);
        System.out.println(path);
        System.out.println(path.normalize());


    }
}
