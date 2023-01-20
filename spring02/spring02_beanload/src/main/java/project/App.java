package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import project.config.SpringConfig;
import project.config.SpringMvcConfig;
import project.controller.UserController;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));   //若排除器生效，则该controller无法被拿到，说明UserController没有被注入到容器中

    }
}
