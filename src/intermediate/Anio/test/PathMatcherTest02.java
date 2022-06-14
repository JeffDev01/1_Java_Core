package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListAllFilesTest extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String regex = "\\w*Test(\\w*)($|\\s)" /*"\\w*Test(\\d).java,\\s,$}"*/;
        Path fileName = file.getFileName();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileName.toString());

        while(matcher.find()){
            System.out.println(matcher.group());
        }
        return FileVisitResult.CONTINUE;

    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {


        Path root = Paths.get(".");
        Files.walkFileTree(root,new ListAllFilesTest());

    }
}
