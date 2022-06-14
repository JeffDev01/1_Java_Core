package intermediate.Glambdaexpressions.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CLambdaFunctionTest01 {
    public static void main(String[] args) {
       List<String> namesList = List.of("Lucas", "Ricardo", "Marcelo", "João", "Fernando");

        List<Integer> integers = map(namesList, (String s) -> s.length());
        List<String> stringsUpperCase = map(namesList, (String s) -> s.toUpperCase());

        System.out.println(integers);
        System.out.println(stringsUpperCase);


    }

    private static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;

    }
}
