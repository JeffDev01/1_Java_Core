package intermediate.Ioptional.test;

import intermediate.Ioptional.domain.Movie;
import intermediate.Ioptional.repositoty.MovieRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Movie> movieByTitle = MovieRepository.findByTitle("GOT");
        movieByTitle.ifPresent(m -> m.setTitle("Game od Thrones"));
        System.out.println(movieByTitle);

        Movie movie = MovieRepository.findByID(2).orElseThrow(IllegalArgumentException::new);

    }
}
