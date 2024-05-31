package library.structure;

import java.util.ArrayList;
import java.util.Arrays;
import library.structure.models.Author;
import library.structure.models.Book;

public class LibraryConfiguration {

  ArrayList<Book> books = new ArrayList<>(Arrays.asList(
      new Book(
          "The Hobbit",
          "FANTASY",
          "1937",
          new Author("J.R.R. Tolkien", 81, "1892-01-03")
      ),
      new Book("The Adventures of Sherlock Holmes", "CRIME", "1892", new Author("Arthur Conan Doyle", 71, "1859-05-22")),
      new Book("Pride and Prejudice", "ROMANCE", "1813", new Author("Jane Austen", 41, "1775-12-16")),
      new Book("The Old Man and the Sea", "ADVENTURE", "1952", new Author("Ernest Hemingway", 61, "1899-07-21")),
      new Book("Dracula", "HORROR", "1897", new Author("Bram Stoker", 64, "1847-11-08")),
      new Book("The Diary of a Young Girl", "BIOGRAPHY", "1947", new Author("Anne Frank", 15, "1929-06-12")),
      new Book("Lonesome Dove", "WESTERN", "1985", new Author("Larry McMurtry", 84, "1936-06-03")),
      new Book("Harry Potter and the Sorcerer's Stone", "FANTASY", "1997", new Author("J.K. Rowling", 58, "1965-07-31")),
      new Book("The Tell-Tale Heart", "HORROR", "1843", new Author("Edgar Allan Poe", 40, "1809-01-19")),
      new Book("Murder on the Orient Express", "CRIME", "1934", new Author("Agatha Christie", 85, "1890-09-15")),
      new Book("Gone with the Wind", "ROMANCE", "1936", new Author("Margaret Mitchell", 48, "1900-11-08")),
      new Book("The Call of the Wild", "ADVENTURE", "1903", new Author("Jack London", 40, "1876-01-12")),
      new Book("The Wonderful Wizard of Oz", "FAIRY_TALE", "1900", new Author("L. Frank Baum", 62, "1856-05-15")),
      new Book("A Game of Thrones", "FANTASY", "1996", new Author("George R.R. Martin", 75, "1948-09-20")),
      new Book("The Shining", "HORROR", "1977", new Author("Stephen King", 76, "1947-09-21")),
      new Book("To Kill a Mockingbird", "CRIME", "1960", new Author("Harper Lee", 89, "1926-04-28")),
      new Book("Wuthering Heights", "ROMANCE", "1847", new Author("Emily Brontë", 30, "1818-07-30")),
      new Book("Treasure Island", "ADVENTURE", "1883", new Author("Robert Louis Stevenson", 44, "1850-11-13")),
      new Book("Anne of Green Gables", "FAIRY_TALE", "1908", new Author("L.M. Montgomery", 67, "1874-11-30")),
      new Book("The Dark Tower: The Gunslinger", "WESTERN", "1982", new Author("Stephen King", 76, "1947-09-21")),
      new Book("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "FANTASY", "1950", new Author("C.S. Lewis", 64, "1898-11-29")),
      new Book("Frankenstein", "HORROR", "1818", new Author("Mary Shelley", 53, "1797-08-30")),
      new Book("The Silence of the Lambs", "CRIME", "1988", new Author("Thomas Harris", 83, "1940-09-22")),
      new Book("Jane Eyre", "ROMANCE", "1847", new Author("Charlotte Brontë", 38, "1816-04-21")),
      new Book("Moby-Dick", "ADVENTURE", "1851", new Author("Herman Melville", 72, "1819-08-01")),
      new Book("The Secret Garden", "FAIRY_TALE", "1911", new Author("Frances Hodgson Burnett", 74, "1849-11-24")),
      new Book("Blood Meridian", "WESTERN", "1985", new Author("Cormac McCarthy", 89, "1933-07-20")),
      new Book("The Lord of the Rings: The Fellowship of the Ring", "FANTASY", "1954", new Author("J.R.R. Tolkien", 81, "1892-01-03")),
      new Book("Rebecca", "HORROR", "1938", new Author("Daphne du Maurier", 81, "1907-05-13")),
      new Book("Sherlock Holmes: The Hound of the Baskervilles", "CRIME", "1902", new Author("Arthur Conan Doyle", 71, "1859-05-22"))
  ));
}
