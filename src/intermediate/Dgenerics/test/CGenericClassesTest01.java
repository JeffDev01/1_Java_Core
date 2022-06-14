package intermediate.Dgenerics.test;

import intermediate.Dgenerics.domain.Boat;
import intermediate.Dgenerics.domain.Car;
import intermediate.Dgenerics.service.CRentalService;

import java.util.ArrayList;
import java.util.List;

public class CGenericClassesTest01 {
    public static void main(String[] args) {

        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

        CRentalService<Car> rentalService = new CRentalService<>(carsAvailable);
        Car car = rentalService.retrieveAvailableObject();
        System.out.println("Using car for a month");
        rentalService.returnRentedObject(car);


    }


}
