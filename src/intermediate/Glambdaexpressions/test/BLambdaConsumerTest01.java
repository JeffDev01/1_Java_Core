package intermediate.Glambdaexpressions.test;

import java.util.List;
import java.util.function.Consumer;

public class BLambdaConsumerTest01 {
    public static void main(String[] args) {

        List<String> namesList = List.of("Lucas", "Ricardo", "Marcelo", "João", "Fernando");
        List<Integer> numbers = List.of(1, 5, 3, 7, 2, 9, 7);

        forEach(namesList, (String s) -> System.out.println(s));
        forEach(numbers, System.out::println);


    }

    private static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
