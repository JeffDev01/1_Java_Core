package intermediate.Anio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {

    public static void main(String[] args) {

        /*Para zippar precisamos de 3 paths:
         * Path do diretório que irá salvar
         * Path de onde o arquivo se encontra
         * Nome  do arquivo final*/

        Path zipFile = Paths.get("folderTest/file.zip");
        Path sourceFiles = Paths.get("folderTest/subfolder");
        zip(zipFile, sourceFiles);
    }


    private static void zip(Path zipFile, Path sourceFiles) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             DirectoryStream<Path> dirStrem = Files.newDirectoryStream(sourceFiles)) {
            for (Path file : dirStrem) {
                System.out.println(file.getFileName());
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                zipStream.closeEntry();
            }


        } catch (IOException e) {

        }

    }
}
