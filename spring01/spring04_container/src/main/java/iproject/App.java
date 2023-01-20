package iproject;


import iproject.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEA\\worksapce\\spring\\spring01\\spring04_container\\src\\main\\resources\\applicationContext.xml");

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
    }
}
