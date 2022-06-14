package intermediate.Ccolecoes.test.AList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>();
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        mangas.add("Cavaleiros do Zodiacos");
        mangas.add("YoYoHasho");
        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);

        System.out.println("----------------");
        List<Double> values = new ArrayList<>();
        values.add(100.25);
        values.add(48.98);
        values.add(26.97);
        values.add(300.87);
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
    }
}
