package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import project.config.SpringConfig;
import project.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)  //设定类运行器（SpringJUnit4ClassRunner.class ->Spring整合Junit的专用类运行器）
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }

}
