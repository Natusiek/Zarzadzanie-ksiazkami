package library.presentation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import library.structure.LibraryFactory;
import library.structure.LibraryRepository;
import library.structure.models.Author;
import library.structure.models.Book;

public class LibraryPage extends JFrame {

  private final LibraryRepository repository;
  private final LibraryFactory factory;

  private JTextArea displayArea;
  private JTextField searchField;

  public LibraryPage(LibraryRepository repository, LibraryFactory factory) {
    this.factory = factory;
    this.repository = repository;
    setupUI();
  }

  private void setupUI() {
    setTitle("Biblioteka");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    displayArea = new JTextArea();
    displayArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(displayArea);
    add(scrollPane, BorderLayout.CENTER);

    JPanel controlPanel = new JPanel();
    add(controlPanel, BorderLayout.NORTH);

    JButton addButton = new JButton("Dodaj ksiazke");
    JButton removeButton = new JButton("Usun ksiazke");
    JButton searchButton = new JButton("Wyszukaj");
    JButton sortTitleButton = new JButton("Sortuj po tytule");
    JButton sortAuthorButton = new JButton("Sortuj po Autorze");
    JButton sortGenreButton = new JButton("Sortuj po gatunku");

    searchField = new JTextField(20);

    controlPanel.add(new JLabel("Wyszukaj:"));
    controlPanel.add(searchField);
    controlPanel.add(searchButton);
    controlPanel.add(addButton);
    controlPanel.add(removeButton);
    controlPanel.add(sortTitleButton);
    controlPanel.add(sortAuthorButton);
    controlPanel.add(sortGenreButton);

    addButton.addActionListener(e -> addBook());

    removeButton.addActionListener(e -> removeBook());

    searchButton.addActionListener(e -> searchBooks());

    sortTitleButton.addActionListener(e -> sortBooksByTitle());

    sortAuthorButton.addActionListener(e -> sortBooksByAuthor());

    sortGenreButton.addActionListener(e -> sortBooksByGenre());

    displayBooks(repository.getAllBooks());
  }

  private void displayBooks(List<Book> books) {
    displayArea.setText("");
    if (books.isEmpty()) {
      displayArea.append("         Nie odnaleziono żadnych ksiązek");
    }
    for (Book book : books) {
      displayArea.append(book.toString() + "\n");
    }
  }

  private void addBook() {
    String title = JOptionPane.showInputDialog(this, "Podaj tytuł ksiązki:");
    String authorName = JOptionPane.showInputDialog(this, "Poddaj autora ksiązki:");
    String year = JOptionPane.showInputDialog(this, "Poddaj rok napisania ksiazki:");
    String genre = JOptionPane.showInputDialog(this, "Poddaj typ ksiązki");

    final Author author = new Author(authorName, 10, "2000-11-12");
    final Book book = new Book(title, genre, year, author);

    factory.registerBook(book);
    displayBooks(repository.getAllBooks());
  }

  private void removeBook() {
    String title = JOptionPane.showInputDialog(this, "Podaj tytuł ksiązki:");
    Book bookToRemove = repository.getAllBooks().stream()
        .filter(book -> book.title().equalsIgnoreCase(title))
        .findFirst()
        .orElse(null);

    if (bookToRemove != null) {
      factory.unregisterBook(bookToRemove);
      displayBooks(repository.getAllBooks());
    } else {
      JOptionPane.showMessageDialog(this, "Nie odnalazeniono ksiazki");
    }
  }

  private void searchBooks() {
    String regex = searchField.getText();
    List<Book> result = repository.findBooksByText(regex);
    displayBooks(result);
  }

  private void sortBooksByTitle() {
    repository.sortBooks();
    displayBooks(repository.getAllBooks());
  }

  private void sortBooksByAuthor() {
    repository.sortBooksByAuthor();
    displayBooks(repository.getAllBooks());
  }


  private void sortBooksByGenre() {
    repository.sortBooksByGenre();
    displayBooks(repository.getAllBooks());
  }

  public void visible() {
    SwingUtilities.invokeLater(() -> setVisible(true));
  }

}
