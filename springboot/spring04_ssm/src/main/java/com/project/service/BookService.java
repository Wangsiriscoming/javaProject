package com.project.service;



import com.project.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    //保存
    public boolean save(Book book);

    //修改
    public boolean update(Book book);

    //按id删除
    public boolean delete(Integer id);

    //按id查找
    public Book getById(Integer id);

    //查找全部
    public List<Book> getAll();

}
