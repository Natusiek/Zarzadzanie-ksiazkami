package library;

import library.presentation.LibraryPage;
import library.structure.LibraryConfiguration;
import library.structure.LibraryFactory;
import library.structure.LibraryRepository;

public class Library {

  private LibraryPage libraryPage;

  private LibraryConfiguration libraryConfiguration;
  private LibraryRepository libraryRepository;
  private LibraryFactory libraryFactory;


  public void start() {
    this.libraryConfiguration = new LibraryConfiguration();
    this.libraryRepository = new LibraryRepository(this.libraryConfiguration);
    this.libraryFactory = new LibraryFactory(this.libraryConfiguration);

    this.libraryPage = new LibraryPage(this.libraryRepository, this.libraryFactory);
    this.libraryPage.visible();
  }

}
