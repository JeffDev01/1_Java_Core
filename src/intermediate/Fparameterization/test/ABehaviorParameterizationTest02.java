package intermediate.Fparameterization.test;

import intermediate.Fparameterization.domain.Car;
import intermediate.Fparameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ABehaviorParameterizationTest02 {

    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 2005), new Car("blue", 2019));



    public static void main(String[] args) {
       /*----------------------------------------------------------------------------*/
        List<Car> greem = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("greem");
            }
        });
        /*----------------------------------------------------------------------------*/

        List<Car> green = filter(cars, car -> car.getColor().equals("greem"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2011);

        System.out.println(green);
        System.out.println(red);
    }


    private static List<Car> filter(List<Car> cars, CarPredicate predicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars){
            if(predicate.test(car)){
                filteredCars.add(car);

            }
        }return filteredCars;
    }
}
