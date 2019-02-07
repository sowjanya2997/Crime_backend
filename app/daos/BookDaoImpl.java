package daos;

import models.Book;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class BookDaoImpl implements BookDao {

    final JPAApi jpaApi;

    @Inject
    public BookDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public Book create(Book book) {

        if (null == book) {
            throw new IllegalArgumentException("Book must be provided");
        }

        jpaApi.em().persist(book);
        return book;
    }

    public Optional<Book> read(Integer id) {

        if (null == id) {
            throw new IllegalArgumentException("Id must be provided");
        }

        final Book book = jpaApi.em().find(Book.class, id);
        return book != null ? Optional.of(book) : Optional.empty();
    }

    public Book update(Book book) {

        if (null == book) {
            throw new IllegalArgumentException("Book must be provided");
        }

        if (null == book.getId()) {
            throw new IllegalArgumentException("Book id must be provided");
        }

        final Book existingBook = jpaApi.em().find(Book.class, book.getId());
        if (null == existingBook) {
            return null;
        }

        existingBook.setTitle(book.getTitle());

        jpaApi.em().persist(existingBook);

        return existingBook;
    }

    public Book delete(Integer id) {

        if (null == id) {
            throw new IllegalArgumentException("Book id must be provided");
        }

        final Book existingBook = jpaApi.em().find(Book.class, id);
        if (null == existingBook) {
            return null;
        }

        jpaApi.em().remove(existingBook);

        return existingBook;
    }

    public Collection<Book> all() {

        TypedQuery<Book> query = jpaApi.em().createQuery("SELECT b FROM Book b", Book.class);
        List<Book> books = query.getResultList();

        return books;
    }

}
