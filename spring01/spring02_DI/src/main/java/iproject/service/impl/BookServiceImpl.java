package iproject.service.impl;

import iproject.dao.BookDao;
import iproject.dao.UserDao;
import iproject.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("bookservice save..");
        bookDao.save();
        userDao.save();
    }
}
