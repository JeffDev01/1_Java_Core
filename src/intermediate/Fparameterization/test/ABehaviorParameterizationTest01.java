package intermediate.Fparameterization.test;

import intermediate.Fparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ABehaviorParameterizationTest01 {

    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 2005), new Car("blue", 20190));

    /*Parameterização ajuda a tornar o codigo e métodos mais flexiveis na entrada de argumentos, permitindo evitar
    * blocos duplicados de código*/

    public static void main(String[] args) {
        List<Car> carsGreen = filterCarByColorAndYear(ABehaviorParameterizationTest01.cars, "red", 2010);
        for(Car car : carsGreen){
            System.out.println(car);
        }


    }


    private static List<Car> filterCarByColorAndYear(List<Car> cars, String color, int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals(color)){
                filteredCars.add(car);

            }
        }return filteredCars;
    }
}
