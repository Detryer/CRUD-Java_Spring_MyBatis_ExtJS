package spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.mapper.BookMapper;
import spring.model.Book;

@Repository
public class BookDaoImpl implements BookDao {


    @Autowired
    BookMapper bookMapper;

    @Override
    public void createBook(Book book) {
    }

    @Override
    public void removeBook(Book book) {
    }

    @Override
    public List<Book> listBooks() {
        return bookMapper.listBooks();
    }

    @Override
    public void updateBook(Book book) {

    }
}