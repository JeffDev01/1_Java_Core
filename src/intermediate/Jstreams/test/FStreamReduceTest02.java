package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class FStreamReduceTest02 {

    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30D),
            new Car("Audi TT", 35D),
            new Car("Uno", 25D),
            new Car("Corsa", 18D),
            new Car("Celta", 23D),
            new Car("Celta", 22D)));

    public static void main(String[] args) {

        carsList.stream()
                .map(Car::getPrice)
                .filter(price -> price >25)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        /*SE A VARIÁVEL DO OBJETO É DO TIPO PRIMITICO E ESTAMOS FAZENDO MUITOS WRAMPING ISSO PODE AFETAR A PERFORMANCE
        * PORTANDO EXITEM VARIÁVEIS ADEQUADAS PARA SE TRABALHAR NO STREAM LISTADOS ABAIXO*/

        double sum = carsList.stream()
                .mapToDouble(Car::getPrice)
                .filter(price -> price > 25)
                .sum();
        System.out.println(sum);


    }
}
