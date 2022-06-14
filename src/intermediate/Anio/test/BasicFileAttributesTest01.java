package intermediate.Anio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(60);
        File file = new File("folder/new_file.txt");
        boolean newFile = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder/path_file.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Path modifiedTime = Files.setLastModifiedTime(path, fileTime);

        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));


    }
}
