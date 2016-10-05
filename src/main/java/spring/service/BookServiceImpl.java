package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.dao.BookDao;
import spring.model.Book;

import java.util.List;

@Component
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> listBooks(){
        return bookDao.listBooks();
    }
}