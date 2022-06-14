package intermediate.Jstreams.test;

import java.util.List;

public class FStreamReduceTest01 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, -5, 3, 4, 5, 6);

        //REDUCE RESUME O RESULTADO DE UMA OPERAÇÃO DENTRO DE UMA LISTA E RETORNA UM UNICO VALOR
        integers.stream().reduce((x,y)->x+y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);/*Usando reference*/


        Integer reduce = integers.stream().reduce(0, Integer::sum);/*Agora nao tem chance de ter resultado null*/
        System.out.println(reduce);

        System.out.println("----------------------");

        //MULTIPLICANDO
        integers.stream().reduce((x,y)->x*y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x,y)->x*y));

        //RETORNANDO MAIOR VALOR NA LISTA
        integers.stream().reduce((x,y) -> x>y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));

    }


}
