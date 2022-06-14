package intermediate.Ccolecoes.test.BSet;

import intermediate.Ccolecoes.domain.Movie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JSetTest01 {
    public static void main(String[] args) {
//        Set<Movie> movies = new HashSet<>();/*Nao manter a ordem de inserção e nao duplica valores.*/
        Set<Movie> movies = new LinkedHashSet<>(); /*Mantem a ordem de inserção*/
        movies.add(new Movie(1245L, "Matrix", 1.7));
        movies.add(new Movie(5156L, "Alice", 2.4));
        movies.add(new Movie(3244L, "Titanic", 3.6));
        movies.add(new Movie(2322L, "Missão Impossível", 1.5));
        movies.add(new Movie(1353L, "Interstellar", 2.7));
        movies.add(new Movie(13543L, "Interstellar", 2.7));

        for(Movie movie : movies){
            System.out.println(movie);
        }
    }
}
