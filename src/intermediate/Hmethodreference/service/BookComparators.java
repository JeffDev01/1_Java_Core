package intermediate.Hmethodreference.service;

import intermediate.Hmethodreference.domain.Book;

public class BookComparators {
    public static int compareByTitle(Book b1, Book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }

    public static int compareByPags(Book b1, Book b2){
        return b1.getPags().compareTo(b2.getPags());
    }

    public  int compareByPagsNonStatic(Book b1, Book b2){
        return b1.getPags().compareTo(b2.getPags());
    }
}
