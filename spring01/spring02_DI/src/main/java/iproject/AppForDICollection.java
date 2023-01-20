package iproject;

import iproject.dao.CarDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarDao carDao = (CarDao) ctx.getBean("carDao");
        carDao.save();
    }
}
