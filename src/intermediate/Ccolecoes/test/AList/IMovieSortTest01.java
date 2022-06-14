package intermediate.Ccolecoes.test.AList;

import intermediate.Ccolecoes.domain.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MovieByTitleComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

public class IMovieSortTest01 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1245L, "Matrix", 1.7));
        movies.add(new Movie(5156L, "Alice", 2.4));
        movies.add(new Movie(3244L, "Titanic", 3.6));
        movies.add(new Movie(2322L, "Missão Impossível", 1.5));
        movies.add(new Movie(1353L, "Interstellar", 2.7));
        for(Movie movie : movies){
            System.out.println(movie);
        }

        System.out.println("--------------------");
        Collections.sort(movies);
        for(Movie movie : movies){
            System.out.println(movie);
        }


        System.out.println("--------------------");
        Collections.sort(movies, new MovieByTitleComparator());
        for(Movie movie : movies){
            System.out.println(movie);
        }


    }
}
