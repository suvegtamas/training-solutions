package iofilestest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @TempDir
    public Path folder;

    Library library = new Library();

    @Test
    void createLibraryTest() throws IOException {
        Path file = Files.createFile(folder.resolve("test.txt"));
        Library library = new Library();
        Book b1 = new Book("William Faulkner","Absalom, Absalom!");
        Book b2= new Book("Ah, Wilderness!","Eugene O'Neill");
        library.add(b1);
        library.add(b2);
        library.saveBooks(Path.of("src/main/resources/books.dat"));
        List<Book> results = library.loadBooks(Path.of("src/main/resources/books.dat"));

        assertEquals(library.getBooks().get(0).getAuthor(),results.get(0).getAuthor());
        assertEquals(library.getBooks().get(1).getTitle(),results.get(1).getTitle());
    }



}