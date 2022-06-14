package intermediate.Fparameterization.test;

import intermediate.Fparameterization.domain.Car;
import intermediate.Fparameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ABehaviorParameterizationTest03 {

    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 2005), new Car("blue", 2019));


    public static void main(String[] args) {

        List<Car> green = filter(cars, car -> car.getColor().equals("green"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2011);

        List<Integer> numbers= List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);

        System.out.println(filter(numbers, num -> num <= 5));
    }


    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filtered.add(e);

            }
        }return filtered;
    }
}
