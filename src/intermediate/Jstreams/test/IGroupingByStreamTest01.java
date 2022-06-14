package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;
import intermediate.Jstreams.domain.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IGroupingByStreamTest01 {

    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30D, Category.COUPE),
            new Car("Audi TT", 35D,Category.SPORTIVE),
            new Car("Uno", 25D, Category.COUPE),
            new Car("Corsa", 18D,Category.COUPE),
            new Car("Ferrari", 23D, Category.SPORTIVE),
            new Car("Troller", 22D, Category.SUV)));
    public static void main(String[] args) {
        Map<Category, List<Car>> categoryListMap = new HashMap<>();

        Map<Category, List<Car>> collectByCategory = carsList.stream().collect(Collectors.groupingBy(Car::getCategory));
        System.out.println(collectByCategory);

    }
}
