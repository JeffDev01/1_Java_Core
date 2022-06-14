package intermediate.Glambdaexpressions.test;


import intermediate.Glambdaexpressions.domain.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ALambdaPredicateTest01 {

    private static List<Movie> movieList = List.of(new Movie("Titanic",120), new Movie("Interstellar",120),
            new Movie("Gatacca", 180), new Movie("BladeRunner", 150));

    public static void main(String[] args) {
      /*  List<Movie> movieByTime = filter(movieList, new Predicate<Movie>() {
            @Override
            public boolean test(Movie movie) {
                return movie.getDuraton()<=120;
            }
        });      */
        List<Movie> movieByTime = filter(movieList, (Movie m) -> m.getDuraton()<=120);

        System.out.println(movieByTime);

    }

        //NÃO PARAMETRIZADO
/*    private static List<Movie> filter(List<Movie> movies, MoviePredicate moviePredicate){
        List<Movie> filteredMovies = new ArrayList<>();
        for(Movie movie :movies){
            if(moviePredicate.test(movie)){
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }*/

    //PARAMETRIZADO
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List <T> filtered = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filtered.add(e);
            }
        }
        return filtered;
    }


}
