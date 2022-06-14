package intermediate.Ccolecoes.test.AList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EListArrayConversionTest01 {
    public static void main(String[] args) {

        List<Integer> numbersList01 = new ArrayList<>();
        numbersList01.add(1);
        numbersList01.add(2);
        numbersList01.add(3);

        /*Transformar uma List em Arrays*/
        Integer[] numbersArray01 = numbersList01.toArray(new Integer[0]);
        System.out.println(numbersList01);
        System.out.println(Arrays.toString(numbersArray01));
        System.out.println("-------------------");

        /*Esse método nao é tao indicado pois numberArrays02 e numbersList02 ficam lincados, e nao é possivel
        * adicionar na arrayList*/
        Integer[] numbersArray02 = {1,2,3};
        List<Integer> numbersList02 = Arrays.asList(numbersArray02);
        System.out.println(Arrays.toString(numbersArray02));
        System.out.println(numbersList02);
        System.out.println("-------------------");

        /*Para ter autonomia melhor devemos usar o método abaixo, agora nao afeta o original*/
        List<Integer> numbersList03 =  new ArrayList<>(Arrays.asList(numbersArray02));
        System.out.println(numbersList03);

        /*Um jeito mais simples seria criar uma arrayList asList direto*/
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*Para o Java9 temos mas imples ainda que é List.of();*/
        List<Integer> integers1 = List.of(1, 2, 3);
        List<String> letters = List.of("A", "B", "C");



    }
}
