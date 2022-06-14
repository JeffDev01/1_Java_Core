package intermediate.Ccolecoes.test.AList;

import intermediate.Ccolecoes.domain.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GBinarySearchTest02 {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1245L, "Matrix", 1.7));
        movies.add(new Movie(5156L, "Alice", 2.4));
        movies.add(new Movie(3244L, "Titanic", 3.6));
        movies.add(new Movie(2322L, "Missão Impossível", 1.5));
        movies.add(new Movie(1353L, "Interstellar", 2.7));

        MovieByTitleComparator movieByTitleComparator = new MovieByTitleComparator();

        movies.sort(movieByTitleComparator);
        for(Movie movie : movies){
            System.out.println(movie);
        }

        Movie m1 = new Movie(2322L, "Missão Impossível", 2.0);
        System.out.println(Collections.binarySearch(movies, m1, movieByTitleComparator));
    }
}
