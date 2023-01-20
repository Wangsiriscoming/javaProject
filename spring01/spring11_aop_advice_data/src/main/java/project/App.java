package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.SpringConfig;
import project.dao.BookDao;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(100,"wangsir");
        System.out.println(name);
    }
}
