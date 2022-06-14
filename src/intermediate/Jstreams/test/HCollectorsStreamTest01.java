package intermediate.Jstreams.test;

import intermediate.Jstreams.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class HCollectorsStreamTest01 {
    private static List<Car> carsList = new ArrayList<>(List.of(new Car("Gol", 30D),
            new Car("Audi TT", 35D),
            new Car("Uno", 25D),
            new Car("Corsa", 18D),
            new Car("Celta", 23D),
            new Car("Celta", 22D)));

    public static void main(String[] args) {
        //CONTANDO QUANTOS OBJETOS TENHO DENTRO DA LISTA
        System.out.println(carsList.stream().count());
        System.out.println(carsList.stream().collect(Collectors.counting()));

        //O MAIOR
        carsList.stream().max(Comparator.comparing(Car::getPrice)).ifPresent(System.out::println);/*Com Collector*/

        //SOMA
        System.out.println(carsList.stream().mapToDouble(Car::getPrice).sum());
        System.out.println(carsList.stream().collect(Collectors.summingDouble(Car::getPrice)));/*Com Collector*/

        //MÉDIA
        carsList.stream().mapToDouble(Car::getPrice).average().ifPresent(System.out::println);
        System.out.println(carsList.stream().collect(Collectors.averagingDouble(Car::getPrice)));/*Com Collector*/

        DoubleSummaryStatistics collect = carsList.stream().collect(Collectors.summarizingDouble(Car::getPrice));
        System.out.println(collect); /*AQUI EU TENHO 5 OPERAÇÕES ESTATÍSTICAS DA MINHA LISTA RESUMIDA. IMPORTANTE!*/

        //PEGAR TODOS OS NOMES EM APENAS UMA LINHA SEPARADO POR VIRGULA
        String namesCar = carsList.stream().map(Car::getName).collect(Collectors.joining(", "));
        System.out.println(namesCar);


    }
}
