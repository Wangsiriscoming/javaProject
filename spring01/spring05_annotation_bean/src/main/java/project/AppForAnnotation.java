package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.springConfig;
import project.dao.BookDao;
import project.service.BookService;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        ctx.close(); //关闭容器
    }
}
