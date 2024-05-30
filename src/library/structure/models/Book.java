package library.structure.models;

public record Book(
    String title,
    Author author,
    String genre,
    int publicationYear
) {

}
