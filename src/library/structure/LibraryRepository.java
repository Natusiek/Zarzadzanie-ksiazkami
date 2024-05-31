package library.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import library.structure.models.Book;

public class LibraryRepository {

  private final LibraryConfiguration configuration;

  public LibraryRepository(LibraryConfiguration configuration) {
    this.configuration = configuration;
  }

  public ArrayList<Book> getAllBooks() {
    return configuration.books;
  }

  public List<Book> findBooksByText(String text) {
    final Pattern pattern = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
    return configuration.books.stream()
        .filter(book ->
            pattern.matcher(book.title()).find() ||
            pattern.matcher(book.author().displayName()).find() ||
            pattern.matcher(book.genre()).find()
        ).toList();
  }

  public List<Book> getBookByGenre(String genre) {
    return configuration.books.stream()
        .filter(book -> book.genre().equals(genre))
        .toList();
  }


  public void sortBooksByAuthor() {
    configuration.books.sort((b1, b2) -> b1.author().displayName().compareToIgnoreCase(b2.author().displayName()));
  }

  public void sortBooks() {
    configuration.books.sort((b1, b2) -> b1.title().compareToIgnoreCase(b2.title()));
  }

  public void sortBooksByGenre() {
    configuration.books.sort((b1, b2) -> b1.genre().compareToIgnoreCase(b2.genre()));
  }

}
