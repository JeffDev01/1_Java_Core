package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CStreamTest03 {

    //FLAP MAP

    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphDesigners = List.of("Marcelo", "Caio", "Fernando", "Marcos", "Ana");
        List<String> developers = List.of("Juliano", "Maria", "Simone", "Daniel");
        List<String> students = List.of("Pedro", "Gustavo", "Carlos", "Guilherme");

        devDojo.add(graphDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        /*Pegar todos os nomes sem Streams*/
        for(List<String> people : devDojo){
            for(String name : people){
                System.out.println(name);
            }
        }

        /*Com Streams*/
       devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
