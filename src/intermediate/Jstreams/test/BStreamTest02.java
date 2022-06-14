package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BStreamTest02 {
    private static List<Car> carsList = new ArrayList(List.of(new Car("Gol", 30000D),
            new Car("Audi TT", 350000D),
            new Car("Uno", 25000D),
            new Car("Corsa", 18000D),
            new Car("Celta", 23000D),
            new Car("Celta", 22000D)));

    public static void main(String[] args) {
//            carsList.forEach(System.out::println);

        long count = carsList.stream()
                .distinct() //Exclui objetos repedidos, para isso preciso de colocar equals() e hashcode() disendo o paramentro.
                .filter(car -> car.getPrice() <= 25000d)
                .count();
        System.out.println(count);
    }
}
