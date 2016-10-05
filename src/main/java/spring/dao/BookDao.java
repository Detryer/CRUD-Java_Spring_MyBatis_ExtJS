package spring.dao;

import spring.model.Book;
import java.util.List;

public interface BookDao {

    void createBook(Book book);
    void updateBook(Book book);
    List<Book> listBooks();
    void removeBook(Book book);
}