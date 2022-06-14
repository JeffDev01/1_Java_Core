package intermediate.Jstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GGeneratingStreamTest01 {
    public static void main(String[] args) {
        //GERAR UM STREAM DE INTEIROS

        IntStream.rangeClosed(1,50)
                .filter(n->n%2==0)
                .forEach(n-> System.out.print(n+" "));
        System.out.println();
        IntStream.range(1,50)
                .filter(n->n%2==0)
                .forEach(n-> System.out.print(n+" "));
        System.out.println();

        //GERAR UM STREAM DE STRINGS
        Stream.of("Jefferson ", "Hoje ", "Ovo ", "Casa ", "Sol ")
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();

        //STREAM DE ARRAYS
        int[] nums = {1,2,3,4,5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);

        //STREAM DE UM ARQUIVO
        try(Stream<String> lines = Files.lines(Paths.get("subfile1.txt"))){
                lines
                        .filter(l ->l.contains("zipar"))
                        .forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
