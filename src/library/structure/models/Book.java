package library.structure.models;

public record Book(
    String title,
    String genre,
    String publicationYear,
    Author author
) {

  @Override
  public String toString() {
    return "\"" + title + "\" | Autor: " + author.displayName() + " | Typ: " + genre + " | Rok wydania ("+publicationYear+")";
  }
}
