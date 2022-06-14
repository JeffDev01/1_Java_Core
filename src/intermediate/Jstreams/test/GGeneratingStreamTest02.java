package intermediate.Jstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class GGeneratingStreamTest02 {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 2) /*Vai gerar infinitos números*/
                .limit(10)/*Limitando a quantidade*/
                .forEach(System.out::println);

        //0,1,1,2,3,5,8,13,21...
        //(0,1) (1,1) (1,2) (2,3) (3,5) ...index (0,1)

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        //GERAR NUMEROS ALEATÓRIOS
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(()-> random.nextInt(1, 1000))
                .limit(20)
                .forEach(System.out::println);

    }
}
