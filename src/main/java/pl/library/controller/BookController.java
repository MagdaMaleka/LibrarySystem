package pl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.library.domain.Book;
import pl.library.helper.BookImpl;

import java.util.List;
import java.io.IOException;

@RestController
public class BookController {

    @Value("${app.header.book}")
    private String title;

   @Autowired
    private BookImpl book;

    @GetMapping("/books")
    public ModelAndView ListBooks(ModelAndView model) throws IOException {
        List<Book> listBooks = book.findAll();
        model.addObject("listBooks", listBooks);
        model.addObject("title", title);
        model.setViewName("book");

        return model;
    }
}
