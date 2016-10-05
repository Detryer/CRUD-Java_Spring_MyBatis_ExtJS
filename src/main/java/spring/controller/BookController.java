package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.model.Book;
import spring.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class BookController extends HttpServlet {

    @Autowired
    BookService bookService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/list")
    public Model listBooks(Model model) throws ServletException, IOException {
        List<Book> books = bookService.listBooks();
        model.addAllAttributes(books);
        return model;
    }

    @RequestMapping("/create")
    public void createBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @RequestMapping("/update")
    public void updateBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @RequestMapping("/delete")
    public void deleteBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}