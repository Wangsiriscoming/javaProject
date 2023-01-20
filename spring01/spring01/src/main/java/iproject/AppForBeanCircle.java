package iproject;

import iproject.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForBeanCircle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao1");
        bookDao.save();
        ctx.close();   //容器在关闭前会执行destroy()【bean销毁】
    }
}
