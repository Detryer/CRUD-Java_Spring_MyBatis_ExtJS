package spring.mapper;

import spring.model.Book;

import java.util.List;

public interface BookMapper {
    boolean addBook(Book book);

    void updateBook(Book book);

    Book getBookById(Integer bookId);

    boolean deleteBook(Integer bookId);

    List<Book> listBooks();
}
