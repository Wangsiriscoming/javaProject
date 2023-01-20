package iproject;

import iproject.service.BookService;
import iproject.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
