package iproject;

import iproject.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIAutoware {
    public static void main(String[] args) {
        //依赖注入自动装配
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
