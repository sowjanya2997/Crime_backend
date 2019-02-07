package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import daos.BookDao;
import daos.FakeBookDao;
import models.Book;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

public class BooksController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(BooksController.class);

    final BookDao bookDao;

    @Inject
    public BooksController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    public Result createBook() {

        final JsonNode json = request().body().asJson();

        final Book book = Json.fromJson(json, Book.class);

        LOGGER.debug("Book title = " + book.getTitle());
        LOGGER.error("This is an error");

        if (null == book.getTitle()) {
            return badRequest("Title must be provided");
        }

        final Book newBook = bookDao.create(book);

        final JsonNode result = Json.toJson(newBook);
        return ok(result);
    }

    @Transactional
    public Result getBookById(Integer id) {

        if (null == id) {
            return badRequest("Id must be provided");
        }

        final Optional<Book> book = bookDao.read(id);
        if (book.isPresent()) {
            final JsonNode result = Json.toJson(book.get());
            return ok(result);
        } else {
            return notFound();
        }

    }

    @Transactional
    public Result updateBookById(Integer id) {

        if (null == id) {
            return badRequest("Id must be provided");
        }

        final JsonNode json = request().body().asJson();
        final Book newBook = Json.fromJson(json, Book.class);

        newBook.setId(id);

        final Book updatedBook = bookDao.update(newBook);

        final JsonNode result = Json.toJson(updatedBook);
        return ok(result);
    }

    @Transactional
    public Result deleteBookById(Integer id) {

        if (null == id) {
            return badRequest("Id must be provided");
        }

        final Book book = bookDao.delete(id);

        final JsonNode result = Json.toJson(book);
        return ok(result);
    }

    @Transactional
    public Result getAllBooks() {

        Collection<Book> books = bookDao.all();

        final JsonNode result = Json.toJson(books);
        return ok(result);
    }

}









