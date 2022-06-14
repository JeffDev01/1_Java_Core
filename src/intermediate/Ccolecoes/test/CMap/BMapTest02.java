package intermediate.Ccolecoes.test.CMap;

import intermediate.Ccolecoes.domain.Customer;
import intermediate.Ccolecoes.domain.Movie;

import java.util.HashMap;
import java.util.Map;

public class BMapTest02 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Rodrigo");
        Customer customer2 = new Customer("Marcio");

        Movie m1 = new Movie(1245L, "Matrix", 1.7);
        Movie m2 = new Movie(5156L, "Alice", 2.4);
        Movie m3 = new Movie(3244L, "Titanic", 3.6);
        Movie m4 = new Movie(2322L, "Missão Impossível", 1.5);

        Map<Customer, Movie>  customerMovieMap = new HashMap<>();
        customerMovieMap.put(customer1, m1);
        customerMovieMap.put(customer2, m4);

        for(Map.Entry<Customer, Movie> entry : customerMovieMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " : "+entry.getValue().getTitle());
        }

    }
}
