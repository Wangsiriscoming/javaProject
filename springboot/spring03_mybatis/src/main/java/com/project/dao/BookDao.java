package com.project.dao;

import com.project.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper   //加上该注解可自动生成一个对应的代理类
public interface BookDao {

    @Select("select * from tb_look where id =#{id}")
    public Book getById(Integer id);
}
