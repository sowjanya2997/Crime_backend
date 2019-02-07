package daos;

import models.Book;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class FakeBookDao implements BookDao {

    final Book fakeBook = new Book(1, "Fake book");

    public Book create(Book book) {
        return fakeBook;
    }

    public Optional<Book> read(Integer id) {
        return Optional.of(fakeBook);
    }

    public Book update(Book book) {
        return fakeBook;
    }

    public Book delete(Integer id) {
        return fakeBook;
    }

    @Override
    public Collection<Book> getAllUsers() {
        return null;
    }

    public Collection<Book> all() {
        return Arrays.asList(fakeBook);
    }

}


