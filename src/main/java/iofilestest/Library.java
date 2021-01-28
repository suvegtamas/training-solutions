package iofilestest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }
    public void saveBooks(Path path) {
        try(PrintStream os = new PrintStream(Files.newOutputStream(path))){
            for(Book b : books) {
                os.println(b.getAuthor()+ "-" + b.getTitle());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!",e);
        }
    }
    public List<Book> loadBooks(Path path) {
        List<Book> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(path)))) {
            String line;
            while((line=br.readLine()) != null) {
                String[] parts = line.split("-");
                Book b = new Book(parts[0],parts[1]);
                result.add(b);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return result;
    }

    public List<Book> getBooks() {
        return books;
    }
}
