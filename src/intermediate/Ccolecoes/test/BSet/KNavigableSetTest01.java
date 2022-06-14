package intermediate.Ccolecoes.test.BSet;

import intermediate.Ccolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphonePriceCompatator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

public class KNavigableSetTest01 {
    public static void main(String[] args) {

        //USANDO NAVIGABLESET PARA SORT CRESCENTE E DECRESCETE

        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphonePriceCompatator());
        smartphones.add(new Smartphone("4567", "LG", 1000.5));
        smartphones.add(new Smartphone("213213", "iPhone", 2505.7));
        smartphones.add(new Smartphone("3213", "Xiaomi", 7484.8));
        smartphones.add(new Smartphone("321", "Motorola", 1542.9));
        for (Smartphone smartphone : smartphones.descendingSet()) {
            System.out.println(smartphone);
        }

        Smartphone s1 = new Smartphone("4125", "Sansumg", 1441.9);
        //lower < que esse objeto
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("-------------------");
        System.out.println(smartphones.lower(s1));
        System.out.println(smartphones.floor(s1));
        System.out.println(smartphones.higher(s1));
        System.out.println(smartphones.ceiling(s1));

    }
}
