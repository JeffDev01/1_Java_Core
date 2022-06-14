package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EStreamTest05 {
    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30000D),
            new Car("Audi TT", 350000D),
            new Car("Uno", 25000D),
            new Car("Corsa", 18000D),
            new Car("Celta", 23000D),
            new Car("Celta", 22000D)));

    public static void main(String[] args) {
        System.out.println(carsList.stream().anyMatch(m -> m.getPrice() > 25000));//Qualquer um tem que valer a condição
        System.out.println(carsList.stream().allMatch(m -> m.getPrice() > 25000));//Todos tem que obedecer a condição
        System.out.println(carsList.stream().noneMatch(m -> m.getPrice() > 25000));//Nenhum pode que obedecer a condição

        carsList.stream()
                .filter(car -> car.getPrice() > 30000)
                .findAny()
                .ifPresent(System.out::println);

        carsList.stream()
                .filter(car -> car.getPrice()<30000)
                .sorted(Comparator.comparing(Car::getPrice).reversed() )
                .findFirst()
                .ifPresent(System.out::println);

        carsList.stream() //Mesma coisa que o anterior mas usando max.
                .filter(car -> car.getPrice() < 30000)
                .max(Comparator.comparing(Car::getPrice))
                .ifPresent(System.out::println);

    }


}

