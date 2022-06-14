package intermediate.Bserializacao.test;

import intermediate.Bserializacao.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {


    public static void main(String[] args) {
            Student student = new Student(1L, "Jefferson Borges", "1234");

            serialize(student);

            deserialize();

    }

    private static void  serialize(Student student){
        Path path = Paths.get("folderTest/student.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void  deserialize(){
        Path path = Paths.get("folderTest/student.txt");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           Student student1 = (Student) ois.readObject();
            System.out.println(student1);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }



}
