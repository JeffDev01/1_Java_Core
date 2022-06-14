package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AStreamTest01 {


    /*1. Order by name
     * 2. Retrieve the first 3 cars with price las then 50_000
     * 3. */
    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30000D),
            new Car("Audi TT", 350000D),
            new Car("Uno", 25000D),
            new Car("Corsa", 18000D),
            new Car("Celta", 23000D)));

    public static void main(String[] args) {

        List<String> collectedCars = carsList.stream()
                .sorted(Comparator.comparing(Car::getName))
                .filter(car -> car.getPrice() <= 30000d)
                .limit(3)
                .map(Car::getName)
                .collect(Collectors.toList());
        System.out.println(collectedCars);

    }
}
