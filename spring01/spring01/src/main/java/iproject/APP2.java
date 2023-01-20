package iproject;

import iproject.dao.BookDao;
import iproject.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP2 {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao1");
        BookService bookService1 = (BookService) ctx.getBean("bookService1");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao1");

//        bookDao1.save();
//        bookService1.save();

        System.out.println(bookDao1);  //修改xml中的配置scope，达到修改为多例模式
        System.out.println(bookDao2);

    }
}
