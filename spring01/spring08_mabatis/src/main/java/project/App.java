package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.SpringConfig;
import project.domain.Account;
import project.service.AccountService;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        System.out.println(accountService.findAll());

    }
}
