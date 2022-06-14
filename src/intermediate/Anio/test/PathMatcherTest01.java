package intermediate.Anio.test;

import java.nio.file.*;

public class PathMatcherTest01 {

    public static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("folder/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");

        matches(path1, "glob:**.{bkp,java,txt}");/*Agrupa as opções que pode ser encontrado*/
        matches(path2, "glob:**.{bkp,java,txt}");
        matches(path3, "glob:**.{bkp,java,txt}");

        matches(path1, "glob:**.???");/*Quantidade de caracteres apos o "."*/
        matches(path2, "glob:**.???");
        matches(path3, "glob:**.???");

        matches(path3, "glob:**/file.????");


    }

    //PEGAR O PATH MATCHER DEPENDENDO DO SISTEMA OPERACIONAL
    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + pathMatcher.matches(path));
    }
}
