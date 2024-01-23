package week7Library;

import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    private final List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books = books;
    }

    public Optional<Book> checkAvaliabilityByTitle(String title) {
        return books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst();
    }
    public Optional<Book> getBookByAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equals(author))
                .findFirst();
    }
    public void updateStatus(String title, boolean status){
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> new Book(book.title(), book.author(), book.publication_year(), book.status()));
    }
    Optional<Book> bookFound(){
        if(bookFound().isPresent()){
            return getBookByAuthor("");
        }
        else{
            System.out.println("We don't have that book");
        }
        return null;
    }


}
