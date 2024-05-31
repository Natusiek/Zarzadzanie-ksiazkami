package library.structure;

import library.structure.models.Book;

public class LibraryFactory {

  private final LibraryConfiguration libraryConfiguration;


  public LibraryFactory(LibraryConfiguration libraryConfiguration) {
    this.libraryConfiguration = libraryConfiguration;
  }

  public void registerBook(Book book) {
    libraryConfiguration.books.add(book);
  }

  public void unregisterBook(Book book) {
    libraryConfiguration.books.remove(book);
  }

}
