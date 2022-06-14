package intermediate.Ioptional.repositoty;

import intermediate.Ioptional.domain.Movie;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MovieRepository {

    private static List<Movie> movies = List.of(new Movie(1, "Interstellar",120),new Movie(2,"GOT", 180),
            new Movie(3, "Gatacca", 150));

    public static Optional<Movie> findByTitle(String title){
        return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Movie> findByID(Integer id){
        return findBy(manga -> manga.getId().equals(id));
    }

    private static Optional<Movie> findBy(Predicate<Movie> predicate){
        Movie found = null;
        for (Movie movie : movies) {
            if(predicate.test(movie)){
                found = movie;
            }
        }
        return Optional.ofNullable(found);
    }

}
