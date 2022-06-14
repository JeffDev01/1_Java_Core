package intermediate.Anio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        //LENDO ATRIBUTOS DOS ARQUIVOS
        /*BasicFilesAttributes são atributos comuns de arquivos do systema*/
        Path path = Paths.get("folder");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        System.out.println("Creation time:      " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time:   " + lastAccessTime);


        //MODIFICANDO ATRIBUTOS DOS ARQUIVOS
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(null, newLastAccess, null);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("---------------------------");
        System.out.println("Creation time:      " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time:   " + lastAccessTime);

    }
}
