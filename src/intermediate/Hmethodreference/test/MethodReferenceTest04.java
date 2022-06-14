package intermediate.Hmethodreference.test;

import intermediate.Hmethodreference.domain.Book;
import intermediate.Hmethodreference.service.BookComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    //REFERENCE TO A CONSTROCTOR
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>(List.of(new Book("Bible", 1300), new Book("Hunger Games", 540),
                new Book("Codigo D'Vinte", 650)));

        Supplier<BookComparators> bookComparatorsSupplier = () -> new BookComparators();
        Supplier<BookComparators> bookComparatorsSupplier2 = BookComparators::new;
        BookComparators bookComparators = bookComparatorsSupplier.get();
        booksList.sort(bookComparators::compareByPagsNonStatic);
        System.out.println(booksList);

        BiFunction<String, Integer, Book> bookBiFunction = (title, pags)-> new Book(title, pags);
        System.out.println(bookBiFunction.apply("Hoje", 120));

    }
}
