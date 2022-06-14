package intermediate.Ccolecoes.test.AList;

import intermediate.Ccolecoes.domain.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CIteratorTest01 {
    public static void main(String[] args) {

        //REMOVER OBJETOS DENTRO DE UMA LISTA USANDO UM CONDICIONAL COM ITERATOR
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1245L, "Matrix", 1.7, 0));
        movies.add(new Movie(5156L, "Alice", 2.4,3));
        movies.add(new Movie(3244L, "Titanic", 3.6,4));
        movies.add(new Movie(2322L, "Missão Impossível", 1.5,2));
        movies.add(new Movie(1353L, "Interstellar", 2.7,0));

        Iterator<Movie> moviesIterator = movies.iterator();
        while(moviesIterator.hasNext()){
            Movie movie = moviesIterator.next();

            if(movie.getQuantity()==0){
                moviesIterator.remove();
            }
        }
        System.out.println(movies);

        //USANDO PROGRAMAÇÃO FUNCIONAL
        /*Usa o Iterator atras das cenas*/
        movies.removeIf(movie -> movie.getQuantity()==0);

    }
}
