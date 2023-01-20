package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.controller.Code;
import project.dao.BookDao;
import project.domain.Book;
import project.exception.BusinessException;
import project.exception.SystemException;
import project.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        if(id < 0){
            throw new BusinessException(Code.BUSINESS_ERR,"请规范输入！");
        }

        /*//将可能出现的异常进行包装，转换成自定义异常
        try{
            int i = 1/0;  //模拟异常
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时！",e);
        }*/


        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
