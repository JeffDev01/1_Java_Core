package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;
import intermediate.Jstreams.domain.Category;
import intermediate.Jstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class IGroupingByStreamTest03 {

    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30D, Category.COUPE),
            new Car("Audi TT", 35D,Category.SPORTIVE),
            new Car("Uno", 25D, Category.COUPE),
            new Car("Corsa", 18D,Category.COUPE),
            new Car("Ferrari", 23D, Category.SPORTIVE),
            new Car("Troller", 22D, Category.SUV)));
    public static void main(String[] args) {

        //AGRUPANDO POR CATEGORIA E CONTANDO
        Map<Category, Long> collect = carsList.stream().collect(Collectors.groupingBy(Car::getCategory, Collectors.counting()));
        System.out.println(collect);

        //MOSTRAR O MAIS CARO NOS AGRUPADOS POR CATEGORIA
        Map<Category, Optional<Car>> collect1 = carsList.stream().collect(Collectors.groupingBy(Car::getCategory,
                Collectors.maxBy(Comparator.comparing(Car::getPrice))));
        System.out.println(collect1);

        //OUTRA FORMA DE OBTER O MAIS CARO POR CATEGORIA SEM TEM OPTIONAL
        Map<Category, Car> collect2 = carsList.stream().collect(Collectors.groupingBy(Car::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Car::getPrice)),
                        Optional::get)));
        System.out.println(collect2);


    }
}
