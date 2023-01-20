package iproject;

import iproject.dao.BookDao;
import iproject.factory.BookDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFactory {
    public static void main(String[] args) {
        //通过静态工厂创建对象
        /*BookDao bookDao = BookDaoFactory.getBookDao();
        bookDao.save();*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
