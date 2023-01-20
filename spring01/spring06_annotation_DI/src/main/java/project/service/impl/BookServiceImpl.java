package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import project.dao.BookDao;
import project.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired  //自动装配
    @Qualifier("bookDao2")  //有多个相同类型的bean，使用此注解可以指定装配
    private BookDao bookDao;

    //Autowired注解自动装配基于反射设计创建对象并暴力反射对应属性为私有属性初始化数据，因此无需提供setter方法
    /*public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }*/

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
