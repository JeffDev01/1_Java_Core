package basic.Zio.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest02 {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd_hhmmss");
        System.out.println(date.format(new Date()));
        String fileName = date.format(new Date()).concat(".txt");
        System.out.println(fileName);
        File file = new File("C:\\Users\\Jefferson\\Desktop\\CursoJavaSE\\directory\\"+fileName);
        try {
            boolean exist= file.exists();
            if(!exist){
                System.out.println(file.createNewFile());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Directory: "+file.getAbsolutePath());
        System.out.println("Is a directory: "+file.isDirectory());
        System.out.println("Is a file: "+file.isFile());
        System.out.println("Last date modified: "+ Instant.ofEpochMilli((file.lastModified())).atZone(ZoneId.systemDefault()));


    }

}
