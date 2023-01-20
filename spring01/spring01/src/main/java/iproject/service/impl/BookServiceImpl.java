package iproject.service.impl;

import iproject.dao.BookDao;
import iproject.dao.impl.BookDaoImpl;
import iproject.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //5.使用new的方式创建dao对象会增加耦合性，因此不可取
    //private BookDao bookDao = new BookDaoImpl();

    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    //6.提供bookDao对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("book project.dao set...");
        this.bookDao = bookDao;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init...");   //初始化方法在set方法后执行
    }
}
