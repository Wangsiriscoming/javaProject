package project.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.dao.BookDao;
import project.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
