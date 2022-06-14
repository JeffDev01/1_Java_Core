package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;
import intermediate.Jstreams.domain.Category;
import intermediate.Jstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class IGroupingByStreamTest04 {

    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30D, Category.COUPE),
            new Car("Audi TT", 35D,Category.SPORTIVE),
            new Car("Uno", 25D, Category.COUPE),
            new Car("Corsa", 18D,Category.COUPE),
            new Car("Ferrari", 23D, Category.SPORTIVE),
            new Car("Troller", 22D, Category.SUV)));
    public static void main(String[] args) {

        Map<Category, DoubleSummaryStatistics> collect = carsList.stream()
                .collect(Collectors.groupingBy(Car::getCategory, Collectors.summarizingDouble(Car::getPrice)));
        System.out.println(collect);

        //Map<Category, List<Promotion>>  Fantasy - UNDER_PROMOTION, NO PROMOTION
        Map<Category, List<Promotion>> collect1 = carsList.stream().collect(Collectors.groupingBy(Car::getCategory,
                Collectors.mapping(car -> car.getPrice() < 30D ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toList())));
        System.out.println(collect1);


    }
}
