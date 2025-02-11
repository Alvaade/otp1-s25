import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
    Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    @DisplayName("Add a book to the library")
    void addBook() {
        library.addBook("Book1");
        ArrayList<String> books = library.listBooks();
        assertEquals(1, books.size());
        assertEquals("Book1", books.getFirst());
    }

    @Test
    @DisplayName("Remove a book from the library")
    void removeBook() {
        library.addBook("Book1");
        library.addBook("Book2");
        library.removeBook("Book1");
        ArrayList<String> books = library.listBooks();
        assertEquals(1, books.size());
        assertEquals("Book2", books.getFirst());
    }

    @Test
    @DisplayName("List all books in the library")
    void listBooks() {
        library.addBook("Book1");
        library.addBook("Book2");
        ArrayList<String> books = library.listBooks();
        assertEquals(2, books.size());
        assertEquals("Book1", books.getFirst());
        assertEquals("Book2", books.getLast());
    }
}