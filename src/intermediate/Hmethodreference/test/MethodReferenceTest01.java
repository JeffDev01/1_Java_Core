package intermediate.Hmethodreference.test;

import intermediate.Hmethodreference.domain.Book;
import intermediate.Hmethodreference.service.BookComparators;

import java.util.ArrayList;
import java.util.List;



public class MethodReferenceTest01 {

    public static void main(String[] args) {

        List<Book> booksList = new ArrayList<>(List.of(new Book("Bible", 1300), new Book("Hunger Games", 540),
                new Book("Codigo D'Vinte", 650)));

        /*Em vez de criar uma InnerClass podemos fazer uma classe anonima de Comparator usando Lambda pra fazer sort da list*/

//        booksList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        booksList.sort(BookComparators::compareByTitle);
        booksList.sort(BookComparators::compareByPags);



        System.out.println(booksList);




    }
}
