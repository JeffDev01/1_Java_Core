package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  {

        //IMPRIMINDO ARQUIVOS .JAVA COM METODO MAIS SIMPLES
        Path fileName = file.getFileName();
        System.out.println(fileName);

        //IMPRIMINDO ARQUIVOS .JAVA COM REGEX
/*        String regex = "\\w*(.java)($|\\s)";
        Path fileJava = file.getFileName();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileJava.toString());
        while(matcher.find()){
            System.out.println(matcher.group());
        }*/


        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new ListAllFiles());


    }
}
