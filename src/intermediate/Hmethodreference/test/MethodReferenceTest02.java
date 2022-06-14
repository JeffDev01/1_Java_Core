package intermediate.Hmethodreference.test;


import intermediate.Hmethodreference.domain.Book;
import intermediate.Hmethodreference.service.BookComparators;

import java.util.ArrayList;
import java.util.List;

//Reference para uma instace method of a particular object
public class MethodReferenceTest02 {

    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>(List.of(new Book("Bible", 1300), new Book("Hunger Games", 540),
                new Book("Codigo D'Vinte", 650)));

        BookComparators bookComparators = new BookComparators();
        booksList.sort(bookComparators::compareByPagsNonStatic);
        booksList.sort((a1, a2)-> bookComparators.compareByPagsNonStatic(a1,a2));//MESMA COISA

        System.out.println(booksList);

    }
}
