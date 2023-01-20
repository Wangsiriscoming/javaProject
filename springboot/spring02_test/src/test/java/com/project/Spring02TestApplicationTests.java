package com.project;

import com.project.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest   //自动装配了运行器
class Spring02TestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    //void contextLoads() {   //这个名称是可以根据测试代码块名自定义的
    public void save() {
        bookService.save();
    }

}
