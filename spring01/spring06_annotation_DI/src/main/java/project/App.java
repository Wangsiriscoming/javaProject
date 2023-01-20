package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.SpringConfig;
import project.service.BookService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
