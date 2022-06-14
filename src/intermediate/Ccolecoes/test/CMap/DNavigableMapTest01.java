package intermediate.Ccolecoes.test.CMap;

import intermediate.Ccolecoes.domain.Customer;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class CustomerAdressMapComparator implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class DNavigableMapTest01 {
    public static void main(String[] args) {

        /*NavigableMap/TreeMap se assemelham muito com TreeSet, ou seja são necessariamente ordenados mas precisam de
        * Comparable ou Comparator. A unica diferença entre eles é a performance e a relação chave valor.*/

        NavigableMap<String, String> map = new TreeMap<>();
        Customer c1 = new Customer("Lucas");
        Customer c2 = new Customer( "Marcelo");

        NavigableMap<Customer, String> custumerSurname = new TreeMap<>(new CustomerAdressMapComparator());
        custumerSurname.put(c1, "Cotia");
        custumerSurname.put(c2, "Osasco");

        for(Map.Entry<Customer, String> customer : custumerSurname.entrySet()){
            System.out.println("Key: "+customer.getKey().getNome()+ "; Value: "+customer.getValue());
        }
        System.out.println("---------------------");

        /*String ja implementa comparable,por isso nao precisei implementar isso para que o TreeSet funcionasse*/
        NavigableMap<String, String> alphabetMap = new TreeMap<>();
        alphabetMap.put("A", "1");
        alphabetMap.put("D", "4");
        alphabetMap.put("B", "2");
        alphabetMap.put("E", "5");
        alphabetMap.put("C", "3");
        for(Map.Entry<String, String> letter : alphabetMap.entrySet()){
            System.out.println(letter.getKey()+" : "+letter.getValue());
        }
        System.out.println("-------------------");

        /*Metodos que retornam objetos em relação aposição de ordenação dentro da lista */
        //RETORNA VALORES MENORES OU IGUAL A ESTE
        System.out.println(alphabetMap.headMap("C", true));
        System.out.println(alphabetMap.ceilingKey("C"));
        System.out.println(alphabetMap.higherKey("C"));
        System.out.println(alphabetMap.floorKey("C"));
        System.out.println(alphabetMap.lowerKey("C"));


    }
}
