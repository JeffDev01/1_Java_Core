package intermediate.Jstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DStreamTest04 {

    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Carlos", "Marcelo", "Bruno", "Pedro");

        List<String> collect = names.stream()
                .map(m -> m.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
