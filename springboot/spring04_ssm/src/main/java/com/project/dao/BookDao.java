package com.project.dao;

import com.project.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper   //让springboot扫描到此类并生成代理类
public interface BookDao {

    @Insert("insert into tb_look (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tb_look set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);

    @Delete("delete from tb_look where id=#{id}")
    public int delete(Integer id);

    @Select("select * from tb_look where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from tb_look")
    public List<Book> getAll();

}
