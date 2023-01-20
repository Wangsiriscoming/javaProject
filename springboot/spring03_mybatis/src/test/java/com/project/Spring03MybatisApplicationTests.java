package com.project;

import com.project.dao.BookDao;
import com.project.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring03MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

}
